package com.jc_solusions.backend.controllers;

import com.jc_solusions.backend.models.User;
import com.jc_solusions.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add-user")
    public String addUser(@RequestBody User user){

        try {
            userService.saveUser(user);
            return "Registered as an new user";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "error with register new user"+e;
        }

    }

    @GetMapping("/get-all-users")
    public List<User> getAllUsers() {
        try {
            return userService.getAllUsers();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
