package com.example.demo.module.code;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

 
@Service
public class CodeService {

	@Autowired
	CodeDao dao;
	public List<CodeDto> selectCodeGroup(CodeVo vo){
		return dao.selectCodeGroup(vo);
	}
	public List<CodeDto> selectList(CodeVo vo){
		return dao.selectList(vo);
	}
	public int insert(CodeDto codeDto) {
		return dao.insert(codeDto);
	}
	public int selectOneCount() {
		return dao.selectOneCount();
	}
	
	
	
	 @PostConstruct
		public void selectListCachedCodeArrayList() throws Exception {
			List<CodeDto> codeListFromDb = (ArrayList<CodeDto>) dao.selectListCachedCodeArrayList();
			CodeDto.cachedCodeArrayList.clear(); 
			CodeDto.cachedCodeArrayList.addAll(codeListFromDb);
			System.out.println("cachedCodeArrayList: " + CodeDto.cachedCodeArrayList.size() + " chached !");
		}
	    
	    
		public static void clear() throws Exception {
			CodeDto.cachedCodeArrayList.clear();
		}
		
		
		public static List<CodeDto> selectListCachedCode(String ifcgSeq) throws Exception {
			List<CodeDto> rt = new ArrayList<CodeDto>();
			for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
				if (codeRow.getCgseq().equals(ifcgSeq)) {
					rt.add(codeRow);
				} else {
					// by pass
				}
			}
			return rt;
		}

		
		public static String selectOneCachedCode(int code) throws Exception {
			String rt = "";
			for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
				if (codeRow.getCdseq().equals(Integer.toString(code))) {
					rt = codeRow.getCdName();
				} else {
					// by pass
				}
			}
			return rt;
		}
}
