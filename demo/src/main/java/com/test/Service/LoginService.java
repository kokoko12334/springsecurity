package com.test.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.Jwt;
import com.test.entity.MemberDto;
import com.test.mapper.MemberMapper;

@Service
public class LoginService {

	@Autowired
	MemberMapper mapper;
	
	
	@Value("${jwt.secret}")
	private String secretKey;
	
	private Long expiredMs = 1000*60*60l; // 1000 = 0.001초 => 한시간
	
	public String loginCheck(String mail, String pwd) {
		String result = "0";
		
		MemberDto member =  mapper.getMemberByMail(mail);		
		String changedPwd = mapper.changePwd(pwd);
		
		System.out.println(member.getPwd());
		System.out.println(changedPwd);
		
		if(changedPwd.equals(member.getPwd())) {
			result = Jwt.createJwt(mail, secretKey, expiredMs) ;
			
		}
		
		return result;
	}
	
	
	
	
}
