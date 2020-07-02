package com.sparta.rr.DTOs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.stream.JsonReader;
import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;

import java.io.IOException;

public class RickAndMortyCharacterDTO {

    RickAndMortyCharacterPOJO rickAndMortyCharacterPOJO = new RickAndMortyCharacterPOJO();





    public boolean checkName(String name){
        if(name.getClass().equals(String.class)){
            return true;
        }
       return false;
    }

    public boolean checkGender(String gender){
        if(gender.getClass().equals(String.class)){
            return true;
        }
        return false;
    }
    public boolean checkCreated(String created){
        if(created.getClass().equals(String.class)){
            return true;
        }
        return false;
    }

}
