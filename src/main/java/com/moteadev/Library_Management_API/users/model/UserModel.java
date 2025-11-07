package com.moteadev.Library_Management_API.users.model;

import java.util.Objects;
import java.util.UUID;

public class UserModel {
    private String id;
    private String email;
    private String fullName;
    private String phone;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserModel(String email,String password, String fullName, String phone) {
        this.id= UUID.randomUUID().toString();
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if (obj == null || getClass() != obj.getClass()) return false;
        UserModel userModel=(UserModel) obj;
        return Objects.equals(this.email, userModel.getEmail());
    }

    public UserModel(String id, String email, String password, String fullName, String phone) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
    }

    public UserModel() {
    }
}
