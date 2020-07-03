package com.sparta.rr.DTOs;

import com.sparta.rr.JackReaders;
import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;

public class CharacterDTO {
    String path =  "https://rickandmortyapi.com/api/character/1";
    JackReaders jackReader = new JackReaders();
    RickAndMortyCharacterPOJO characterPOJO = jackReader.readRickAndMortyCharacterReader(path);

    public String checkTheValeu(String value){
        if (!value.isEmpty()){
            return value;
        }
        return null;
    }

    public RickAndMortyCharacterPOJO getCharacterPOJO() {
        return characterPOJO;
    }
}
