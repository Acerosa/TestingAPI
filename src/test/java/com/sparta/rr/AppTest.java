package com.sparta.rr;


import com.sparta.rr.DTOs.HeadersDTO;
import com.sparta.rr.DTOs.RickAndMortyCharacterDTO;
import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    HeadersDTO headersDTO = new HeadersDTO();
    String url = "https://rickandmortyapi.com/api/character/2";
    URL theUrl;
    URLConnection urlConnection;

    JackReaders jackReader = new JackReaders();
    RickAndMortyCharacterPOJO rickAndMortyPOJO = jackReader.readRickAndMortyCharacterReader(url);
    RickAndMortyCharacterDTO rickAndMortyCharacterDTO = new RickAndMortyCharacterDTO();


    @Test
    public void testRickAndMortyAPI() {
        given()
                .when()
                .request("GET", url)
                .then()
                .statusCode(200);

        JSONReader jsonReader = new JSONReader();
    }

    @Test
    void testRickAndMortyCharacterName() {
        assertTrue(headersDTO.checkHeaders());
    }

}
