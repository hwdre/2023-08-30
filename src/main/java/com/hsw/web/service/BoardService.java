package com.hsw.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsw.web.DAO.BoardDAO;
import com.hsw.web.DTO.BoardDTO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO boardDAO;

	public List<BoardDTO> list() {
		
		return boardDAO.list();
	}

	public BoardDTO detail(int bno) {
		// TODO Auto-generated method stub
		return boardDAO.detail(bno);
	}
}
