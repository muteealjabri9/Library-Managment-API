package com.moteadev.Library_Management_API.users.dto;

public class UserRegisterRequestBody extends BaseUserRequestBody{



    private String fullName;
    private String phone;

    public UserRegisterRequestBody(String email, String password, String fullName, String phone) {
        super(email, password);
        this.fullName = fullName;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
