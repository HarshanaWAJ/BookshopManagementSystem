package com.example.backend.controllers;

import com.example.backend.dto.UserDTO;
import com.example.backend.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    //Create Object for User Services
    @Autowired
    private UserServices userServices;

    //get method - TO GET THE DATA FROM THE DATABASE
    @GetMapping(value = "/get-user")
    public List<UserDTO> getUsers(){
        return userServices.getAllUsers();
    }

    //Save User Data
    @PostMapping(value = "/save-user")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        //--Call User Service
        return userServices.saveUser(userDTO);
    }

    //Update User Data
    @PutMapping(value = "/update-user")
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userServices.updateUser(userDTO);
    }

    //Delete User Data
    @DeleteMapping(value = "/delete-user")
    public boolean deleteUser(@RequestBody UserDTO userDTO) {
        return userServices.deleteUser(userDTO);
    }
}
