
package com.sparta.rr;

import java.util.List;


public class RickAndMortyLocationPOJO {

    private String Created;

    private String Dimension;

    private Long Id;

    private String Name;

    private List<Object> Residents;

    private String Type;

    private String Url;

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public String getDimension() {
        return Dimension;
    }

    public void setDimension(String dimension) {
        Dimension = dimension;
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

    public List<Object> getResidents() {
        return Residents;
    }

    public void setResidents(List<Object> residents) {
        Residents = residents;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

}
