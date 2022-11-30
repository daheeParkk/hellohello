package org.example.service.impl;

import org.example.domain.User;
import org.example.dto.user.RequestLogin;
import org.example.repository.UserMapper;
import org.example.service.inter.UserService;
import org.example.util.BcryptUtil;
import org.example.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    private final JWTUtil jwtUtil;

    private final BcryptUtil bcryptUtil;

    @Autowired
    public UserServiceImpl(UserMapper userMapper, JWTUtil jwtUtil, BcryptUtil bcryptUtil) {
        this.userMapper = userMapper;
        this.jwtUtil = jwtUtil;
        this.bcryptUtil = bcryptUtil;}

    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }

    public User selectUser(Long id) {
        return userMapper.selectUser(id);
    }

    public void createUser(User user) {

        Map<String, String> response = new HashMap<>();


        // TODO nickname 중복 확인
        String nick = user.getNickname();
        if (userMapper.selectNicknameByNickname(nick) == 1) {
            response.put("result", "nickname already exists");

        }else {
            String encryptedPassword = bcryptUtil.encrypt(user.getPassword());
            user.setPassword(encryptedPassword);
            userMapper.createUser(user);
        }
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public void deleteUser(Long id) {
        userMapper.deleteUser(id);
    }

    public Map<String, String> login(RequestLogin requestLogin) {
        User info = userMapper.selectUserByNickname(requestLogin.getNickname());
        Map<String, String> response = new HashMap<>();

        if(info == null){
            response.put("result", "nickname not exist");
            return response;
        }

        if(!bcryptUtil.isEquals(info.getPassword(), requestLogin.getPassword())) {
            response.put("result", "password not match");
            return response;
        }

        System.out.println("로그인 성공");

        String token = jwtUtil.crateToken(info.getId());
        response.put("token", token);

        return response;
    }
}
