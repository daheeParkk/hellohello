package org.example.testJWT;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.xml.crypto.Data;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestJWT {
    final String key = "Bamdule@@@@@@FDFDSFDSF$$%$#SDFSDFds";

    public static void main(String[] args) throws UnsupportedEncodingException {
        TestJWT testJWT = new TestJWT();

        String jwt = testJWT.createToken();
        System.out.println(jwt);

        Map<String, Object> claimMap = testJWT.verifyJWT(jwt);
        System.out.println(claimMap);
    }

    public String createToken() {

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

    public Map<String, Object> verifyJWT(String jwt) throws UnsupportedEncodingException {
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
