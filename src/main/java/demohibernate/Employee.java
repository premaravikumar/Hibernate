package demohibernate;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="emp_details")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name",nullable = false,length = 20)
	private String Emp_name;
	
	private Double salary;
	
	@Temporal(TemporalType.DATE)
	private java.util.Date joining_date;
	
	private boolean Status;
	
	@Transient
	private Long Token;
	
	
	public Employee() {
	}


	public Employee(int id, String emp_name, Double salary, Date joining_date, Boolean status, Long token) {
		super();
		this.id = id;
		Emp_name = emp_name;
		this.salary = salary;
		this.joining_date = joining_date;
		Status = status;
		Token = token;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmp_name() {
		return Emp_name;
	}


	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Date getJoining_date() {
		return joining_date;
	}


	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}


	public boolean getStatus() {
		return Status;
	}


	public void setStatus(Boolean status) {
		Status = status;
	}


	public Long getToken() {
		return Token;
	}


	public void setToken(Long token) {
		Token = token;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", Emp_name=" + Emp_name + ", salary=" + salary + ", joining_date=" + joining_date
				+ ", Status=" + Status + ", Token=" + Token + "]";
	}
	

}
