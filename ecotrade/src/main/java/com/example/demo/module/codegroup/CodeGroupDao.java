package com.example.demo.module.codegroup;

import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public interface CodeGroupDao {
	public List<CodeGroupDto> selectList();
	 
	public int insert(CodeGroupDto codegroupDto);
}
