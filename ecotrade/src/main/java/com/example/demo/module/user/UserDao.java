package com.example.demo.module.user;

import java.util.List;

import org.springframework.stereotype.Repository;

 

 

 

@Repository
public interface UserDao {

	public int selectOneCount();
//	CodeGroupVo vo
	public List<UserDto> selectList(UserVo vo);
//	public List<UserDto> selectCodeGroup(UserVo vo);
	public UserDto selectOne(UserVo vo);
	public int insert(UserDto Dto);
	public int update(UserDto Dto);
	public int delete(UserDto Dto);
	
	
	 
}
