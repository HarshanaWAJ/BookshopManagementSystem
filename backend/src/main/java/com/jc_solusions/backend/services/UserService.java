package com.jc_solusions.backend.services;

import com.jc_solusions.backend.models.User;

import java.util.List;

public interface UserService {

    //Register as User
    public User saveUser(User user);

    //Get User List
    public List<User> getAllUsers();
}
