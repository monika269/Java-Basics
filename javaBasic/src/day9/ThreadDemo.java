package day9;

class MyThread5 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}
	public void start() {
		System.out.println("Start Method");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 mt1=new MyThread5();
		mt1.start();
		System.out.println(Thread.activeCount());
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
