package com.example.demo.module.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

 

 
 

 



@Controller
public class UserController {

	@Autowired
	UserService Service;
	
	@RequestMapping(value = "/user/userXdmList")
	public String userXdmList(UserVo vo,Model model) {
		
		
		vo.setParamsPaging(Service.selectOneCount());
		
		
//		int a = codegroupServic.selectOneCount();
		
		 
		model.addAttribute("list",Service.selectList(vo));
		model.addAttribute("vo",vo);
		 
		return "xdm/user/userXdmList";
		
		
	}
	
	
	
	
	@RequestMapping(value = "/user/userXdmInst")
	public String userXdmInst(UserDto dto) {
	
		System.out.println("userDto.getUseq(): " + dto.getUseq());
		 
		
		Service.insert(dto);
		
		System.out.println("userDto.getUseq(): " + dto.getUseq());
		return "redirect:/user/userXdmList";
	}
	
	
	
	@RequestMapping(value = "/user/userXdmForm")
	public String userXdmForm(Model model) {
	
////		model.addAttribute("list",Servic.selectCodeGroup(vo));
		return "xdm/user/userXdmForm";
	}
	
	
	
//	@RequestMapping(value = "/user/userXdmMfom")
//	public String userXdmMfom(Model model, UserDto Dto) { 
//		 model.addAttribute("item",Service.selectOne(Dto));
//		 System.out.println("userDto.getUseq(): " + Dto.getUseq());
//		return "xdm/user/userXdmMfom";
//	}
	
	
	@RequestMapping(value = "/user/bannerXdmList")
	public String bannerXdmList(@ModelAttribute("vo") UserVo vo, Model model) throws Exception{

		 
		vo.setParamsPaging(Service.selectOneCount());
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", Service.selectList(vo));
		}

		return   "xdm/user/userXdmList";
  	}
	
	
	@RequestMapping(value = "/user/userXdmMfom")
	public String userXdmMfom(@ModelAttribute("vo") UserVo vo, Model model) throws Exception{
		
		if (vo.getUseq().equals("0") || vo.getUseq().equals("")) {
//			insert mode
		} else {
//			update mode
			model.addAttribute("item", Service.selectOne(vo));
			model.addAttribute("list", Service.selectList(vo));
		}
		return "xdm/user/userXdmMfom";
	}
	
	@RequestMapping(value = "/user/userXdmUpdt")
	public String userXdmUpdt(UserDto dto) {
		Service.update(dto);
		return "redirect:/user/userXdmList";
	}
	
	
	@RequestMapping(value = "/user/userXdmDele")
	public String userXdmDele(UserDto dto) {
		Service.delete(dto);
		return "redirect:/user/userXdmList";
	}
	
	@RequestMapping(value = "/user/userXdmUele")
	public String userXdmUele(UserDto dto) {
		System.out.println(dto.getUseq());
		Service.delete(dto);
		return "redirect:/user/userXdmList";
	}
	
}
