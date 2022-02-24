
/*
 * 	Multi threading
 * 	Multitasking - Executing more than one task
 * 	Multi processing
 * 	Each process will have its own memory
 * 	Communication btw process is expensive
 * 	Ex:notepad,word,mp3 player,browser
 * 
 * Multi threading
 * 
 * uses shared memory
 * Threads are part of process
 * Gaming applications
 * 
 * ways to create multi threading
 * 1.Implementing Runnable interface
 * 2.Extending Thred class
 * 
 * We should override run method
 * run()
 * start() - start thread
 * priority  MAX,MIN,NORMAL
 * 			0-10 range
 * 			5-default
 * No.of threads created by default - main thread
 * 
 * 
 */

package day9;

interface IntfA{
	void m1();
}
interface IntfB{
	void m1();
}
interface IntfC{
	void m1();
}

class Test implements IntfA,IntfB,IntfC{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

class ClassA{
	void m1() {
		System.out.println("ClassA m1()");
	}
}
class ClassB{
	void m1() {
		System.out.println(" ClassB m1()");
	}
}
class MyThread extends ClassA implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	public void start() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		//Thread t2=new Thread(mt);
		//t2.start();
		System.out.println(Thread.activeCount());
		t.setName("My Thread");
		t.start();
		System.out.println("t thread priority "+t.getPriority());
		System.out.println("main thread priority "+Thread.currentThread().getPriority());
		System.out.println(Thread.activeCount());
	//	test1.m1();
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
