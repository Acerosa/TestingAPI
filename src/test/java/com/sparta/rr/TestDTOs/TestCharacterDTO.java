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
    void testRickAndMortyCharacterDTOcheckUrl(){
        logger.info(characterPOJO.getUrl());
        assertTrue((dataValidation.checkUrl(characterPOJO.getUrl())));
 }

    @Test
    void testRickAndMortyCharacterDTOcheckName(){
        logger.info(characterPOJO.getName());
        assertTrue((dataValidation.checkForString((characterPOJO.getName()))));
    }

    @Test
    void testRickAndMortyCharacterDTOcheckGender(){
        logger.info(characterPOJO.getGender());
        assertTrue((dataValidation.checkForString(characterPOJO.getGender())));
    }

    @Test
    void testRickAndMortyCharacterDTOcheckCreated(){
        logger.info(characterPOJO.getCreated());
        assertTrue((dataValidation.checkForString(characterPOJO.getCreated())));
    }

    @Test
    void testRickAndMortyCharacterDTOcheckSpecies(){
        logger.info(characterPOJO.getSpecies());
        assertTrue((dataValidation.checkForString(characterPOJO.getSpecies())));
    }

}