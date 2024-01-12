package com.example.backend.repo;

import com.example.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Integer> {

}
