package day6;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Descend ds=new Descend();
		
		TreeSet<Integer> ts=new TreeSet<Integer>(ds);
		//add elements
		ts.add(30);
		ts.add(47);
		ts.add(25);
		ts.add(50);
		ts.add(16);
		
		System.out.println("Sorted in descending order");
		//iterating
		for(Integer e:ts) {
			System.out.println(e);
		}
	}

}
