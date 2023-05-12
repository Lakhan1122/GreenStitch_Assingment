package com.lakhan.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.lakhan.Repo.UserRepo;
import com.lakhan.model.User;

@Service
public class UserService {
	
	 private final UserRepo userRepository;
	    private final PasswordEncoder passwordEncoder;

	    public UserService(UserRepo userRepository, PasswordEncoder passwordEncoder) {
	        this.userRepository = userRepository;
	        this.passwordEncoder = passwordEncoder;
	    }

	    public User findByUsername(String username) {
	        return userRepository.findByUsername(username);
	    }

	    public User save(User user) {
	        user.setPassword(passwordEncoder.encode(user.getPassword()));
	        return userRepository.save(user);
	    }

}
