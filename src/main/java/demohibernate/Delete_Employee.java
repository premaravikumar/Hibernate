package demohibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Delete_Employee {
	
	public static void main(String args[]) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("donbosco");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Employee employee=new Employee();
		employee=em.find(Employee.class,1);
		em.remove(employee);
		em.getTransaction().commit();
		emf.close();
		em.close();
		System.out.println("data removed successfully");
		
		
	}

}
