package com.moteadev.Library_Management_API.users.rest;

import com.moteadev.Library_Management_API.users.dto.LoginUserRequestBody;
import com.moteadev.Library_Management_API.users.dto.UserRegisterRequestBody;
import com.moteadev.Library_Management_API.users.model.UserModel;
import com.moteadev.Library_Management_API.users.service.UserService;
import com.moteadev.Library_Management_API.util.response.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersRestController {

    private final UserService service;

    @Autowired
    public UsersRestController(UserService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public ResponseUtil<Boolean> login(@RequestBody  LoginUserRequestBody loginUserRequestBody){
        boolean isLoginDone=service.login(loginUserRequestBody);

        return  new ResponseUtil<Boolean>(isLoginDone,isLoginDone?"Login Done":"Login Failed",isLoginDone);
    }
    @PostMapping("/register")
    public ResponseUtil<Boolean> register(@RequestBody UserRegisterRequestBody userRegisterRequestBody){
        boolean registerNewUser=service.registerNewUser(userRegisterRequestBody);

        return  new ResponseUtil<Boolean>(registerNewUser,registerNewUser?"Register Done":
                "Register Failed",registerNewUser);
    }

    @GetMapping("/allUsers")
    public ResponseUtil<List<UserModel>> getAllUsers(){
        List<UserModel> userModelList=service.getAllUsers();

        return  new ResponseUtil<List<UserModel>>(!userModelList.isEmpty(),
                userModelList.isEmpty()?"No Users":
                "Users is "+userModelList.size(),userModelList);
    }

}
