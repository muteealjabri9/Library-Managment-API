package com.moteadev.Library_Management_API.users.data;

import com.moteadev.Library_Management_API.users.model.UserModel;

import java.util.List;

public interface UserRepository {

    public boolean registerNewUser(UserModel userModel);
    public boolean login(String email,String password);
    public List<UserModel> getAllUsers();
}
