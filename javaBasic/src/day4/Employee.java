package day4;

public class Employee extends Person {//public,default,final,abstract
	String name;
	int age;
	int empId;
	
	public Employee() {
		
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", x=" + x + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Employee(int empId,double salary,String name, int age,Car car) {
	//	super();
		this.empId=empId;
		this.salary=salary;
		this.name=name;
		this.age=age;
		this.car=car;
	}

	Employee(String name, int age, String name2, int age2, int x) {
		super(name, age);
		name = name2;
		age = age2;
		this.x = x;
	}
	double salary;
	int x=100;
	
	public Employee(int empId,double salary,String name, int age) {
		super();
		this.empId=empId;
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}
	double getSalary() {
		return this.salary;
	}
	public String getName() {
		System.out.println("Employee");
		return " ";
	}
	public int getAge() {
		return this.age;
	}
	int getEmpId() {
		return this.empId;
	}
}
