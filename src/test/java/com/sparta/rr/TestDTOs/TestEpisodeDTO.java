package com.sparta.rr.TestDTOs;

import com.sparta.rr.DTOs.DataValidation;
import com.sparta.rr.JackReaders;
import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;
import com.sparta.rr.POJO.RickAndMortyPOJOEpisode;
import com.sparta.rr.POJOTests.RickAndMortyTestCharacter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEpisodeDTO {
    String path = "https://rickandmortyapi.com/api/episode/28";
    JackReaders jackReader = new JackReaders();
    Logger logger = LogManager.getLogger(TestEpisodeDTO.class);
    DataValidation dataValidation = new DataValidation();
    RickAndMortyPOJOEpisode episodePOJO = jackReader.readRickAndMortyEpisodeReader(path);

    @Test
    void testRickAndMortyCharacterDTOcheckUrl() {
        logger.info(episodePOJO.getUrl());
        assertTrue((dataValidation.checkUrl(episodePOJO.getUrl())));
    }

    @Test
    void testRickAndMortyCharacterDTOcheckName() {
        logger.info(episodePOJO.getName());
        assertTrue((dataValidation.checkForString((episodePOJO.getName()))));
    }

    @Test
    void testRickAndMortyCharacterDTOcheckEpisode() {
        logger.info(episodePOJO.getEpisode());
        assertTrue((dataValidation.checkForString(episodePOJO.getEpisode())));
    }

    @Test
    void testRickAndMortyCharacterDTOcheckAirDate() {
        logger.info(episodePOJO.getAirDate());
        assertTrue((dataValidation.checkForString(episodePOJO.getAirDate())));
    }
}
