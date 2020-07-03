package com.sparta.rr.TestDTOs;

import com.sparta.rr.DTOs.DataValidation;
import com.sparta.rr.JackReaders;
import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;
import com.sparta.rr.POJOTests.RickAndMortyTestCharacter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCharacterDTO {
    String path =  "https://rickandmortyapi.com/api/character/1";
    JackReaders jackReader = new JackReaders();
    Logger logger =  LogManager.getLogger(TestCharacterDTO.class);
    DataValidation dataValidation = new DataValidation();
    RickAndMortyCharacterPOJO characterPOJO = jackReader.readRickAndMortyCharacterReader(path);

    @Test
    void testRickAndMortyCharacterDTOcheckName(){
        logger.info(characterPOJO.getName());
        assertTrue((dataValidation.checkForString((characterPOJO.getName()))));
    }
}