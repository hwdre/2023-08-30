package com.hsw.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsw.web.DAO.LoginDAO;
import com.hsw.web.DTO.BoardDTO;
import com.hsw.web.DTO.LoginDTO;

@Service
public class LoginService {
	
	@Autowired
	private LoginDAO loginDAO;

	public LoginDTO login(LoginDTO dto) {
		// TODO Auto-generated method stub
		return loginDAO.login(dto);
	}

	
	
	
	
}
