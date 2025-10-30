package com.liviasilva.todo_api.User.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liviasilva.todo_api.User.dto.UserRegistrationDTO;
import com.liviasilva.todo_api.User.dto.UserResponseDTO;
import com.liviasilva.todo_api.User.dto.UserUpdateDTO;
import com.liviasilva.todo_api.User.model.User;
import com.liviasilva.todo_api.User.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> registerUser(@RequestBody UserRegistrationDTO dto) {
    User user = userService.registerUser(dto.getName(), dto.getEmail(), dto.getPassword());

    UserResponseDTO response = new UserResponseDTO(user.getName(), user.getEmail());
    return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> updateUser(@PathVariable Long id, @RequestBody UserUpdateDTO dto) {
        User user = userService.updateUser(id, dto);

        UserResponseDTO response = new UserResponseDTO(user.getName(), user.getEmail());
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
