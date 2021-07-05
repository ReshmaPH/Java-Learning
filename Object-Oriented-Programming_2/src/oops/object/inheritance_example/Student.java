package oops.object.inheritance_example;

public class Student extends Person {
	private String colleageName;
	private int year;
	
	public Student(String name,String colleageName) {
		super(name);
		this.colleageName=colleageName;
	}
	
	public String getColleageName() {
		return colleageName;
	}
	public void setColleageName(String colleageName) {
		this.colleageName = colleageName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}
