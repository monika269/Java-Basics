package day4;

public class ClassC extends ClassB{
	int x=10;
	int y=30;
	int z=10;
	void method1() {
		System.out.println("Class c method1");
	}
	void method2() {
		System.out.println("Class c mehtod 2");
	}
	public static void main(String[] args) {
		ClassB b=new ClassB();
		System.out.println(b.x);
		System.out.println(b.y);
		b.method1();
		b.method2();
		
		ClassC c=new ClassC();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		c.method1();
		c.method2();
		
		ClassA a=new ClassA();
		System.out.println(a.x);
		a.method1();
	}
}
