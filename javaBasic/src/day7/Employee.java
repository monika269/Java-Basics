package day7;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee implements Comparable<Employee>{

	int empId;
	String empName;
	
	//constructors
	Employee(){}
	Employee(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		return this.empName.compareTo(o.empName);
	}

		
}
class Test implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.empName.compareTo(o2.empName);
	}

	
}
