package com.hsw.web.DAO;

import org.apache.ibatis.annotations.Mapper;

import com.hsw.web.DTO.BoardDTO;
import com.hsw.web.DTO.LoginDTO;

@Mapper
public interface LoginDAO {

	LoginDTO login(LoginDTO dto);
	
}
