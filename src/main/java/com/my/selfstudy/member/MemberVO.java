package com.my.selfstudy.member;

import java.sql.Timestamp;

import org.springframework.format.annotation.DateTimeFormat;

public class MemberVO {
 
	private String member_id;
	private String password;
	private String member_nickname;
	private String member_name;
	private String member_phone;
	private String member_email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Timestamp member_birth;
	private String member_location;
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMember_nickname() {
		return member_nickname;
	}
	public void setMember_nickname(String member_nickname) {
		this.member_nickname = member_nickname;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public Timestamp getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(Timestamp member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_location() {
		return member_location;
	}
	public void setMember_location(String member_location) {
		this.member_location = member_location;
	}
	@Override
	public String toString() {
		return "MemberVO [member_id=" + member_id + ", password=" + password + ", member_nickname=" + member_nickname
				+ ", member_name=" + member_name + ", member_phone=" + member_phone + ", member_email=" + member_email
				+ ", member_birth=" + member_birth + ", member_location=" + member_location + "]";
	}
	
	
	
	
}
