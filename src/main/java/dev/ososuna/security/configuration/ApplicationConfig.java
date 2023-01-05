package dev.ososuna.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import dev.ososuna.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
  
  private final UserRepository userRepository;

  @Bean
  UserDetailsService userDetailsService() {
    return username -> userRepository.findByEmail(username)
      .orElseThrow(() -> new UsernameNotFoundException("User not found"));
  }

}
