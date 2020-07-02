package com.sparta.rr.DTOs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class HeadersDTO {

    String url = "https://rickandmortyapi.com/api/character/?page=2";
    URL theUrl;
    URLConnection urlConnection;

    {
        try {
            theUrl = new URL(url);
            urlConnection = theUrl.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection)theUrl.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean checkHeaders(){
        Collection<List<String>> values = urlConnection.getHeaderFields().values();
         Object[] arrayHeaders = values.toArray();

        for (Object arrayHeader : arrayHeaders) {
            for (List<String> value : values) {
                value.equals(arrayHeader.toString());
                return true;
            }
        }
        return false;
        }

}



