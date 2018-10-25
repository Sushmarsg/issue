package org.sushma.mosquitoApp.controller.admin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.sushma.mosquitoApp.dto.admin.AdminDTO;

@Controller
@RequestMapping("/")
public class AdminController {
	
	@Value("${userId}")
	private String userId;
	@Value("${pwd}")
	private String password;
	
	public AdminController() {
		System.out.println(this.getClass().getSimpleName()+" object created");
	}
	
	@RequestMapping(value="adminLogin.do", method=RequestMethod.POST)
	public ModelAndView loginAdminController(AdminDTO dto) {
		System.out.println("login admin controller started");
		System.out.println(dto);
		
		System.out.println(userId+"\t"+password);
		
		if(dto.getUserId().equals(userId) && dto.getPassword().equals(password)) {
			System.out.println("Admin login success");
			return new ModelAndView("adminHome.jsp","nm",userId);
		}
		System.out.println("login admin controller ended");
		return new ModelAndView("adminLogin.jsp","msg","userid or password invalid");
	}

}
