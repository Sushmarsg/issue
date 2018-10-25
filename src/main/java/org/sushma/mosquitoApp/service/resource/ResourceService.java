package org.sushma.mosquitoApp.service.resource;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
import org.sushma.mosquitoApp.dao.resource.ResourceDAO;
import org.sushma.mosquitoApp.dto.project.ProjectDTO;
import org.sushma.mosquitoApp.dto.resource.ResourceDTO;

@Service
public class ResourceService {
	
	@Autowired
	private ResourceDAO dao;
	
	@Autowired
	private SimpleMailMessage message;
	
	@Autowired
	private JavaMailSenderImpl mailSender;
	
	public ResourceService() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	public void saveResourceService(ResourceDTO dto)
	{
		System.out.println("saveResourceService started");
	
		String pwd=generatePassword();
		dto.setRescrPassword(pwd);
		System.out.println("resource password ="+pwd);
		/*//		sending email to resource
		message.setTo("sushgirisumu@gmail.com");
		message.setSubject("project allocation details");
		message.setText("HI user, you are part of the project "+dto.getResrcProjName()+
				"\n email id="+dto.getResrcEmail()+"  and password="+dto.getRescrPassword());
		mailSender.send(message);
		*/
		System.out.println("HI user, you are part of the project "+dto.getResrcProjName()+
				"\n email id="+dto.getResrcEmail()+"  and password="+dto.getRescrPassword());
		
		dao.saveResource(dto);
		System.out.println("saveResourceService ended");
	}
	public List<ResourceDTO> getAllResourceService() {

		System.out.println("getAllResourceService started");
		List<ResourceDTO> rlist=dao.getAllResources();
		System.out.println("getAllResourceService ended");
		return rlist;
	}
	public String generatePassword() {

		CharSequence pwd= (UUID.randomUUID().toString().subSequence(0, 8));
		return pwd.toString();
	}
	public ResourceDTO verifyResourceLoginService(String email, String pwd) {
		System.out.println("verifyResourceLoginService started");
		ResourceDTO rListFromDb=dao.verifyResourceLogin(email,pwd);
		System.out.println("verifyResourceLoginService ended");
		return rListFromDb;
	}
	

}
