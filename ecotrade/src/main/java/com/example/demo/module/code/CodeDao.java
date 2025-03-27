package com.example.demo.module.code;

import java.util.List;

import org.springframework.stereotype.Repository;

 

@Repository
public interface CodeDao {

	public int selectOneCount();
//	CodeGroupVo vo
	public List<CodeDto> selectList(CodeVo vo);
	public List<CodeDto> selectCodeGroup(CodeVo vo);
	public int insert(CodeDto codeDto);
	public List<CodeDto> selectListCachedCodeArrayList();
}
