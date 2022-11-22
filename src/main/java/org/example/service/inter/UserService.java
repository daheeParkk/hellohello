package org.example.service.inter;


import org.example.domain.User;

public interface UserService {

    User getUserList();
    User getUser(Long id);
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
