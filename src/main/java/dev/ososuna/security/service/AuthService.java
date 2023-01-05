package dev.ososuna.security.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import dev.ososuna.security.model.AuthResponseDto;
import dev.ososuna.security.model.LoginRequestDto;
import dev.ososuna.security.model.RegisterRequestDto;
import dev.ososuna.security.model.Role;
import dev.ososuna.security.model.User;
import dev.ososuna.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;
  private final JwtService jwtService;

  public AuthResponseDto login(LoginRequestDto loginRequestDto) {
    return null;
  }

  public AuthResponseDto register(RegisterRequestDto request) {
    var user = User.builder()
      .firstName(request.getFirstName())
      .lastName(request.getLastName())
      .email(request.getEmail())
      .password(passwordEncoder.encode(request.getPassword()))
      .role(Role.USER)
      .build();
    userRepository.save(user);
    var jwt = jwtService.generateToken(user);
    return AuthResponseDto.builder()
      .token(jwt)
      .build();
  }

}
