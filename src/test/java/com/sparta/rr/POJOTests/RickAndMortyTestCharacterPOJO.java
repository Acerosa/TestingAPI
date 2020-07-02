package com.sparta.rr.POJOTests;

import com.sparta.rr.DTOs.RickAndMortyCharacterDTO;
import com.sparta.rr.JackReaders;
import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RickAndMortyTestCharacterPOJO {

    JackReaders jackReader = new JackReaders();
    Logger logger =  LogManager.getLogger(RickAndMortyTestCharacterPOJO.class);
    RickAndMortyCharacterPOJO characterPOJO = new RickAndMortyCharacterPOJO();
    RickAndMortyCharacterDTO rickAndMortyCharacterDTO = new RickAndMortyCharacterDTO();
    String path =  "https://rickandmortyapi.com/api/character/2";
    RickAndMortyCharacterPOJO rickAndMortyCharacterPOJO = jackReader.readRickAndMortyCharacterReader(path);
    @Test
    void testRickAndMortyCharacterPOJOStatus(){
       // RickAndMortyInterface rickAndMortyInterface = jackReader.classChoice(2);
        logger.info(rickAndMortyCharacterPOJO.getStatus());
        assertEquals(characterPOJO.getStatus(), characterPOJO.getStatus());
    }
    @Test
    void testRickAndMortyCharacterPOJOName(){
        // RickAndMortyInterface rickAndMortyInterface = jackReader.classChoice(2);
        logger.info(rickAndMortyCharacterPOJO.getName());
        assertEquals(rickAndMortyCharacterPOJO.getName(), characterPOJO.getName());
    }

    @Test
    void testRickAndMortyCharacterName(){
        // RickAndMortyInterface rickAndMortyInterface = jackReader.classChoice(2);
        logger.info(rickAndMortyCharacterPOJO.getName());
        //RickAndMortyCharacterDTO rickAndMortyCharacterDTO = new RickAndMortyCharacterDTO();
        assertEquals(true, rickAndMortyCharacterDTO.checkName(rickAndMortyCharacterPOJO.getName()));
    }


}
