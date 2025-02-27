package com.example.controller;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/CRUD/user")
public class userController {

    @Autowired
    private UserRepository userRepository;

    // Get all Users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> Users = userRepository.findAllUsers();
        if (Users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(Users, HttpStatus.OK);
    }

    // Get User by ID
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@RequestParam (name="id") Long id) {
        Optional<User> UserData = userRepository.findUserById(id);
        return UserData.map(User -> new ResponseEntity<>(User, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Create User
    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User User) {
        try {
            boolean created = userRepository.createUser(User);
            if (created) {
                return new ResponseEntity<>("User was created successfully.", HttpStatus.CREATED);
            } else {
                return new ResponseEntity<>("Failed to create User.", HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error creating User: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Update User
    @PutMapping()
    public ResponseEntity<String> updateUser(@RequestParam (name="id") Long id, @RequestBody User User) {
        try {
            Optional<User> emp= userRepository.findUserById(id);
            if (emp.isEmpty()) {
                return new ResponseEntity<>("User not found with ID: " + id, HttpStatus.NOT_FOUND);
            }

            boolean updated = userRepository.updateUser(User);
            if (updated) {
                return new ResponseEntity<>("User was updated successfully.", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Failed to update User.", HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error updating User: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Delete User
    @DeleteMapping()
    public ResponseEntity<String> deleteUser(@RequestParam (name="id") Long id) {
        try {
            boolean deleted = userRepository.deleteById(id);
            if (deleted) {
                return new ResponseEntity<>("User was deleted successfully.", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("User not found with ID: " + id, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting User: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}