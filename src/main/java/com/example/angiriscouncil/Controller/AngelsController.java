package com.example.angiriscouncil.Controller;

import com.example.angiriscouncil.DTO.AngelsDTO;
import com.example.angiriscouncil.Handler.AngelsHandler;
import com.example.angiriscouncil.Model.Angels;

import com.example.angiriscouncil.Repository.AngelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping(value = "/angels")
public class AngelsController {

    private
    AngelsHandler AngelsHandler;

    @Autowired AngelsController(AngelsHandler AngelsHandler){
        this.AngelsHandler = AngelsHandler;
    }


    @RequestMapping(value = "/", method = GET)
    public ResponseEntity<ArrayList<Angels>> getAllAngels(){
        return new ResponseEntity<>(AngelsHandler.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity createAngel(@RequestBody Angels angel){
        AngelsHandler.createAngel(angel);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = GET)
    public ResponseEntity<ArrayList<Angels>> getAngelByID(@PathVariable(value = "id") int id){
       return new ResponseEntity(AngelsHandler.getAngel(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = PATCH)
    public ResponseEntity<Angels>  updateAngelsByID(@RequestBody AngelsDTO angelsDTO[]){
        AngelsHandler.updateAngels(angelsDTO[1]);
        return new ResponseEntity(angelsDTO, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/", method = PATCH)
    public ResponseEntity<Angels>  updateMultipleAngels(@RequestBody AngelsDTO angelsDTO){
        AngelsHandler.updateAngels(angelsDTO);
        return new ResponseEntity(angelsDTO, HttpStatus.ACCEPTED);
    }


    @RequestMapping(value = "/{id}",method = DELETE)
    public ResponseEntity<Angels> deleteAngelByID(@PathVariable(value = "id") int id){
        AngelsHandler.deleteAngel(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
