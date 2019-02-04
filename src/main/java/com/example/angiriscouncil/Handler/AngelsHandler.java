package com.example.angiriscouncil.Handler;

import com.example.angiriscouncil.DTO.AngelsDTO;
import com.example.angiriscouncil.Model.Angels;
import com.example.angiriscouncil.Repository.AngelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AngelsHandler {
    @Autowired
    AngelsRepository AngelsRepository;

    public ArrayList<Angels> getAll(){

        return AngelsRepository.getAll();
    }

    public Angels getAngel(int id){
      return AngelsRepository.getAngel(id).get(id);

    }

    public void createAngel(Angels angel){
        AngelsRepository.save(angel);
    }

    public void updateAngels(AngelsDTO angelsDTO){
        Angels angels = this.getAngel(angelsDTO.getID());

        if (angelsDTO.getWeapon() != null){
            angels.setWeapon(angelsDTO.getWeapon());
        }
        if (angelsDTO.getElement() != null){
            angels.setElement(angelsDTO.getElement());
        }
        if (angelsDTO.getAllegiance() != null){
            angels.setAllegiance(angelsDTO.getAllegiance());
        }

        if(angelsDTO.getReincarnations() >= 1){
            angels.setReincarnations(angelsDTO.getReincarnations());
        }

        if (angelsDTO.getKills() >= angels.getKills()){
            angels.setKills(angelsDTO.getKills());
        }

        AngelsRepository.save(angels);

    }

    public void deleteAngel(int id){
        AngelsRepository.delete(this.getAngel(id));
    }


}
