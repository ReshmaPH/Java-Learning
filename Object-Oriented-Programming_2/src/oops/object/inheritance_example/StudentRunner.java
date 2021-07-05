package oops.object.inheritance_example;

import java.math.BigDecimal;

//To understand Inheritance

public class StudentRunner {

	public static void main(String[] args) {
		
		Student student=new Student("Resh","Vidya");
		//student.setName("Resh");  setName can be removed as constructor which sets name is added.
		Person person=new Person("Resh");
		System.out.println(student);
		
		Employee employee=new Employee("Sandhu","IT");
		employee.setEmail("resh@gmail");
		employee.setPhoneNumber("099502002010");
		//employee.setName("Resh");
		employee.setTitle("IT");
		employee.setSalary(new BigDecimal(10));
		employee.setEmployeeGrade('C');
		System.out.println(employee);
		

	}

}
