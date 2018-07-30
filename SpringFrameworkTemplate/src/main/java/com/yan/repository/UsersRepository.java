package com.yan.repository;

import com.yan.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//import org.springframework.data.repository.*;

import com.yan.Model.Users;

@Repository("userRepository")
public interface UsersRepository extends JpaRepository<Users, Integer> {


    Users findByEmail(String email);
    Optional<Users> findByName(String username);

}
