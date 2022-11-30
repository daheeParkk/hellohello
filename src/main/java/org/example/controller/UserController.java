package org.example.controller;

import org.example.domain.Category;
import org.example.domain.User;
import org.example.dto.user.RequestLogin;
import org.example.service.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUserList() {
        return userService.selectUserList();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userService.selectUser(id);
    }

    @PostMapping("/")
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "ok";
    }

    @PatchMapping("/")
    public String updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return "ok";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "ok";
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody RequestLogin requestLogin) {
        return userService.login(requestLogin);
    }

}
