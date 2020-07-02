package com.sparta.rr.POJOTests;

import com.sparta.rr.DTOs.RickAndMortyCharacterDTO;
import com.sparta.rr.JackReaders;
import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;
import com.sparta.rr.POJO.RickAndMortyLocationPOJO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RickAndMortyTestLocationPOJO {

        String path =  "https://rickandmortyapi.com/api/location/3";
        JackReaders jackReader = new JackReaders();
        Logger logger =  LogManager.getLogger(com.sparta.rr.POJOTests.RickAndMortyTestCharacterPOJO.class);
        RickAndMortyLocationPOJO rickAndMortyLocationPOJO = jackReader.readRickAndMortyLocationReader(path);
        @Test
        void testRickAndMortyLocationPOJOCreated(){
            logger.info(rickAndMortyLocationPOJO.getCreated());
            assertEquals(rickAndMortyLocationPOJO.getCreated(), rickAndMortyLocationPOJO.getCreated());
        }
        @Test
        void testRickAndMortyLocationPOJODimension(){
            logger.info(rickAndMortyLocationPOJO.getDimension());
            assertEquals(rickAndMortyLocationPOJO.getDimension(), rickAndMortyLocationPOJO.getDimension());
        }

        @Test
        void testRickAndMortyLocationPOJOId(){
            logger.info(rickAndMortyLocationPOJO.getId());
            assertEquals(rickAndMortyLocationPOJO.getId(),rickAndMortyLocationPOJO.getId());
        }

        @Test
        void testRickAndMortyLocationPOJOName(){
            logger.info(rickAndMortyLocationPOJO.getName());
            assertEquals(rickAndMortyLocationPOJO.getName(),rickAndMortyLocationPOJO.getName());
        }

        @Test
        void testRickAndMortyLocationPOJOResidents(){
            logger.info(rickAndMortyLocationPOJO.getResidents());
            assertEquals(rickAndMortyLocationPOJO.getResidents(),rickAndMortyLocationPOJO.getResidents());
        }

        @Test
        void testRickAndMortyCharacterPOJOType(){
            logger.info(rickAndMortyLocationPOJO.getType());
            assertEquals(rickAndMortyLocationPOJO.getType(),rickAndMortyLocationPOJO.getType());
        }

        @Test
        void testRickAndMortyCharacterPOJOUrl(){
            logger.info(rickAndMortyLocationPOJO.getUrl());
            assertEquals(rickAndMortyLocationPOJO.getUrl(),rickAndMortyLocationPOJO.getUrl());
        }


}


