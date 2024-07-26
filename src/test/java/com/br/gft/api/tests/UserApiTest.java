package com.br.gft.api.tests;

import com.br.gft.api.models.User;
import com.br.gft.api.requests.ProductRequest;
import com.br.gft.api.requests.UserRequest;
import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class UserApiTest {

    Faker faker = new Faker();
    @Test
    public void validateUserCreation() {

        User user = User.builder()
                .name("John")
                .email("Jo@hn.com" + faker.random().nextInt(11111111, 99999999))
                .password("J0hN")
                .firstname("John")
                .lastname("Silva")
                .address1("Rua A")
                .country("USA")
                .state("CA")
                .city("New City")
                .zipcode("12345-789")
                .mobile_number("44512216567")
                .build();

        Response response = UserRequest.createUser(user);
        JsonPath jsonResponse = response.jsonPath();

        response.then()
                .log().body()
                .assertThat()
                .statusCode(SC_OK);

        assertEquals("User created!", jsonResponse.get("message"));
    }
}
