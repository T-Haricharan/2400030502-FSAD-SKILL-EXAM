package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ClientDemo 
{
	public static void main(String[] args) 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		Service s = new Service(1,"Cleaning","12-03-2026","Pending");
		session.save(s);

		Query q = session.createQuery(
		"update Service set name=:name,status=:status where id=:id");

		q.setParameter("name","Repair");
		q.setParameter("status","Completed");
		q.setParameter("id",1);

		q.executeUpdate();

		tx.commit();
		session.close();

		System.out.println("Record Inserted and Updated");
	}
}