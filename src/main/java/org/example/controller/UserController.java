package org.example.controller;

import org.example.domain.Category;
import org.example.domain.User;
import org.example.service.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public String getUserList() {
        return "ok";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") Long id) {
        return "ok";
    }

    @PostMapping("/post")
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "ok";
    }

    @PatchMapping("/patch")
    public String updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return "ok";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        return "ok";
    }


}