package com.br.gft.api.tests;

import com.br.gft.api.requests.ProductRequest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ProductApiTest {

    @Test
    public void validateGetProducts() {
        Response response = ProductRequest.getProducts();
        JsonPath jsonResponse = response.jsonPath();

        response.then()
                .log().body()
                .assertThat()
                .statusCode(SC_OK);

        assertThat(jsonResponse.getList("products").size(), greaterThan(0));
        assertEquals("Blue Top", jsonResponse.get("products[0].name"));
        assertEquals("Rs. 400", jsonResponse.get("products.find { it.name == 'Men Tshirt' }.price"));
    }

    @Test
    public void validatePostProducts() {
        Response response = ProductRequest.postProductsList();
        JsonPath jsonResponse = response.jsonPath();

        response.then()
                .log().body()
                .assertThat()
                .statusCode(SC_OK);

        assertEquals("This request method is not supported.", jsonResponse.get("message"));
    }
}
