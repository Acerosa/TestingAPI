package com.sparta.rr.POJOTests;

import com.sparta.rr.DTOs.EpisodeDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RickAndMortyTestEpisode {

    Logger logger =  LogManager.getLogger(RickAndMortyTestEpisode.class);
         EpisodeDTO episodeDTO = new EpisodeDTO();

       @Test
       void testRickAndMortyPOJOEpisodeEpisode(){
            logger.info(episodeDTO.getEpisodePOJO().getName());
           assertEquals("", episodeDTO.checkTheValeu(episodeDTO.getEpisodePOJO().getName()));
     }

     @Test
     void testRickAndMortyCharacterPOJOUrl(){
        logger.info(episodeDTO.getEpisodePOJO().getUrl());
         assertEquals("", episodeDTO.checkTheValeu(episodeDTO.getEpisodePOJO().getUrl()));
     }
}




