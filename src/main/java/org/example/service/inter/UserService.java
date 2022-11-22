package org.example.service.inter;

import org.example.domain.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();
    User getUser(Long id);
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
