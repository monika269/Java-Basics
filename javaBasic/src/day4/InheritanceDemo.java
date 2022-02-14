
/*
 * 	Acquire properties & methods defined in parent class
 * using extends keyword, we can acquire parent class properties & methods
 * only one class can be extended
 * Types:
 * SIngle - Java
 * Parent <--- child
 * Multiple
 * Multi level   -Java
 * Parent <---child <----Grand child
 * Hierarchial  - Java
 * Hybrid - java does not support
 * 
 * Has-A relation ship
 * 
 * Animal - Dog - IsA
 * Vehicle - Car/Scooter - IsA
 * 
 * Person - Address - HasA
 * Person - Car - HasA
 * Product - Cart - HasA
 * Person - Card - HasA
 * 
 * 
 */


package day4;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		//int x=person.age;
		person.getAge();
		//Employee
		Employee employee=new Employee();
		System.out.println(employee.salary);
		//single - person & EMployee
		//ref type is parent and obj type is parent
		Person p=new Person();
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.getName());
		
		//ref type and obj type is child
		Employee emp1=new Employee();
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		
		//child class members
		System.out.println(emp1.salary);
		System.out.println(emp1.empId);
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getSalary());
		
		//ref type & parent obj type - child
		//runtime
		Person p1=new Employee();
		System.out.println(p1.getName());
		System.out.println(emp1.x);
		
		Employee emp2=new Employee(1001,35000,"Ram",23);
		System.out.println(emp2);//hashcode
		System.out.println(emp2.getName());
		System.out.println(emp2.getSalary());
	
		System.out.println(emp2.address);
		System.out.println(emp2.car);
	//	System.out.println(emp2.car.model);
		
		Car c=new Car();
		c.model=2004;
		Employee emp3=new Employee(1001,35000,"Ram",23,c);
		System.out.println(emp3.car);
		System.out.println(emp3.car.model);
		
		//person & address
		Address add=new Address();
		add.street="ABC";
		Person p3=new Person("Ram",22,c,add);
		System.out.println(p3.add.street);
		
		
		//multilevel inheritance & HAS-A (Person and Address)
	}

}
