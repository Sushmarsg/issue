package org.sushma.mosquitoApp.controller.resource;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.sushma.mosquitoApp.dto.project.ProjectDTO;
import org.sushma.mosquitoApp.dto.resource.ResourceDTO;
import org.sushma.mosquitoApp.service.project.ProjectService;
import org.sushma.mosquitoApp.service.resource.ResourceService;

@Controller
@RequestMapping("/")
public class ResourceController {

	@Autowired
	private ResourceService resourceService;

	@Autowired
	private ProjectService projectService;

	public ResourceController() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	@RequestMapping(value="createResource.do",method=RequestMethod.POST)
	public ModelAndView saveResourceController(ResourceDTO dto)
	{
		System.out.println("saveResourceController started");

		resourceService.saveResourceService(dto);
		System.out.println("saveResourceController ended");
		return new ModelAndView("createResource.jsp","msg","created resource successfully");
	}

	@RequestMapping(value="getAllResources.do" , method=RequestMethod.GET)
	public ModelAndView getAllResourcesController()
	{
		System.out.println("getAllResourcesController started");
		List<ResourceDTO> list=resourceService.getAllResourceService();
		System.out.println("getAllResourcesController ended");
		return new ModelAndView("viewResource.jsp","rDTOList",list);
	}

	@RequestMapping(value="getResourceById.do", method=RequestMethod.GET)
	public ModelAndView getResourceByIdController(HttpServletRequest request)
	{

		return null;
	}

	@RequestMapping(value="resourceLogin.do", method=RequestMethod.POST)
	public ModelAndView verifyResourceLoginController(@RequestParam(value="email") String email,
			@RequestParam(value="pwd") String pwd, HttpServletRequest request)
	{		
		System.out.println("verifyResourceLoginController started");
		System.out.println("values from login page email="+email+"  password="+pwd);

		ModelAndView mav=null;
		ResourceDTO rdtoFromDB=resourceService.verifyResourceLoginService(email,pwd);

		if(rdtoFromDB!=null)
		{
			mav= new ModelAndView("resourceHome.jsp","msg","Welcome"+rdtoFromDB.getResrcName());
			HttpSession session=request.getSession(true);
			session.setAttribute("rdto", rdtoFromDB);

		}
		else
			mav= new ModelAndView("resourceLogin.jsp","msg","Invalid creditentials");

		System.out.println("verifyResourceLoginController ended");
		return mav;
	}

	@RequestMapping(value="getAllprojectDetails.do", method=RequestMethod.GET)
	public ModelAndView getAllProjectDetailsController()
	{
		System.out.println("getAllProjectDetailsController started");
		List<ProjectDTO> plistFromDB=projectService.getAllProjectService();
		List<ResourceDTO> rListFromDB=resourceService.getAllResourceService();
		System.out.println("getAllProjectDetailsController ended");
		return new ModelAndView("createIssue.jsp","plist",plistFromDB).addObject("rlist",rListFromDB);
	}
}
