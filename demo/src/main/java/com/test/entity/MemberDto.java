package com.test.entity;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {

	private int id;
	private String mail;
	private String name;
	private String pwd;
	private String birth;
	private String phone;
	private Date reg;
	public MemberDto(String mail, String name, String pwd, String birth, String phone) {
		
		this.mail = mail;
		this.name = name;
		this.pwd = pwd;
		this.birth = birth;
		this.phone = phone;
	}
	
	
	
	
}
