package day4;

public class Person {
	String name;
	int age;
	
	//HAS-A
	Address address;
	Person(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}
	Car car;
	
	Person(String name, int age, Car car,Address add) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
		this.add=add;
	}
	Address add;
	
	
	public Person() {
		
	}
	
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
	/*void m1() {
		System.out.println("Person m1 method");
	}
	void m2() {
		System.out.println("m2 method");*/
	//}
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
