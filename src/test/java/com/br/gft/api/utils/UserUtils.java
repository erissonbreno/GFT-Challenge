package com.br.gft.api.utils;

import com.br.gft.api.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserUtils {
    public static Map<String, String> toFormParams(User user) {
        Map<String, String> formParams = new HashMap<>();
        formParams.put("name", user.getName());
        formParams.put("email", user.getEmail());
        formParams.put("password", user.getPassword());
        formParams.put("firstname", user.getFirstname());
        formParams.put("lastname", user.getLastname());
        formParams.put("address1", user.getAddress1());
        formParams.put("country", user.getCountry());
        formParams.put("state", user.getState());
        formParams.put("city", user.getCity());
        formParams.put("zipcode", user.getZipcode());
        formParams.put("mobile_number", user.getMobile_number());
        return formParams;
    }
}
