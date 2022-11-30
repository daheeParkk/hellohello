package org.example.util;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class BcryptUtil {

    // 값을 받아서 암호화하여 반환하는 메소드
    public String encrypt(String pw) {
        return BCrypt.hashpw(pw, BCrypt.gensalt());
    }

    // 암호화된 두 값을 받아서 해당 값이 같은 값인지 비교하는 메소드
    public Boolean isEquals(String dbpw, String pw) {
        return BCrypt.checkpw(dbpw, pw);
    }
}


