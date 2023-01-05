package dev.ososuna.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.ososuna.security.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {  
  Optional<User> findByEmail(String email);
}
