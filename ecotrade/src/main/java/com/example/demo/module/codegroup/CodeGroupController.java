package com.example.demo.module.codegroup;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
 

 

@Controller
public class CodeGroupController {
	@Autowired
	CodeGroupService Service;
	
	@RequestMapping(value = "/codegroup/codegroupXdmList")
	public String codegroupXdmList(CodeGroupVo vo,Model model) {
		
		
		vo.setParamsPaging(Service.selectOneCount());
		
		
//		int a = codegroupServic.selectOneCount();
		
		 
		model.addAttribute("list",Service.selectList(vo));
		model.addAttribute("vo",vo);
		 
		return "xdm/codegroup/codegroupXdmList";
		
		
	}
	
	@RequestMapping(value = "/codegroup/codegroupXdmForm")
	public String codegroupXdmForm() {
	
		return "xdm/codegroup/CodeGroupXdmForm";
	}
	@RequestMapping(value = "/codegroup/codegroupXdmInst")
	public String codegroupXdmInst(CodeGroupDto codegroupDto) {
	
		System.out.println("codegroupDto.getSeq(): " + codegroupDto.getCgseq());
		 
		
		Service.insert(codegroupDto);
		
		System.out.println("codegroupDto.getSeq(): " + codegroupDto.getCgseq());
		return "redirect:/codegroup/codegroupXdmList";
	}
	
	
	
	@RequestMapping(value = "/codegroup/bannerXdmList")
	public String bannerXdmList(@ModelAttribute("vo") CodeGroupVo vo, Model model) throws Exception{

		 
		vo.setParamsPaging(Service.selectOneCount());
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", Service.selectList(vo));
		}

		return   "xdm/codegroup/codegroupXdmList";
  	}
	 
}
