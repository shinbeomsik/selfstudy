package com.my.selfstudy.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MemberDAO {
		
		@Autowired
		SqlSessionTemplate my;
		
		//회원가입
		public void insert(MemberVO bag) {
			System.out.println(bag);
			my.insert("member.create",bag);
		}
		
		//아이디 중복확인
		public int idChk(String member_id) {
			int result = my.selectOne("member.idcheck", member_id);
			return result;
		}
		
}
