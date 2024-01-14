package com.jc_solusions.backend.services;

import com.jc_solusions.backend.models.User;
import com.jc_solusions.backend.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    public UserRepo userRepo;
    @Override
    public User saveUser(User user) {
        try {
            return userRepo.save(user);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<User> getAllUsers() {
        try {
           return userRepo.findAll();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
