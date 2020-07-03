package com.sparta.rr.DTOs;
import com.sparta.rr.JackReaders;
import com.sparta.rr.POJO.RickAndMortyPOJOEpisode;

public class EpisodeDTO {

    String path =  "https://rickandmortyapi.com/api/episode/28";
    JackReaders jackReader = new JackReaders();
    RickAndMortyPOJOEpisode episodePOJO = jackReader.readRickAndMortyEpisodeReader(path);

    public String checkTheValeu(String value){
        if (!value.isEmpty()){
            return value;
        }
        return null;
    }

    public RickAndMortyPOJOEpisode getEpisodePOJO() {
        return episodePOJO;
    }
}
