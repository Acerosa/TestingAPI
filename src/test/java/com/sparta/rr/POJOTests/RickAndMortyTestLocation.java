package com.sparta.rr.POJOTests;
import com.sparta.rr.DTOs.LocationDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RickAndMortyTestLocation {
        Logger logger =  LogManager.getLogger(RickAndMortyTestLocation.class);
        LocationDTO locationDTO = new LocationDTO();
        @Test
        void testRickAndMortyLocationPOJOCreated(){
            logger.info(locationDTO.getLocationPOJO().getCreated());
            assertEquals("2017-11-10T13:08:13.191Z", locationDTO.checkTheValeu(locationDTO.getLocationPOJO().getCreated()));
        }
        @Test
        void testRickAndMortyLocationPOJODimension(){
            logger.info(locationDTO.getLocationPOJO().getDimension());
            assertEquals("unknown", locationDTO.checkTheValeu(locationDTO.getLocationPOJO().getDimension()));
        }


}


