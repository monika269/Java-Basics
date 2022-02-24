package day9;

import java.util.ArrayList;
import java.util.Collections;

@FunctionalInterface
interface Intf1{
	boolean isEven(int num);
	
	//supports default and static methods
}
@FunctionalInterface
interface Intf2{
	String greet(String name);
}
@FunctionalInterface
interface Intf3{
	int add(int a,int b);
	default int sub(int a,int b) {
		return a-b;
	};
	
	static int mul(int x,int y) {
		return x*y;
	};
}
@FunctionalInterface
interface Intf4{
	void helloWorld();
}
@FunctionalInterface
interface Intf5{
	int squareNum(int num);
}
@FunctionalInterface
interface Intf6{
	String concat(String s1,String s2);
}

interface Intf7{
	int getOddCount(ArrayList<Integer> al);
}
interface Intf8{
	int getMin(ArrayList<Integer> al);
}
interface Intf9{
	int getMax(ArrayList<Integer> al);
}

public class LambdaExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf1 even=(int num)->
		{
			if(num%2==0) {
				return true;
			}
			else
				return false;
		};
		System.out.println(even.isEven(10));
		
		Intf2 gr=(String name) -> "Hello"+name;
		System.out.println(gr.greet("Kumar"));
		//lambda func
		Intf3 a=(int x,int y) -> x+y;
		System.out.println(a.add(10,20));
		
		Intf4 hw=() -> System.out.println("Hello World!");
		hw.helloWorld();
		
		//square number
		Intf5 s=(int num) -> num*num;
		System.out.println(s.squareNum(5));
		
		//concatenation
		Intf6 sc=(String s1,String s2) -> s1+s2;
		System.out.println(sc.concat("Hi", " User!"));

		ArrayList<Integer> al=new ArrayList<>();
		al.add(70);
		al.add(75);
		al.add(45);
		al.add(30);
		al.add(80);
		al.add(65);
		al.add(40);
		al.add(55);
		al.forEach(name -> System.out.println(name));
		
		System.out.println("Values greater than 50");
		al.forEach(ele -> {if(ele>50)
		{
			System.out.println(ele);
		}
		});
		
		//return even numbers
		System.out.println("Even numbers ");
		al.forEach(ele -> {if(ele%2==0)
		{
			System.out.println(ele);
		}
		});
		
		//get oddcount
		Intf7 values=(ArrayList<Integer> a1) ->
		{
			int cnt=0;
			for(int num:a1) {
				if(num%2!=0)
					cnt++;
			}
			return cnt;
		};
		System.out.println("Odd numbers count"+values.getOddCount(al));
		
		//sort
		Collections.sort(al,(o1,o2) -> (o1<o2)? -1 :(o1>o2) ? 1 : 0);
		System.out.println(al);
		
		//find min and max
		Intf8 mi=(ArrayList<Integer> a1) -> a1.get(0);
		System.out.println(mi.getMin(al));
		
		Intf9 ma=(ArrayList<Integer> a1) -> a1.get(al.size()-1);
		System.out.println(ma.getMax(al));
		
	
	}
	 //isEven
	boolean isEven(int num) {
		if(num%2==0)
			return true;
		return false;
	}
	String greet(String name) {
		return "Hello"+name;
	}
	void helloWorld() {
		System.out.println("Hello World!");
	}
	//square the given num
	//concatenate strings
	//Iterate collections using foreach
	//hint : ArrayList<Integer> al=new ArrayList<>();
	//al.forEach(//lambda expr to print arraylist elements);
	//return values greater than 50
	//return even numbers
	//get odd numbers count
	//sort in ascending order
	//find max and min element


}
