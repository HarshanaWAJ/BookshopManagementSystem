package com.example.backend.repo;

import com.example.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository <User, Integer> {

    //Custom Queries
    @Query(value = "SELECT user_name, password FROM user WHERE user_name = :Username", nativeQuery = true)
    User userLogin(String Username);

}
