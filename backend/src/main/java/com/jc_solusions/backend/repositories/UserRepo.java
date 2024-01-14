package com.jc_solusions.backend.repositories;

import com.jc_solusions.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
