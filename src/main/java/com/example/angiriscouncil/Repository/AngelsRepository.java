package com.example.angiriscouncil.Repository;

import com.example.angiriscouncil.Model.Angels;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface AngelsRepository extends CrudRepository<Angels, Integer> {
    @Query("select angels from Angels angels")
    ArrayList<Angels> getAll();


    @Query(value = "select distinct id,alias,weapon,element,special_ability,allegiance,weakness,health,mana,damage,kills,reincarnations from angels a where a.id=id", nativeQuery = true)
    ArrayList<Angels> getAngel(@Param("id") int id);


}
