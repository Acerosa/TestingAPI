package com.sparta.rr.DTOs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.stream.JsonReader;
import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;

import java.io.IOException;

public class DataValidation {

    RickAndMortyCharacterPOJO rickAndMortyCharacterPOJO = new RickAndMortyCharacterPOJO();





    public boolean checkForString(String name){
       return name.matches("[a-zA-Z ]+");
    }



    public boolean checkUrl(String url){
        return url.matches("[\"\\\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]/]+");
    }
}
