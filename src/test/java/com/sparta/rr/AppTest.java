package com.sparta.rr;


import com.sparta.rr.DTOs.HeadersDTO;
import com.sparta.rr.DTOs.DataValidation;
import com.sparta.rr.POJO.RickAndMortyCharacterPOJO;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.net.URLConnection;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    HeadersDTO headersDTO = new HeadersDTO();
    String url = "https://rickandmortyapi.com/api/character/2";
    @Test
    public void testRickAndMortyAPI() {
        given()
                .when()
                .request("GET", url)
                .then()
                .statusCode(200);
    }

  @Test
   void testcheckHeaders() {
       assertTrue( headersDTO.checkHeaders());
   }

   @Test
   void testreturnHeadersCount() {
        assertEquals(14, headersDTO.returnHeadersCount());
   }

}
