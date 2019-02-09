package com.exiles.exiles.Controller;

import com.exiles.exiles.DTO.ExileDTO;
import com.exiles.exiles.Models.Exile;
import com.exiles.exiles.Repo.ExilesRepo;
import org.bson.types.ObjectId;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping(value = "/exiles")
public class RoutingController {

    private final ApplicationContext ctx =
            new AnnotationConfigApplicationContext(ExilesRepo.class);
    private final MongoOperations repo =
            (MongoOperations) ctx.getBean("mongoTemplate"); //default mongo


    // GET /exiles ALL
    @RequestMapping(value = "/", method = GET)
    public ResponseEntity<List<Exile>> getAllExiles(){
        List<Exile> exiles = repo.findAll(Exile.class);

        return ResponseEntity.status(200).body(exiles); // return OK + body
    }

    // POST new exile
    @RequestMapping(value = "/", method = POST)
    public ResponseEntity createExile(@RequestBody Exile exile){
        try {
            exile.set_id(new ObjectId()); //add id to object
            exile.getAbilities().get(0).set_id(new ObjectId()); //always get the first element from the abilities array as we are posting one object
            repo.save(exile);

            return ResponseEntity.status(201).body(exile);
        }
        catch (Exception e){

            return ResponseEntity.status(400).body("The fuck u doin"); // eyyyy
        }
    }
    // PATCH existing exile
    @RequestMapping(value = "/update/{id}+{abilitiesID)", method = PATCH)
    public ResponseEntity updateExile(@PathVariable(value = "id") String id, @PathVariable(value ="abilitiesID") String abilitiesID){
        ObjectId objectId = new ObjectId(id);

        repo.updateFirst(
                Query.query(Criteria.where("_id").is(id).and("abilities._id").is(abilitiesID)),
                new Update().set("abilities.$.ability", "updated" ),
                Exile.class);

        return ResponseEntity.status(200).body(id + "was updated successfully");
    }

    // GET exile by id
    @RequestMapping(value = "/{id}", method = GET)
    public ResponseEntity<Exile> getExileByID(@PathVariable(value = "id") String id){
        ObjectId objectId = new ObjectId(id);

        Query search = new Query(); //create query to find object by id
        search.addCriteria(Criteria.where("_id").is(objectId));

        Exile result = repo.findOne(search, Exile.class); //get that boi

        return ResponseEntity.status(200).body(result);

    }
    // PATCH Exile props without abilities array
    @RequestMapping(value = "/{id}", method = PATCH)
    public ResponseEntity updateExile(@RequestBody ExileDTO exileDTO, @PathVariable(value = "id") String id){
        ObjectId objectId = new ObjectId(id);

        Query search = new Query();
        search.addCriteria(Criteria.where("_id").is(objectId)); // find object by id

        Update update = new Update();
        update.set("archetype", exileDTO.getArchetype());
        update.set("ascendancy", exileDTO.getAscendancy());
        update.set("damage", exileDTO.getDamage());
        update.set("health", exileDTO.getHealth());
        update.set("kills", exileDTO.getKills());
        update.set("deaths", exileDTO.getDeaths());

        FindAndModifyOptions findAndModifyOptions = new FindAndModifyOptions().returnNew(true); //we use this in order to return the updated object not the old one as
                                                                                                //that's the way mongo handles patches :P
        Exile updatedExile = repo.findAndModify(search, update, findAndModifyOptions, Exile.class); // find && update object

        return ResponseEntity.status(200).body(updatedExile); //return updated object

    }

    // DELETE exile by id
    @RequestMapping(value = "/{id}", method = DELETE)
    public ResponseEntity<Exile> deleteExile(@PathVariable(value = "id") String id){
        ObjectId objectId = new ObjectId(id);

        Query search = new Query();
        search.addCriteria(Criteria.where("_id").is(objectId)); // find object

        Exile removed = repo.findAndRemove(search, Exile.class); //find && delete

        return ResponseEntity.status(200).body(removed);
    }
}
