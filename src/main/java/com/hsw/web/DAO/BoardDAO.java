package com.hsw.web.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hsw.web.DTO.BoardDTO;

@Mapper
public interface BoardDAO {

	List<BoardDTO> list();

	BoardDTO detail(int bno);

}
