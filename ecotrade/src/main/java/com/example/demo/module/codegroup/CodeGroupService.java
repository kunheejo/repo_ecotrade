package com.example.demo.module.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
@Service
public class CodeGroupService {
	@Autowired
	CodeGroupDao codegroupdao;
	public List<CodeGroupDto> selectList(){
		return codegroupdao.selectList();
	}
	public int insert(CodeGroupDto codegroupDto) {
		return codegroupdao.insert(codegroupDto);
	}
}
