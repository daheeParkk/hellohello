package org.example.service.impl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.example.service.inter.JWTService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JWTServiceImpl implements JWTService {

    final String key = "Bamdule@@@@@@FDFDSFDSF$$%$#SDFSDFds";

    @Override
    public String crateToken() {
        Map<String, Object> headers = new HashMap<>();
        headers.put("typ", "JWT");
        headers.put("alg", "HS256");

        Map<String, Object> paylaods = new HashMap<>();
        paylaods.put("data", "First JWT !!");

        Long expiredTime = 1000 * 60L * 60L * 2L;

        Date ext = new Date();
        ext.setTime(ext.getTime() + expiredTime);

        String jwt = Jwts.builder()
                .setHeader(headers)
                .setClaims(paylaods)
                .setSubject("user")
                .setExpiration(ext)
                .signWith(SignatureAlgorithm.HS256, key.getBytes())
                .compact();

        return jwt;
    }

    @Override
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
