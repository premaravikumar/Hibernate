package demohibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindMethod {
	
	public static void main(String args[]) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("donbosco");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tnx=em.getTransaction();
		Employee emp1=new Employee();
		 emp1=em.find(Employee.class,4);
		 if(emp1 != null) {
			 System.out.println("the details of fetched employee :");
		     System.out.println("name:"+emp1.getEmp_name());
		     System.out.println("status:"+emp1.getStatus());
		     System.out.println("join_date:"+emp1.getJoining_date());
		     System.out.println("salary:"+emp1.getSalary());
		 }
		 else
		 {
			 System.out.println("Employee details not found");
		 }
		tnx.begin();
	     tnx.commit();
	     em.close();
	     emf.close();
	   }
	

}
