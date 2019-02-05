package com.example.angiriscouncil.Mapper;

import com.example.angiriscouncil.DTO.AngelsDTO;
import com.example.angiriscouncil.Model.Angels;
import com.example.angiriscouncil.Repository.AngelsRepository;
import org.modelmapper.ModelMapper;

public class Mapper {

    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
