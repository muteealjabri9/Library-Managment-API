package com.moteadev.Library_Management_API.users.service;

import com.moteadev.Library_Management_API.users.data.UserRepository;
import com.moteadev.Library_Management_API.users.dto.BaseUserRequestBody;
import com.moteadev.Library_Management_API.users.dto.LoginUserRequestBody;
import com.moteadev.Library_Management_API.users.dto.UserRegisterRequestBody;
import com.moteadev.Library_Management_API.users.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(BaseUserRequestBody baseUserRequestBody){
        return userRepository.login(baseUserRequestBody.getEmail(),
                baseUserRequestBody.getPassword());
    }
    public boolean registerNewUser(UserRegisterRequestBody userRegisterRequestBody){
        UserModel userModel=new UserModel(
             userRegisterRequestBody.getEmail(),
             userRegisterRequestBody.getPassword(),
             userRegisterRequestBody.getFullName(),
             userRegisterRequestBody.getPhone()
        );
        return userRepository.registerNewUser(userModel);
    }
    public List<UserModel> getAllUsers(){
        return userRepository.getAllUsers();
    }
}
