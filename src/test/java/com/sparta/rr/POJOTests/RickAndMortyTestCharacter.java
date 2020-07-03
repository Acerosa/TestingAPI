package com.sparta.rr.POJOTests;

import com.sparta.rr.DTOs.DataValidation;
import com.sparta.rr.JackReaders;
import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RickAndMortyTestCharacter {

    String path =  "https://rickandmortyapi.com/api/character/1";
    JackReaders jackReader = new JackReaders();
    Logger logger =  LogManager.getLogger(RickAndMortyTestCharacter.class);
   // RickAndMortyCharacterPOJO characterPOJO = new RickAndMortyCharacterPOJO();
    DataValidation dataValidation = new DataValidation();
    RickAndMortyCharacterPOJO characterPOJO = jackReader.readRickAndMortyCharacterReader(path);
    @Test
    void testRickAndMortyCharacterPOJOStatus(){
        logger.info(characterPOJO.getStatus());
        assertEquals(characterPOJO.getStatus(), characterPOJO.getStatus());
    }
    @Test
    void testRickAndMortyCharacterPOJOName(){
        logger.info(characterPOJO.getName());
        assertEquals(characterPOJO.getName(), characterPOJO.getName());
    }

    @Test
    void testRickAndMortyCharacterPOJOGender(){
        logger.info(characterPOJO.getGender());
        assertEquals(characterPOJO.getGender(),characterPOJO.getGender());
    }

    @Test
    void testRickAndMortyCharacterPOJOImage(){
        logger.info(characterPOJO.getImage());
        assertEquals(characterPOJO.getImage(),characterPOJO.getImage());
    }

    @Test
    void testRickAndMortyCharacterPOJOSpecies(){
        logger.info(characterPOJO.getSpecies());
        assertEquals(characterPOJO.getSpecies(),characterPOJO.getSpecies());
    }

    @Test
    void testRickAndMortyCharacterPOJOType(){
        logger.info(characterPOJO.getType());
        assertEquals(characterPOJO.getType(),characterPOJO.getType());
    }

    @Test
    void testRickAndMortyCharacterPOJOUrl(){
        logger.info(characterPOJO.getUrl());
        assertEquals(characterPOJO.getUrl(),characterPOJO.getUrl());
    }


}
