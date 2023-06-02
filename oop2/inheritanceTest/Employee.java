package oop2.inheritanceTest;

public class Employee {
	
	private int empid;
	private String name;
	private float salary;
	private int mobNo;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEmpid() {
		System.out.println("Parent CLass id");
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		System.out.println("Parent class salary");
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	
	void getTypeofEmployee() {
		System.out.println("Get Employee Type");
		
	}

}
