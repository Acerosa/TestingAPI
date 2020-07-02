package com.sparta.rr.POJOTests;

import com.sparta.rr.JackReaders;
import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RickAndMortyTestCharacterPOJO {

    JackReaders jackReader = new JackReaders();
    Logger logger =  LogManager.getLogger(RickAndMortyTestCharacterPOJO.class);
    RickAndMortyCharacterPOJO characterPOJO = new RickAndMortyCharacterPOJO();
    String path =  "https://rickandmortyapi.com/api/character/2";
    RickAndMortyCharacterPOJO rickAndMortyCharacterPOJO = jackReader.readRickAndMortyCharacterReader(path);
    @Test
    void testRickAndMortyCharacterPOJOStatus(){
       // RickAndMortyInterface rickAndMortyInterface = jackReader.classChoice(2);
        logger.info(rickAndMortyCharacterPOJO.getStatus());
        assertEquals("Alive", rickAndMortyCharacterPOJO.getStatus() );
    }
}
