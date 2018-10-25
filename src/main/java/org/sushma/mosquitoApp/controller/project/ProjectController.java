package org.sushma.mosquitoApp.controller.project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.sushma.mosquitoApp.dao.project.ProjectDAO;
import org.sushma.mosquitoApp.dto.project.ProjectDTO;
import org.sushma.mosquitoApp.service.project.ProjectService;


@Controller
@RequestMapping("/")
public class ProjectController {

	@Autowired
	private ProjectService service;

	@Autowired
	private ProjectDAO dao;

	public ProjectController() {
		System.out.println(this.getClass().getSimpleName() +" created");
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value ="createProject.do", method=RequestMethod.POST)
	public ModelAndView saveProjectController(ProjectDTO dto)
	{
		System.out.println("save project controller started");
		System.out.println(dto);

		service.saveProjectService(dto);

		System.out.println("save project controller ended");
		return new ModelAndView("createProject.jsp","msg","project created successfully");
	}

	@RequestMapping(value="getProject.do", method=RequestMethod.GET)
	public ModelAndView getProjectController()
	{
		List<String> pNames;
		System.out.println("inside get project controller");
		pNames=dao.fetchProjectNames();
		System.out.println("list of projects");
		for (String string : pNames) {
			System.out.println(string);
		}
		return new ModelAndView("createResource.jsp","projects",pNames);
	}

	@RequestMapping(value="viewProject.do", method= RequestMethod.GET)
	public ModelAndView viewProjectController()
	{
		System.out.println("viewProjectController started");
		List<ProjectDTO> pdto=service.viewProjectService();

		System.out.println("viewProjectController ended");
		return new ModelAndView("viewProject.jsp","pDTOList",pdto);
	}

	@RequestMapping(value="updateProjectStatus.do" , method=RequestMethod.GET)
	public ModelAndView updateProjStatusController(HttpServletRequest request)
	{
		System.out.println("update project status controller started");
		int id=Integer.parseInt(request.getParameter("id"));
		String st=request.getParameter("st");
		System.out.println("values of id="+id+"\t status="+st);
		
		service.updateProjStatusService(id,st);

		System.out.println("update project status controller ended");
		return new ModelAndView("viewProject.do");

	}



}
