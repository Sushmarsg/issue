package org.sushma.mosquitoApp.dao.issue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sushma.mosquitoApp.dto.issue.IssueDTO;

@Repository
public class IssueDAO {
	@Autowired
	private SessionFactory factory;
	public IssueDAO() {
		System.out.println(this.getClass().getSimpleName()+"  created");
	}

	public void saveIssue(IssueDTO idto) {

		System.out.println("inside save issue dao");
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(idto);
		tx.commit();
		System.out.println("save issue dao ended");

	}

}
