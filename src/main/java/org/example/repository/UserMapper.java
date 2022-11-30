package org.example.repository;

import org.example.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    List<User> selectUserList();

    User selectUser(Long id);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User selectUserByNickname(String nickname);

    int selectNicknameByNickname(String nickname);
}
