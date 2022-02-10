package pkg2;

import javaBasic.Employee;
import javaBasic.JavaBasics;
import javaBasic.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		Employee employee2=new Employee();
		Employee emp3=new Employee("Ravi",32,"HR",35000.0);
		Student student=new Student();
		JavaBasics obj=new JavaBasics();
		
		student.name="Ram";
		student.rno=1245;
		student.dept="CSE";
		
		System.out.println(student.name);
		System.out.println(student.rno);
		System.out.println(student.dept);
		
		System.out.println(obj.skills);//null
		System.out.println(employee.name);//null
		
		employee.name="Mahesh";
		employee.age=21;
		employee.dept="HR";
		
		System.out.println(employee.name);
		System.out.println(employee.age);
		System.out.println(employee.dept);
		
		employee2.name="Sam";
		employee2.age=22;
		employee2.dept="IT";
		
		System.out.println(employee2.name);
		System.out.println(employee2.age);
		System.out.println(employee2.dept);
		
		System.out.println(emp3.name);
		System.out.println(emp3.age);
		System.out.println(emp3.dept);
		System.out.println();
		
		emp3.setRole("Admin");
		
		System.out.println(emp3.getRole());
		
		Employee emp5=new Employee("Krish",23,"IT",30000);
		System.out.println(emp5.name);
		System.out.println(emp5.age);
		System.out.println(emp5.dept);
		System.out.println(emp5.salary);
		emp5.setRole("Manager");
		System.out.println(emp5.getRole());
	}

}
