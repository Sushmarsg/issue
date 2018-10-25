package org.sushma.mosquitoApp.service.issue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sushma.mosquitoApp.dao.issue.IssueDAO;
import org.sushma.mosquitoApp.dto.issue.IssueDTO;

@Service
public class IssueService 
{
	@Autowired
	private IssueDAO dao;
	public IssueService() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	public void saveIssueService(IssueDTO idto)
	{
		System.out.println("saveIssueService started");
		dao.saveIssue(idto);
		System.out.println("saveIssueService ended");
	}
}
