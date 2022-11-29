package org.example.controller;


import org.example.service.inter.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/JWT")
public class JWTController {

    private final JWTService jwtService;

    @Autowired
    public JWTController(JWTService jwtService) {
        this.jwtService = jwtService;
    }

    @GetMapping("/token")
    public String token() {
        String token = jwtService.crateToken();
        return token;
    }

    @GetMapping("/verify")
    public Map<String, Object> verifyJWT(@RequestParam("token") String token) {
        Map<String, Object> claims = jwtService.verifyJWT(token);
        return claims;
    }

}
