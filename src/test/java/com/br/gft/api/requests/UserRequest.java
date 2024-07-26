package com.br.gft.api.requests;

import com.br.gft.api.models.User;
import com.br.gft.api.utils.UserUtils;
import io.restassured.response.Response;
import org.apache.http.entity.ContentType;

import java.util.HashMap;
import java.util.Map;

import static com.br.gft.api.endpoints.Endpoints.*;
import static com.br.gft.api.utils.UserUtils.toFormParams;
import static io.restassured.RestAssured.given;

public class UserRequest {

    public static Response createUser(User user) {
        Map<String, String> formParams = toFormParams(user);

        return given()
                .baseUri(BASE_URL)
                .log().all()
                .contentType(String.valueOf(ContentType.APPLICATION_FORM_URLENCODED))
                .formParams(formParams)
                .when()
                .post(CREATE_ACCOUNT);
    }

    public static Response noRouteEndpoint() {
        return given()
                .baseUri(BASE_URL)
                .log().all()
                .when()
                .post(INVALID_ENDPOINT);
    }
}
