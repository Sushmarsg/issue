package org.sushma.mosquitoApp.dao.resource;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sushma.mosquitoApp.dto.project.ProjectDTO;
import org.sushma.mosquitoApp.dto.resource.ResourceDTO;

@Repository
public class ResourceDAO {

	@Autowired
	private SessionFactory factory;

	public ResourceDAO() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public void saveResource(ResourceDTO dto)
	{
		System.out.println("saveResource dao started");
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dto);
		tx.commit();

		System.out.println("saveResource dao started");
	}

	public List<ResourceDTO> getAllResources() 
	{

		System.out.println("getAllResources started");
		String hql="from ResourceDTO";

		Session session=factory.openSession();
		try{
			Query qry=session.createQuery(hql);
			List<ResourceDTO> rdto=qry.list();
			return rdto;
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}

		System.out.println("getAllResources ended");
		return null;


	}

	public ResourceDTO verifyResourceLogin(String email, String password) {

		System.out.println("verifyResourceLogin dao started");
		String hql="from ResourceDTO R where R.resrcEmail=:em and R.rescrPassword=:pwd";

		Session session=factory.openSession();
		try{
			Query qry=session.createQuery(hql);
			qry.setParameter("em", email);
			qry.setParameter("pwd", password);
			ResourceDTO rListFromDb=(ResourceDTO)qry.uniqueResult();
			return rListFromDb;
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}


		System.out.println("verifyResourceLogin dao ended");
		return null;
	}


}
