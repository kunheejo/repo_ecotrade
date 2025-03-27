package com.example.demo.module.adminlogin;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.module.user.UserDto;
import com.example.demo.module.user.UserVo;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdminLoginController {
	@Autowired
	AdminLoginService service;
	@RequestMapping(value = "/adminlogin/adminloginXdmList")
	public String adminloginXdmList() {
		
		
//		vo.setParamsPaging(Service.selectOneCount());
		
		
//		int a = codegroupServic.selectOneCount();
		
		 
//		model.addAttribute("list",Service.selectList(vo));
//		model.addAttribute("vo",vo);
		 
		return "xdm/adminlogin/adminloginXdmList";
		
		
	}
	
	@RequestMapping(value = "/adminlogin/adminloginXdmForm")
	public String adminloginXdmForm( ) {
	
////		model.addAttribute("list",Servic.selectCodeGroup(vo));
		return "xdm/adminlogin/adminloginXdmForm";
	}
	
	
	 @ResponseBody
		@RequestMapping(value = "/adminlogin/signinXdmProc")
		public Map<String, Object> signinXdmProc(AdminLoginDto dto, HttpSession httpSession) throws Exception {
			Map<String, Object> returnMap = new HashMap<String, Object>();

			 
			AdminLoginDto value = service.selectLogin(dto);
			if(value != null) {
				returnMap.put("rt", "success");
				 
				httpSession.setAttribute("sessSeqXdm", value.getAdseq());
				httpSession.setAttribute("sessNameXdm",value.getFirstName());
			}else {
			    returnMap.put("rt", "fail");
			}
			
			
			System.out.println(dto.getAdPassword());
			System.out.println(dto.getAdseq());
			
		 
			return returnMap;
	 }
	 
	 
	 
	 @ResponseBody
		@RequestMapping(value = "/adminlogin/signoutXdmProc")
		public Map<String, Object> signoutXdmProc(AdminLoginDto dto, HttpSession httpSession) throws Exception {
			Map<String, Object> returnMap = new HashMap<String, Object>();
			
			
			returnMap.put("rt", "success");
			return returnMap;
	 }
	 
	 
	 
	 
	 
}
