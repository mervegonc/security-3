package com.tobias.des.service;

import com.tobias.des.dto.LoginDto;

public interface AuthService {
	String login(LoginDto loginDto);
}