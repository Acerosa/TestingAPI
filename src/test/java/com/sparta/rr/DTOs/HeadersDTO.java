package com.sparta.rr.DTOs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class HeadersDTO {

    String url = "https://rickandmortyapi.com/api/character/2";
    URL theUrl;
    URLConnection urlConnection;
    String [] headers = {"HTTP/1.1 200 OK", "Netlify",
            "keep-alive",
            "MISS",
            "Fri, 03 Jul 2020 05:32:24 GMT",
            "W/284c-23079RqPHwviX1ZIU0tE7C1x9GM",
            "public, max-age=86400"
            ,"304e079c-75c9-4c8b-b2c5-08154e7b0168-555600"
            ,"Sat, 04 Jul 2020 05:32:24 GMT"
            ,"10316"
            ,"0"
            ,"Express"
            ,"application/json; charset=utf-8"};

   public Collection<List<String>> values;
    Object[] arrayHeaders;

    {
        try {
            theUrl = new URL(url);
            urlConnection = theUrl.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection)theUrl.openConnection();
            values = urlConnection.getHeaderFields().values();
            arrayHeaders = values.toArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public URLConnection getUrlConnection() {
        return urlConnection;
    }

    //    public boolean checkHeaders() {
//
//        }
        public int returnHeadersCount(){
        return urlConnection.getHeaderFields().size();
        }

        public boolean checkHeaders(){
            return values.containsAll(Arrays.asList(arrayHeaders));
        }

    public boolean checkUrl(String url){
        return url.matches("[\"\\\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]/]+");
    }
}



