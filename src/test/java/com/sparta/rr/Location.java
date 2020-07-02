
package com.sparta.rr;

public class Location implements RickAndMortyInterface{

    private String Name;

    private String Url;

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
