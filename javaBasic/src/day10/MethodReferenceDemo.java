/*
 * 	static method reference
 * 	instance method reference
 * 	constructor reference
 * 
 */

package day10;

class MyThread implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	static int m1(int num1,int num2) {
		return num1+num2;
	}
}
@FunctionalInterface
interface Intf1{
	int add(int x,int y);
}

interface Intf3{
	//Employee getEmployee();
	Employee getEmployee(int id,String name);
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	MyThread mt=new MyThread();
			Thread t1=new Thread(mt);
			Thread t2=new Thread(mt);
			t1.start();
			t2.start();*/
			
		//option 2
			Runnable r=()->{
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			
			Thread t3=new Thread(r);
			t3.start();
			System.out.println(Thread.activeCount());
			//option 3 - using method reference
			//ClassNameContained::StaticMethodName; //static method reference
			//ObjectName::instanceMethodName; // instance method reference
			//ClassNAme::new;//constructor reference
			MyThread mt1=new MyThread();
			Runnable r1=mt1::run;
			Thread t4=new Thread();
			t4.start();
			
			//ex: static method reference
			//ClassName::methodName
			Intf3 i2=Employee::new;
			Employee emp1=i2.getEmployee(101,"Ram");
			Employee emp2=i2.getEmployee(102,"Raj");
			Employee emp3=i2.getEmployee(103,"Ravi");
			
			System.out.println(emp1.empName);
			System.out.println(emp2.empName);
			System.out.println(emp3.empName);
			
			
			System.out.println(Thread.activeCount());
			//static method reference
			Intf1 i1 = MyThread::m1;
			System.out.println(i1.add(30, 40));
			Thread t5=new Thread();
			t5.start();
			
	}

}
