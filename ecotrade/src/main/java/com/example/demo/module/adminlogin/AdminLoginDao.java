package com.example.demo.module.adminlogin;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.module.user.UserDto;
import com.example.demo.module.user.UserVo;

@Repository
public interface AdminLoginDao {

	public AdminLoginDto selectLogin(AdminLoginDto dto);
}
