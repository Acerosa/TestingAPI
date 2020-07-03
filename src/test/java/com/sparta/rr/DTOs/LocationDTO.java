package com.sparta.rr.DTOs;
import com.sparta.rr.JackReaders;
import com.sparta.rr.POJO.RickAndMortyLocationPOJO;

public class LocationDTO {

    String path =  "https://rickandmortyapi.com/api/location/3";
    JackReaders jackReader = new JackReaders();
    RickAndMortyLocationPOJO locationPOJO = jackReader.readRickAndMortyLocationReader(path);

    public String checkTheValeu(String value){
        if (!value.isEmpty()){
            return value;
        }
        return null;
    }

    public RickAndMortyLocationPOJO getLocationPOJO() {
        return locationPOJO;
    }
}
