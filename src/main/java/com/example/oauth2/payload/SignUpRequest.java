package com.example.oauth2.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class SignUpRequest {

    @NotBlank
    private String nama;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
