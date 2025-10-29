package com.liviasilva.todo_api.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.liviasilva.todo_api.User.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
