package org.example.service.inter;

import java.util.Map;

public interface JWTService {

    String crateToken();
    Map<String, Object> verifyJWT(String jwt);
}
