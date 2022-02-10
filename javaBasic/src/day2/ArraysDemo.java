/*
 * Arrays:
 * to store more no.of elements in a single variable
 * supports all data types elements to store
 * It uses contigious memory space locations
 * fixed in size
 * better perf
 * No predefined methods
 * index value starts from 0
 * find length - length
 * 
 * Types of array:
 * Single dimensional
 * 	int[] arr1=new int[5];
 * 	int[] arr2=new int[]{10,20,30,40};
 * 	int[] arr3;
 * 	int []arr3;
 * 	int arr3[];
 * Multi dimensional
 * 
 * 
 */


package day2;

public class ArraysDemo {

	static int[] i;
	int[] arr11= {1,2,3,4,5,6,7,8,9,10};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArraysDemo ad=new ArraysDemo();
		/*	System.out.println(i);
		i=new int[5];
		System.out.println(i);
		for(int v:i)
		{
			System.out.println(v);
		}
		int[] arr2= {10,20,30,40};
		System.out.println(arr2[3]);*/
		
		Employee[] employees=new Employee[5];
		Employee emp1=new Employee();
		emp1.empId=1001;
		emp1.name="Sai";
		
		Employee emp2=new Employee(1002,"Ram");
		employees[0]=emp1;
		employees[2]=emp2;
		
	//	for(Employee e:employees) {
	//		if(e!=null)
	//			System.out.println(e);
	//	}
		
		Student std1=new Student(2001,"John");
		Student std2=new Student(2002,"Lucky");
		
		Object[] objs=new Object[4];
		objs[0]=emp1;
		objs[1]=emp2;
		objs[2]=std1;
		objs[3]=std2;
		
	//	System.out.println(objs[0].getClass().getName());
	//	System.out.println(objs[3].getClass().getName());
		
		for(Object obj:objs)
		{
			if(obj instanceof Employee) {
				Employee emp=(Employee)obj;
				System.out.println(emp.empId+" "+emp.name);
			}
			else if(obj instanceof Student) {
				Student std=(Student)obj;
				System.out.println(std.rollNo+" "+std.name);
			}
			else
				System.out.println(obj);
		}
		for(int n:ad.m1(ad.arr11)) {
			System.out.println(n+" ");
		}

	} 
	
	//java.util.arrays
	//Arrays.sort();
	//Arrays.binarySearch();
	//Arrays.copyOf();
	//Arrays.copyOfRange();
	//passing array as an input argument and return array
	//square array of numbers from 0-10
	
	int[] m1(int[] arr) {
		int[] ar=new int[arr.length];
		int index=0;
		for(int num:arr)
		{
			ar[index++]=num*num;
			
		}
		return ar;
	}
	

}
