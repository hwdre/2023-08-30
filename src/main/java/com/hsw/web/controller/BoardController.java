package com.hsw.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hsw.web.DTO.BoardDTO;
import com.hsw.web.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public String board(Model model) {
		
		List<BoardDTO> list = boardService.list();
		model.addAttribute("list", list);
		//System.out.println(list);
		
		return"board";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam(name="bno", required = true) int bno, Model model) {
		
		BoardDTO detail = boardService.detail(bno);
		model.addAttribute("detail", detail);
		System.out.println(detail);
		
		return "detail";
	}
}
