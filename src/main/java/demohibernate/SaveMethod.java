package demohibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMethod 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("donbosco");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee emp=new Employee();
		
		emp.setEmp_name("nikhitha");
		emp.setSalary(20000.00);
		emp.setStatus(true);
        emp.setJoining_date(new java.util.Date());	
        emp.setToken(123456789L);
		
		et.begin();
		em.persist(emp);
		et.commit();
		
		System.out.println("data inserted successfully");
		
		
	}

}
