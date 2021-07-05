package oops.object.inheritance_example;

import java.math.BigDecimal;

public class Employee extends Person{
	
	private String title;
	private String employer;
	private char employeeGrade;
	private BigDecimal salary;
	
	public Employee(String name,String title) {
		super(name);  // name is the parameter in Constructor of Person Class (super class)
		this.title=title;
	}
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getEmployer() {
		return employer;
	}



	public void setEmployer(String employer) {
		this.employer = employer;
	}



	public char getEmployeeGrade() {
		return employeeGrade;
	}



	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}



	public BigDecimal getSalary() {
		return salary;
	}



	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}



	public String toString() {   
		//return String.format("title - %s,Employer %s ,EmployeeGrade %c , Salary -%f ,name - %s email %s phone number %s",title,employer,employeeGrade,salary,getName(),getEmail(),getPhoneNumber());
		return "Ttile is -"+title+"Employer is - "+employer+" Grade is "+employeeGrade+" Name of Empoyee is - "+super.getName()+" Maild id is - "+super.getEmail();
		//return super.toString()+title+"  "+employer;
	}
}
