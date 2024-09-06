package demohibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Update_Employee {
	
public static void main(String args[]) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("donbosco");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Scanner sc=new Scanner(System.in);
		
		Employee employee=new Employee();
		employee=em.find(Employee.class,4);
		if(employee != null) {
//			employee.setEmp_name("");
			employee.setSalary(50000.00);
//			employee.setJoining_date(new Date());
			employee.setStatus(true);
		}
		else
			System.out.println("Employee not found to");
		em.getTransaction().commit();
//		System.out.println("update Employee details: ");
//		System.out.println("1.Name 2.Salary 3.status 4.joining_date");
//		switch (sc.nextInt()) {
//		case 1:
//			System.out.println("enter the name of the employee:");
//			String name=sc.next();
//			employee.setEmp_name(name);
//			break;
//		case 2:
//			System.out.println("enter the salary of the employee:");
//			Double sal=sc.nextDouble();
//			employee.setSalary(sal);
//			break;
//		case 3:
//			System.out.println("enter the status of the employee:");
//			Boolean status=sc.nextBoolean();
//			employee.setStatus(status);
//			break;
//		case 4:
//			System.out.println("enter the joining_date of the employee:");
//			Date date=new Date();
//			employee.setJoining_date(date);;
//			break;
//		  default:
//			break;
//		}
		em.persist(employee);
		emf.close();
		em.close();
		System.out.println("data updated successfully for the selected id");
		
	}

}
