package org.example.repository;

import org.example.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User selectUserList();

    User selectUser(Long id);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);
}
