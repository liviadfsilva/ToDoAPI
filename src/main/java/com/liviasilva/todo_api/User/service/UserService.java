package com.liviasilva.todo_api.User.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.liviasilva.todo_api.User.model.User;
import com.liviasilva.todo_api.User.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Create User
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(String name, String email, String rawPassword) {
        String encodedPassword = passwordEncoder.encode(rawPassword);
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(encodedPassword);
        userRepository.save(user);
    }

    public void updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());

        String newPassword = userDetails.getPassword();
        if (newPassword != null && !newPassword.isEmpty()) {
            if (passwordEncoder.matches(newPassword, user.getPassword())) {
                throw new RuntimeException("New password must be different from the previous password");
            }

            user.setPassword(passwordEncoder.encode(newPassword));
        }

        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
