package javaBasic;

public class Employee {
	public String name;
	public int age;
	public String dept;
	public double salary;
	public String role;
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Employee(){}
	
	public Employee(String name,int age,String dept,double salary) {
		this.name=name;
		this.age=age;
		this.dept=dept;
		this.salary=salary;
	}
	//Getters and setters
	public String getName(){
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	public String getDept() {
		return this.dept;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public void setAge(int a) {
		this.age=a;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
