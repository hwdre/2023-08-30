package com.hsw.web.DTO;

import lombok.Data;

@Data
public class LoginDTO {
	private int count;
	private String id, pw, name;
}
