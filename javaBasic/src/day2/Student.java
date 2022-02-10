package day2;

public class Student {

	public int rollNo;
	public String name;
	
	public Student() {
		
	}
	
	Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + "]";
	}
}
