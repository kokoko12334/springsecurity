package com.test.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.test.entity.MemberDto;
@Repository
@Mapper
public interface MemberMapper {

	void insertMember(MemberDto member);
    MemberDto getMemberById(int id);
    void updateMember(MemberDto member);
    void deleteMember(int id);
	MemberDto getMemberByMail(String mail);
	String changePwd(String pwd);
   
}