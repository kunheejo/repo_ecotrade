package com.example.demo.module.adminlogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
@Service
public class AdminLoginService {
	@Autowired
	AdminLoginDao dao;
	public AdminLoginDto selectLogin(AdminLoginDto dto) {
		return dao.selectLogin(dto);
	}
}
