package com.epicode.esercizi.service;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.esercizi.model.User;
import com.epicode.esercizi.repository.UserRepository;

@Service
public class UserService {
	
	 @Autowired
	    private UserRepository userRepository;

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public User getUserById(Long id) {
	        Optional<User> user = userRepository.findById(id);
	        if (user.isPresent()) {
	            return user.get();
	        }
	        throw new RuntimeException("User not found with id: " + id);
	    }

	    public User createUser(User user) {
	        return userRepository.save(user);
	    }

	    public User updateUser(Long id, User user) {
	        if (userRepository.existsById(id)) {
	            user.setId(id);
	            return userRepository.save(user);
	        }
	        throw new RuntimeException("User not found with id: " + id);
	    }

	    public void deleteUser(Long id) {
	        if (userRepository.existsById(id)) {
	            userRepository.deleteById(id);
	        } else {
	            throw new RuntimeException("User not found with id: " + id);
	        }
	    }

}
