package com.hsw.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.hsw.web.DTO.BoardDTO;
import com.hsw.web.DTO.LoginDTO;
import com.hsw.web.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(LoginDTO dto, HttpSession session) {
		
		//System.out.println(dto.toString());
		LoginDTO result = loginService.login(dto);
		if(result != null && result.getCount() == 1) {
			session.setAttribute("id", dto.getId());
			session.setAttribute("name", dto.getName());
			System.out.println(session.getAttribute("id"));
			System.out.println(session.getAttribute("name"));
			return "/";
		} else {
			return "login";
		}
	}
	
}
