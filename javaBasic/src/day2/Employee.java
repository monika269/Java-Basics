package day2;

public class Employee {
	
	public int empId;
	public String name;
	Employee(){
		
	}
	Employee(int empId,String name){
		this.empId=empId;
		this.name=name;
	}
	//public java.lang.String toString(){
	//	return this.empId+" "+this.name;
//	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}
}
