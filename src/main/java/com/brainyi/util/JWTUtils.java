package com.brainyi.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.Map;

/**
 * TODO
 *
 * @author ahao 2020-12-02
 */
public class JWTUtils {
    private static final String salt = "fshajkfhahkwte..?skjag";
    private static final String issuer = "zzh";
    /**
     * 获取token
     * @param claimMap
     * @return
     */
    public static String getToken(Map<String,String> claimMap) {
        claimMap.put("date",new Date().toString());
        JWTCreator.Builder builder = JWT.create();
        claimMap.forEach(builder::withClaim);
        builder.withIssuer(issuer);
        return builder.sign(Algorithm.HMAC256(salt));
    }

    /**
     * 验证token
     * @param token
     */
    public static void verifyToken(String token) throws JWTVerificationException {
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(salt)).withIssuer(issuer).build();
        verifier.verify(token);
    }

    public static String getClaimVal(String key , String token) {
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(salt)).build();
        DecodedJWT decodedJWT = verifier.verify(token);
        return decodedJWT.getClaim(key).asString();
    }
}
