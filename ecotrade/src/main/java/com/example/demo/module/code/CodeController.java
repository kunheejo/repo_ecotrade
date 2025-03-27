package com.example.demo.module.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class CodeController {

	@Autowired
	CodeService codeServic;
	
	@RequestMapping(value = "/code/codeXdmList")
	public String codeXdmList(CodeVo vo,Model model) {
		
		
		vo.setParamsPaging(codeServic.selectOneCount());
		
		
//		int a = codegroupServic.selectOneCount();
		
		 
		model.addAttribute("list",codeServic.selectList(vo));
		model.addAttribute("vo",vo);
		 
		return "xdm/code/codeXdmList";
		
		
	}
	
	@RequestMapping(value = "/code/codeXdmForm")
	public String codeXdmForm(CodeVo vo, Model model) {
	
		model.addAttribute("list",codeServic.selectCodeGroup(vo));
		return "xdm/code/CodeXdmForm";
	}
	
	
	@RequestMapping(value = "/code/codeXdmInst")
	public String codeXdmInst(CodeDto codeDto) {
	
		System.out.println("codeDto.getSeq(): " + codeDto.getCdseq());
		 
		
		codeServic.insert(codeDto);
		
		System.out.println("codeDto.getSeq(): " + codeDto.getCdseq());
		return "redirect:/code/codeXdmList";
	}
}
