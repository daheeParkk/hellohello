package org.example.service.inter;

import org.example.domain.User;
import org.example.dto.user.RequestLogin;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> selectUserList();
    User selectUser(Long id);
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);

    Map<String, String> login(RequestLogin requestLogin);
}
