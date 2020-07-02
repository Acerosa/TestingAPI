
package com.sparta.rr.POJO;

import com.sparta.rr.RickAndMortyInterface;

import java.util.List;

public class RickAndMortyPOJOEpisode implements RickAndMortyInterface {

    private String AirDate;

    private List<String> Characters;

    private String Created;

    private String Episode;

    private Long Id;

    private String Name;

    private String Url;

    public String getAirDate() {
        return AirDate;
    }

    public void setAirDate(String airDate) {
        AirDate = airDate;
    }

    public List<String> getCharacters() {
        return Characters;
    }

    public void setCharacters(List<String> characters) {
        Characters = characters;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public String getEpisode() {
        return Episode;
    }

    public void setEpisode(String episode) {
        Episode = episode;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

}
