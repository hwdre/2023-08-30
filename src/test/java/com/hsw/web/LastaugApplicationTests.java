package com.hsw.web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hsw.web.DTO.LoginDTO;
import com.hsw.web.service.LoginService;

@SpringBootTest
class LastaugApplicationTests {

	//junit = 자바에서 독립된 단위테스트를 지원해주는 프레임워크
	//단정(assert) 메소드로 테스트 케이스의 수행결과를 판별합니다.
	
	@Autowired
	LoginService loginService;
	
	@Test
	@DisplayName("1차 테스트")
	void contextLoads() {
		//dto에 값을 담아서 db에 물어보면 정말 값이 와요?
		LoginDTO dto = new LoginDTO();
		dto.setId("hsw");
		dto.setPw("Jisoo230331");
		
		LoginDTO result = loginService.login(dto);
		
		assertEquals(result.getM_name(), "황선우");
//		assertNotNull(result);
//		assertSame(dto, result);
	}

}
