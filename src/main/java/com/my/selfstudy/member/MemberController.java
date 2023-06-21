package com.my.selfstudy.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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
	
	@RequestMapping("member/member_idcheck")
	@ResponseBody
	public String idChk(String member_id) {
		String result = "0"; // 중복시 1
		System.out.println(member_id);
		try {
			int count = dao.idChk(member_id); // 0이 되야함
			result = String.valueOf(count);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(result);
		return result;
	}
	
	
}
