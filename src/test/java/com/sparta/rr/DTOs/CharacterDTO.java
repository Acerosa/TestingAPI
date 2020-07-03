package com.sparta.rr.DTOs;

import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;

public class CharacterDTO {

    RickAndMortyCharacterPOJO rickAndMortyCharacterPOJO = new RickAndMortyCharacterPOJO();
    public String checkTheName(){
        if (!rickAndMortyCharacterPOJO.getName().isEmpty()){
            return rickAndMortyCharacterPOJO.getName();
        }
        return null;
    }
}
