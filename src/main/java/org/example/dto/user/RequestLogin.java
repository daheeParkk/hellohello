package org.example.dto.user;

public class RequestLogin {

    private String nickname;
    private String password;

    public RequestLogin(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public RequestLogin() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
