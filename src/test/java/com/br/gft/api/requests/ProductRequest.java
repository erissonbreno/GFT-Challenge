package com.br.gft.api.requests;

import com.br.gft.api.endpoints.Endpoints;
import io.restassured.response.Response;

import static com.br.gft.api.endpoints.Endpoints.BASE_URL;
import static com.br.gft.api.endpoints.Endpoints.PRODUCTS_LIST;
import static io.restassured.RestAssured.given;

public class ProductRequest {

    public static Response getProducts() {
        return given()
                .log().all()
                .baseUri(BASE_URL)
                .when()
                .get(PRODUCTS_LIST);
    }

    public static Response postProductsList() {
        return given()
                .log().all()
                .baseUri(BASE_URL)
                .when()
                .post(PRODUCTS_LIST);
    }
}
