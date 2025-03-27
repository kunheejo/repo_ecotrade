package com.example.demo.module.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

 

 
@Service
public class UserService {

	@Autowired
	UserDao dao;
//	public List<UserDto> selectCodeGroup(UserVo vo){
//		return dao.selectCodeGroup(vo);
//	}
	
	public UserDto selectOne(UserVo vo) {
		return dao.selectOne(vo);
	}
	public List<UserDto> selectList(UserVo vo){
		return dao.selectList(vo);
	}
	public int insert(UserDto Dto) {
		return dao.insert(Dto);
	}
	public int update(UserDto Dto) {
		return dao.update(Dto);
	}
	public int selectOneCount() {
		return dao.selectOneCount();
	}
	
	public int delete(UserDto Dto) {
		return dao.delete(Dto);
	}
}
