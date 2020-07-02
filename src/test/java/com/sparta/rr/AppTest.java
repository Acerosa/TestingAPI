package com.sparta.rr;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testRickAndMortyAPI() {
        given()
                .when()
                .request("GET", "https://rickandmortyapi.com/api/character/?page=2")
                .then()
                .statusCode(200)
                .assertThat()
                .body("info.count", equalTo(591));
    }
}
