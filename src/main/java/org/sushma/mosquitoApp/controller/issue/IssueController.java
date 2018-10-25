package org.sushma.mosquitoApp.controller.issue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.sushma.mosquitoApp.dto.issue.IssueDTO;
import org.sushma.mosquitoApp.service.issue.IssueService;

@Controller
@RequestMapping("/")
public class IssueController {

	@Autowired
	private IssueService service;
	
	public IssueController() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	@RequestMapping(value="createIssue.do", method=RequestMethod.POST)
	public ModelAndView createIssuesController(IssueDTO idto)
	{
		System.out.println("createIssuesController started");
		System.out.println(idto);
		service.saveIssueService(idto);
		System.out.println("createIssuesController ended");
		return new ModelAndView("createIssue.jsp","msg","issue created successfully");
	}

}
