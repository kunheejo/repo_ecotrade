package com.example.demo.module.codegroup;

import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public interface CodeGroupDao {
	public int selectOneCount();
//	CodeGroupVo vo
	public List<CodeGroupDto> selectList(CodeGroupVo vo);
	 
	public int insert(CodeGroupDto codegroupDto);
	 
	 
}
