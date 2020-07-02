package com.sparta.rr;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;
import com.sparta.rr.POJO.RickAndMortyLocationPOJO;
import com.sparta.rr.POJO.RickAndMortyPOJOEpisode;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class JackReaders {
    ObjectMapper objectMapper = new ObjectMapper();

    public RickAndMortyCharacterPOJO readRickAndMortyCharacterReader(String path){
        RickAndMortyCharacterPOJO rickAndMortyPOJO = new RickAndMortyCharacterPOJO();
        try {
            rickAndMortyPOJO = objectMapper.readValue(new URL(path), RickAndMortyCharacterPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rickAndMortyPOJO;
    }

    public RickAndMortyLocationPOJO readRickAndMortyLocationReader(String path){
        RickAndMortyLocationPOJO rickAndMortyPOJO = new RickAndMortyLocationPOJO();
        try {
            rickAndMortyPOJO = objectMapper.readValue(new URL(path), RickAndMortyLocationPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rickAndMortyPOJO;
    }
    public RickAndMortyPOJOEpisode readRickAndMortyEpisodeReader(String path){
        RickAndMortyPOJOEpisode rickAndMortyPOJO = new RickAndMortyPOJOEpisode();
        try {
            rickAndMortyPOJO = objectMapper.readValue(new URL(path), RickAndMortyPOJOEpisode.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rickAndMortyPOJO;
    }
}

