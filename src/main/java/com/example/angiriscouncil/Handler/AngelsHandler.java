package com.example.angiriscouncil.Handler;

import com.example.angiriscouncil.DTO.AngelsDTO;
import com.example.angiriscouncil.Model.Angels;
import com.example.angiriscouncil.Repository.AngelsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AngelsHandler {
    @Autowired
    AngelsRepository AngelsRepository;


    // THIS IS FOR THE NIKOLA TO LOOK AT ---- BOOOOY
    //    public ModelMapper modelMapper() {
//        return new ModelMapper();
//    }
//
//
////    private AngelsDTO convertToDto(AngelsDTO angels) {
////        AngelsDTO angelsDTO = modelMapper().map(angels, AngelsDTO.class);
////        angelsDTO.setAllegiance(angels.getAllegiance());
////                angelsDTO.setElement(angels.getElement());
////                angelsDTO.setKills(angels.getKills());
////                angelsDTO.setWeapon(angels.getWeapon());
////                angelsDTO.setReincarnations(angels.getReincarnations());
////
////        return angelsDTO;
////
////    }

    public ArrayList<Angels> getAll() {

        return AngelsRepository.getAll();
    }

    public Angels getAngel(int id) {
        return AngelsRepository.getAngel(id).get(id-1);

    }

    public void createAngel(Angels angel) {
        AngelsRepository.save(angel);
    }

    public void updateAngels(AngelsDTO angelsDTO) {
        Angels angels = this.getAngel(angelsDTO.getID());

        if (    angelsDTO.getWeapon() != null
                || angelsDTO.getElement() !=null
                || angelsDTO.getReincarnations() > 0
                || angelsDTO.getAllegiance() != null
                || angelsDTO.getKills() > angels.getKills()) {

            angels.setWeapon(angelsDTO.getWeapon());
            angels.setElement(angelsDTO.getElement());
            angels.setReincarnations(angelsDTO.getReincarnations());
            angels.setAllegiance(angelsDTO.getAllegiance());
            angels.setKills(angelsDTO.getKills());

            AngelsRepository.save(angels);
        }

    }
//
//    public void updateMultipleAngels(AngelsDTO angelsDTO) {
//
//        ArrayList<Angels> angels = AngelsRepository.getAll();
//            AngelsRepository.save()
//        }
//

    public void deleteAngel ( int id){
        AngelsRepository.delete(this.getAngel(id));
    }
}

