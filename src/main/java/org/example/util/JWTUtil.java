package org.example.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.example.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JWTUtil {
    @Value("${jwt.secret_key}")
    private String key;

    public String crateToken(Long id) {
        Map<String, Object> headers = new HashMap<>();
        headers.put("typ", "JWT");
        headers.put("alg", "HS256");

        Map<String, Object> payloads = new HashMap<>();
        payloads.put("data", id);

        Long expiredTime = 1000 * 60L * 60L * 2L;

        Date ext = new Date();
        ext.setTime(ext.getTime() + expiredTime);

        String jwt = Jwts.builder()
                .setHeader(headers)
                .setClaims(payloads)
                .setExpiration(ext)
                .signWith(SignatureAlgorithm.HS256, key.getBytes())
                .compact();

        return jwt;
    }

    public Map<String, Object> verifyJWT(String jwt) {
        Map<String, Object> claimMap = null;
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(key.getBytes("UTF-8"))
                    .parseClaimsJws(jwt)
                    .getBody();

            claimMap = claims;
        } catch (ExpiredJwtException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return claimMap;
    }
}
