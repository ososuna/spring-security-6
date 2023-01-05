package dev.ososuna.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ososuna.security.model.AuthResponseDto;
import dev.ososuna.security.model.LoginRequestDto;
import dev.ososuna.security.model.RegisterRequestDto;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

  @PostMapping
  public ResponseEntity<AuthResponseDto> login(@RequestBody LoginRequestDto registerRequestDto) {
    return null;
  }
  
  @PostMapping("/register")
    public ResponseEntity<AuthResponseDto> register(@RequestBody RegisterRequestDto registerRequestDto) {
    return null;
  }


}
