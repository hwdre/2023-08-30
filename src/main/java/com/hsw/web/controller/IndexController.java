package com.hsw.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("text","서버에서 보낸 메시지입니다.");
		model.addAttribute("html","<div style=\"font-size: 20px;\">div입니다</div>");
		model.addAttribute("bno", 255);
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < 10; i++) {
			list.add("홍길동" + i);
		}
		model.addAttribute("list", list);
		return "index";
	}
	
}
