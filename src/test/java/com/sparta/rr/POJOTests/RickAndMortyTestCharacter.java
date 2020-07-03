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

    Logger logger =  LogManager.getLogger(RickAndMortyTestCharacter.class);

    CharacterDTO characterDTO = new CharacterDTO();

    @Test
    void testRickAndMortyCharacterPOJOStatus(){
        logger.info(characterDTO.getCharacterPOJO().getStatus());
        assertEquals("Alive", characterDTO.checkTheValeu(characterDTO.getCharacterPOJO().getStatus()));
    }

    @Test
    void testRickAndMortyCharacterPOJOName(){
        logger.info(characterDTO.getCharacterPOJO().getName());
        assertEquals("Rick Sanchez", characterDTO.checkTheValeu(characterDTO.getCharacterPOJO().getName()));
    }

}
