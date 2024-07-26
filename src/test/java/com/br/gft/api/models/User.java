package com.br.gft.api.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String name;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String address1;
    private String country;
    private String state;
    private String city;
    private String zipcode;
    private String mobile_number;
}
