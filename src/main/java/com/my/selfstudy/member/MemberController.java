package com.my.selfstudy.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	 MemberDAO dao;
	
	@RequestMapping("member/member_insert")
	public String name(MemberVO bag) {
		System.out.println("회원등록 요청");
		dao.insert(bag);
		return "redirect:/member/login.jsp";
	}

	
	
}
