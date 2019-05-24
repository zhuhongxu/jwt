package com.zhx.security.jwt;
/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-05-05 15:38
 */

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class Test {
    public static void main(String[] args) {
        String token = JWT.create().withAudience("hassan") .sign(Algorithm.HMAC256("qwer1234"));//生成token

    }
}
