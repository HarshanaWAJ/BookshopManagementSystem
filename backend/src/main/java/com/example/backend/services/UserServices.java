package com.example.backend.services;

import com.example.backend.dto.UserDTO;
import com.example.backend.entities.User;
import com.example.backend.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.hibernate.HibernateException;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//----//
@Service
@Transactional
public class UserServices {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    //===================================================================================================//
    //Add User to the database
    public UserDTO saveUser(UserDTO userDTO) {
        try {
            userRepo.save(modelMapper.map(userDTO, User.class));
            return userDTO;
        } catch (HibernateException e) {
            e.printStackTrace(); // or use a logging framework
            return null; // Indicate that there was an error
        }
    }

    //==================================================================================================//
    //Get User List from the database
    public List<UserDTO> getAllUsers() {
        try {
            List<User>userList = userRepo.findAll();
            return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
        } catch (HibernateException e) {
            e.printStackTrace(); // or use a logging framework
            return null; // Indicate that there was an error
        }
    }

    //==================================================================================================//
    //Update User
    public UserDTO updateUser(UserDTO userDTO) {
        try {
            userRepo.save(modelMapper.map(userDTO, User.class));
            return userDTO;
        } catch(HibernateException e) {
            e.printStackTrace(); // or use a logging framework
            return null; // Indicate that there was an error
        }
    }

    //====================================================================================================//
    //Delete User
    public boolean deleteUser(UserDTO userDTO) {
        try {
            userRepo.delete(modelMapper.map(userDTO, User.class));
            return true;
        } catch (HibernateException e) {
            e.printStackTrace(); // or use a logging framework
            return false; // Indicate that there was an error
        }
    }

    //UserName and fetch username and password

}
