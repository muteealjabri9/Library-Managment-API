package com.moteadev.Library_Management_API.users.data.mock;

import com.moteadev.Library_Management_API.users.data.UserRepository;
import com.moteadev.Library_Management_API.users.model.UserModel;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component

public class MockDataSource implements UserRepository {

    private List<UserModel>userModelList;


    // adding data after bean created
    @PostConstruct
    public void init(){
        userModelList=new ArrayList<>();
        userModelList.add(new UserModel("email1@gmail.com","12345","Ahmed","0000"));
        userModelList.add(new UserModel("email2@gmail.com","12345","Motea","0000"));
    }

    @Override
    public boolean registerNewUser(UserModel userModel) {
        List<UserModel> filteredList=userModelList.stream().filter(model ->
                Objects.equals(model.getEmail(), userModel.getEmail())).toList();
        if(!filteredList.isEmpty()){
            return  false;
        }
        userModelList.add(userModel);
        return true;
    }

    @Override
    public boolean login(String email, String password) {
        List<UserModel> filteredList=userModelList.stream().filter(userModel ->
                Objects.equals(userModel.getEmail(), email)
                        && Objects.equals(userModel.getPassword(), password)).toList();

        return !filteredList.isEmpty();
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userModelList;
    }
}
