package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dao.Member;
import com.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;

	@GetMapping("/")
	public String homePage(Model m) {
		Member member = memberService.findMemberById("64ef358a-3169-4a76-b56e-1cde731a8701");
		m.addAttribute("name", member.getName());
		return "home";
	}
}
