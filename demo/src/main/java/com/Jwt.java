package com;

import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Jwt {

	
	
	public static String createJwt(String userName, String secretKey, Long expiredMs ) {
		// payload저장
		Claims claims = Jwts.claims();
		claims.put("userName", userName);
		
		return Jwts.builder()
				.setClaims(claims)
				.setIssuedAt(new Date(System.currentTimeMillis())) //발행일
				.setExpiration(new Date(System.currentTimeMillis() + expiredMs)) //만료일
				.signWith(SignatureAlgorithm.HS256,secretKey) //사인할 암호알고리즘설정
				.compact();
		
		
	}
}
