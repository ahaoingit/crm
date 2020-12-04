import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

/**
 * TODO
 *
 * @author ahao 2020-12-02
 */
public class JWTTokenDome {



    public static void main(String[] args) {
//        HMAC方式
        Algorithm algorithm = Algorithm.HMAC256("123456abc");
        String token = JWT.create()
                .withIssuer("auth0")
                .sign(algorithm);
        JWTVerifier verifier = JWT.require(algorithm).withIssuer("auth0").build();
        DecodedJWT verify = verifier.verify(token);
        System.out.println(verify.getAlgorithm());
    }



}
