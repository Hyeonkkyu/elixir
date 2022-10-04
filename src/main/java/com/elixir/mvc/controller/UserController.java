package com.elixir.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("user")
public class UserController {
	
	@GetMapping("/signIn")
	public String signin() {
		return "user/signIn";
	}
	
	@GetMapping("/signUp")
	public String signup() {
		return "user/signUp";
	}
	
	@GetMapping("/signOut")
	public String signout() {
		return "user/signOut";
	}
	
	@GetMapping("/findId")
	public String findId() {
		return "user/findId";
	}
	
	@PostMapping("/findId")
	public String findId(@RequestParam("uId") String uId) throws Exception {
		//어떤 값을 통해 아이디 찾기를 구현할 것인지 회의 할 것
		//RequestParma의 경우 단정보가 들어가니 회의 후 사용처를 정할 것
		String returnId = null;
		return returnId;
	}
	
	@GetMapping("/findPw")
	public String findPw() {
		return "user/findPw";
	}
	
	@PostMapping("/changePw")
	public String changePw(String userVo, Model model) throws Exception {
		//if구문을 통해 나뉜다
		//인증을 통해 비밀번호 변경 페이지로 넘겨주거나, 돌려보내거나 해준다.
		return "";
	}
	
	@PostMapping("changePwSubmit")
	public String changePwSubmit(String uPw) {
		//패스워드 변경
		return "backup/home";
	}

}
