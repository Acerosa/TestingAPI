package com.sparta.rr.POJOTests;

import com.sparta.rr.JackReaders;
import com.sparta.rr.POJO.RickAndMortyLocationPOJO;
import com.sparta.rr.POJO.RickAndMortyPOJOEpisode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RickAndMortyTestEpisodePOJO {

        String path =  "https://rickandmortyapi.com/api/episode/28";
        JackReaders jackReader = new JackReaders();
        Logger logger =  LogManager.getLogger(com.sparta.rr.POJOTests.RickAndMortyTestCharacterPOJO.class);
        RickAndMortyPOJOEpisode rickAndMortyPOJOEpisode = jackReader.readRickAndMortyEpisodeReader(path);
        @Test
        void testRickAndMortyPOJOEpisodeAirDate(){
            logger.info( rickAndMortyPOJOEpisode.getAirDate());
            assertEquals(rickAndMortyPOJOEpisode.getAirDate(), rickAndMortyPOJOEpisode.getAirDate());
        }
        @Test
        void testRickAndMortyPOJOEpisodeCharacters(){
            logger.info(rickAndMortyPOJOEpisode.getCharacters());
            assertEquals(rickAndMortyPOJOEpisode.getCharacters(), rickAndMortyPOJOEpisode.getCharacters());
        }

        @Test
        void testRickAndMortyPOJOEpisodeCreated(){
            logger.info(rickAndMortyPOJOEpisode.getCreated());
            assertEquals(rickAndMortyPOJOEpisode.getCreated(),rickAndMortyPOJOEpisode.getCreated());
        }

        @Test
        void testRickAndMortyPOJOEpisodeName(){
            logger.info(rickAndMortyPOJOEpisode.getName());
            assertEquals(rickAndMortyPOJOEpisode.getName(),rickAndMortyPOJOEpisode.getName());
        }

        @Test
        void testRickAndMortyPOJOEpisodeID(){
            logger.info(rickAndMortyPOJOEpisode.getId());
            assertEquals(rickAndMortyPOJOEpisode.getId(),rickAndMortyPOJOEpisode.getId());
        }

        @Test
        void testRickAndMortyPOJOEpisodeEpisode(){
            logger.info(rickAndMortyPOJOEpisode.getEpisode());
            assertEquals(rickAndMortyPOJOEpisode.getEpisode(),rickAndMortyPOJOEpisode.getEpisode());
        }

        @Test
        void testRickAndMortyCharacterPOJOUrl(){
            logger.info(rickAndMortyPOJOEpisode.getUrl());
            assertEquals(rickAndMortyPOJOEpisode.getUrl(),rickAndMortyPOJOEpisode.getUrl());
        }


}




