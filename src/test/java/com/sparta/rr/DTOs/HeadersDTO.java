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

   public Collection<List<String>> values;
    Object[] arrayHeaders;

    public void creatConnectio(){
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
    }
    public URLConnection getUrlConnection() {
        return urlConnection;
    }

    public int returnHeadersCount(){
        return urlConnection.getHeaderFields().size();
        }
    public boolean checkHeaders(){
            return values.containsAll(Arrays.asList(arrayHeaders));
        }

    public String testKeepAlive(){
      return getUrlConnection().getHeaderField("keep-alive");
    }

    public String testKeepMISS(){
        return getUrlConnection().getHeaderField("MISS");
    }
}



