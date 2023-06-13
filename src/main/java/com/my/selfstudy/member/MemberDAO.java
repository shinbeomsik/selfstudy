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
			my.insert("member.create",bag);
		}
}
