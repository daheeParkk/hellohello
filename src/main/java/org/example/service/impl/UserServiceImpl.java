package org.example.service.impl;

import org.example.domain.User;
import org.example.repository.UserMapper;
import org.example.service.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserList() {
        return userMapper.selectUserList();
    }

    public User getUser(Long id) {
        return userMapper.selectUser(id);
    }

    public void createUser(User user) {
        userMapper.createUser(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);

    }

    public void deleteUser(Long id) {
        userMapper.deleteUser(id);

    }
}
