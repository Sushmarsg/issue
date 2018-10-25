package org.sushma.mosquitoApp.dao.project;


import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sushma.mosquitoApp.dto.project.ProjectDTO;
@Repository
public class ProjectDAO {

	@Autowired
	private SessionFactory factory;
	public ProjectDAO() {
		System.out.println(this.getClass().getSimpleName() +" created");
	}

	public void saveProject(ProjectDTO dto)
	{
		System.out.println("save project dao started");

		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dto);
		tx.commit();

		System.out.println("save project dao ended");
	}
	public List<String> fetchProjectNames()
	{
		System.out.println("inside fetch project names in dao class");
		String hql="select projectName from ProjectDTO";

		Session session=factory.openSession();
		try{
			Query qry=session.createQuery(hql);
			List<String> pNames=qry.list();
			return pNames;
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}

		return null;
	}

	public List<ProjectDTO> fetchProjects()
	{
		System.out.println("fetch project dao started");

		Session session=factory.openSession();
		try{
			Query qry=session.createQuery("from ProjectDTO");
			List<ProjectDTO> pdto=qry.list();
			return pdto;
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}

		System.out.println("fetch project dao ended");
		return null;
	}

	public void updateProjectStatusDAO(int id, String st) {

		System.out.println("update project status in dao started");
		String hql="update ProjectDTO P set P.projectStatus=:status where P.pId=:pKey";

		if(st.equals("Active"))
			st="InActive";
		else
			st="Active";
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			Query qry=session.createQuery(hql);
			qry.setParameter("status", st);
			qry.setParameter("pKey", id);
			int res=qry.executeUpdate();
			tx.commit();
			System.out.println("Result------->"+res);
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}

		System.out.println("update project status in dao ended");
	}

	
}
