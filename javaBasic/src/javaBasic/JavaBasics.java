/*
 * Mobile apps
 * standalone applications
 * Games
 * Web applications
 * Enterprise applications - Banking applications
 * 
 * Java EE - Web/Enterprise
 * Java SE
 * Java Editions
 * Java ME - Mobile
 * Java JFX - Internet applications
 * 
 * Java 1.0 - 1995
 * Java 8 -2014
 * Java 17 - Latest version
 * 
 * Identifiers : classes,methods,interfaces
 * Class/Interfaces : UpperCamelCase
 * Methods : lowerCamelCase
 * Packages : lowercase
 * Constants : UPPERCASE
 * 
 * lower/uppercase,numbers,_,$
 * starting letter shouldn't be number
 * 
 * Variables : 
 * Instance : define inside class, we can access using obj reference
 * Local : define inside method, can't access other methods/classes
 * static : define inside class, using class name/obj reference
 * 
 * stmt order inside source/class file
 * pkg stmt should be in first line
 * import stmts
 * class definition
 * variables
 * constructor
 * static/instance block
 * methods
 * 
 * Customer app : Customer,Product,Payment,Admin,Card,Cart,Address
 * 
 * default : with same class & package
 * public : any where
 * protected : within same package and other child classes from other packages
 * private : within class
 */
package javaBasic;

public class JavaBasics {
	//instance variables
	String name;
	short age;
	double salary;
	boolean isAvailable;
	//static variables
	public String[] skills;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		JavaBasics obj=new JavaBasics();
		System.out.println(obj.skills);
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.add("Mahesh"));

	}
	String add(String name)
	{
		//local variable
		String str="Hello";
		return str+" "+name;
	}
	void m1() {
		System.out.println(name);
		System.out.println(skills);
	}

}
