package com.example.codejavaapp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String raw = "prodota318";
        String encoded = passwordEncoder.encode(raw);
        System.out.println(encoded);
    }
}
