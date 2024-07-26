package com.br.gft.api.tests;

import com.br.gft.api.requests.UserRequest;
import io.restassured.response.Response;
import org.junit.Test;

import static org.apache.http.HttpStatus.SC_NOT_FOUND;

public class ErrorApiTest {

    @Test
    public void validateInvalidEndpointReturn404() {
        Response response = UserRequest.noRouteEndpoint();

        response.then()
                .log().body()
                .assertThat()
                .statusCode(SC_NOT_FOUND);
    }
}
