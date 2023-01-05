package dev.ososuna.security.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.ososuna.security.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {  
  Optional<User> findByEmail(String email);
}
