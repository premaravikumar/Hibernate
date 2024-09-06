package demohibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Retriveall {
	
	public static void main(String args[]) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("donbosco");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		 List<Employee> employees=em.createQuery("select e from Employee e",Employee.class).getResultList();
		  for(Employee employee: employees) {
			  System.out.println("EID:"+employee.getId());
			  System.out.println("ENAME:"+employee.getEmp_name());
			  System.out.println("SAL:"+employee.getSalary());
			  System.out.println("join_DATE:"+employee.getJoining_date());
			  System.out.println ("Status:"+employee.getStatus());
			  System.out.println();
		  }
          em.close();
	      emf.close();
	}

}
