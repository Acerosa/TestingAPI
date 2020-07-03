package com.sparta.rr.POJOTests;

import com.sparta.rr.DTOs.CharacterDTO;
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
    RickAndMortyCharacterPOJO characterPOJO = jackReader.readRickAndMortyCharacterReader(path);

    @Test
    void testRickAndMortyCharacterPOJOStatus(){
        logger.info(characterPOJO.getStatus());
        assertEquals("HTTP/1.1 200 OK", characterPOJO.getStatus());
    }

    @Test
    void testRickAndMortyCharacterPOJOName(){
        logger.info(characterPOJO.getName());
        assertEquals(characterPOJO.getName(), characterPOJO.checkTheName());
    }

}
