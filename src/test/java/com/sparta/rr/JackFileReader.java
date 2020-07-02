package com.sparta.rr;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class JackFileReader {
    ObjectMapper objectMapper = new ObjectMapper();

    public Class readRickAndMortyJson(String path, RickAndMortyInterface rickClass){

        try {
            rickClass = objectMapper.readValue(new URL(path), rickClass.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rickClass.getClass();
    }
}

