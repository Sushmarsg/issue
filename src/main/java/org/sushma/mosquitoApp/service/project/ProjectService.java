package org.sushma.mosquitoApp.service.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sushma.mosquitoApp.dao.project.ProjectDAO;
import org.sushma.mosquitoApp.dto.project.ProjectDTO;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectDAO dao;
	public ProjectService() {
		System.out.println(this.getClass().getSimpleName() +"created");
	}
	
	public void saveProjectService(ProjectDTO dto){
		System.out.println("save project service started");
		
		dao.saveProject(dto);
		
		System.out.println("save project service ended");
	}

	public List<ProjectDTO> viewProjectService()
	{
		System.out.println("viewProject service started");
		List<ProjectDTO> pdto;
		pdto=dao.fetchProjects();
		System.out.println("viewProject service ended");
		return pdto;
	}
	public void updateProjStatusService(int id, String st) {

		System.out.println("update project service started");
		dao.updateProjectStatusDAO(id,st);
		System.out.println("update project service ended");
	}

	public List<ProjectDTO> getAllProjectService() 
	{
		System.out.println("getAllProjectService started");
		List<ProjectDTO> pListFromDB=dao.fetchProjects();
		System.out.println("getAllProjectService ended");
		
		return pListFromDB;
	}

}
