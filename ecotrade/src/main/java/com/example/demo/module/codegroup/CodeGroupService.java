package com.example.demo.module.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
@Service
public class CodeGroupService {
	@Autowired
	CodeGroupDao dao;
	 
	public List<CodeGroupDto> selectList(CodeGroupVo vo){
		return dao.selectList(vo);
	}
	public int insert(CodeGroupDto Dto) {
		return dao.insert(Dto);
	}
	public int selectOneCount() {
		return dao.selectOneCount();
	}
	 
}
