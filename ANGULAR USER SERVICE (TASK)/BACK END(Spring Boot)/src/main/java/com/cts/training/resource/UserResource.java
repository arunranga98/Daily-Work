//package com.cts.training.resource;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cts.training.bean.User;
//import com.cts.training.exception.UserNotFoundException;
//import com.cts.training.repository.UserRepository;
//
//@RestController
//@RequestMapping("/api")
//public class UserResource {
//
//	@Autowired
//	private UserRepository userRepository;
//	
//	//fetched by http://localhost:8080/api/users
//	@GetMapping("/users")
//	public List<User> getAllUers(){
//		return userRepository.findAll();
//	}
//	@GetMapping("/users/{id}")
//	public ResponseEntity<Optional<User>> getUserById(@PathVariable Long id) {
//		Optional<User> user = userRepository.findById(id);
//		if(!user.isPresent())
//			throw new UserNotFoundException("The user with id - "+id+" does not exists");
//		return new ResponseEntity<>(user, HttpStatus.FOUND);
//	}
//	
////	@GetMapping("/users/address/{address}")
////	public List<User> getUserByAddress(@PathVariable String address){
////		return userRepository.findByAddress(address);
////	}
//	
//	@DeleteMapping("/users/{id}")
//	public void deleteUser(@PathVariable Long id) {
//		Optional<User> user=userRepository.findById(id);
//		if(!user.isPresent())
//			throw new UserNotFoundException("The user with id - "+id+" does not exists");
//		 userRepository.deleteById(id);
//		
//	}
//	
//	@PostMapping("/users")
//	public User createUser(@RequestBody User user) {
//	User savedUser = userRepository.save(user);
//	return savedUser;
//	}
//	
//	@PutMapping("/users/{id}")
//	public ResponseEntity<Object> updateUser(@Valid @RequestBody User user,@PathVariable Long id){
//		Optional<User> updatedUser = userRepository.findById(id);
//		if(!updatedUser.isPresent())
//			throw new UserNotFoundException("The user with id - "+id+" does not exists");
//		userRepository.save(user);
//		return ResponseEntity.noContent().build();
//	}
//	
//}

package com.cts.training.resource;

import java.util.List;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.bean.User;
import com.cts.training.exception.UserNotFoundException;
import com.cts.training.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserResource {

	@Autowired
	private UserRepository userRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable Long id) {
		Optional<User> user = userRepository.findById(id);
		if(!user.isPresent())
        {
            throw new UserNotFoundException("The user with id - "+id+ " does not exists");
        }
			return user; 
				
	}
	
	@GetMapping("/users/name/{username}")
	public Optional<User> getUserByName(@PathVariable String username) {
			return  userRepository.findByUsername(username);
				
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/users/{id}")
	public void deleteById(@PathVariable Long id) {
		Optional<User> user1 = userRepository.findById(id);
		if(!user1.isPresent())
        {
            throw new UserNotFoundException("The user with id - "+id+ " does not exists");
        }
		userRepository.deleteById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) {
		User savedUser=userRepository.save(user);
		return savedUser;
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/users/{id}")
	public ResponseEntity<Object> updateUser(@Valid @RequestBody User user, @PathVariable Long id) {
		Optional<User> user1 = userRepository.findById(id);
		if(!user1.isPresent())
        {
            throw new UserNotFoundException("The user with id - "+id+ " does not exists");
        }
		userRepository.save(user);
		return ResponseEntity.noContent().build();
	}
}

