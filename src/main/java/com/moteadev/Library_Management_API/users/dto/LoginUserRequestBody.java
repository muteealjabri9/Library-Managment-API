package com.moteadev.Library_Management_API.users.dto;

public class LoginUserRequestBody extends BaseUserRequestBody{


    public LoginUserRequestBody(String email, String password) {
        super(email, password);
    }
}
