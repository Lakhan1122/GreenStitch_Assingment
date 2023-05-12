package com.lakhan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lakhan.model.User;



public interface UserRepo extends JpaRepository<User, Long>{

	User findByUsername(String username);

}
