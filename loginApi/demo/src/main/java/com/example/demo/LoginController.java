package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping("/api")
@Validated
public class LoginController {

    // DTO for login request
    public static class LoginRequest {
        @NotBlank(message = "Email is required.")
        @Email(message = "Invalid email format.")
        private String email;

        @NotBlank(message = "Password is required.")
        @Size(min = 6, message = "Password must be at least 6 characters long.")
        private String password;

        // Getters and setters
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody LoginRequest request) {
        // Simulated user authentication logic
        if ("user@example.com".equals(request.getEmail()) && "password123".equals(request.getPassword())) {
            return ResponseEntity.ok("Login successful!");
        } else {
            return ResponseEntity.status(401).body("Invalid email or password.");
        }
    }
}
