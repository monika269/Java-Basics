
/*
 * 	Collection - represent group of objects as a single entity
 *  pkg - java.util
 * Iterable(I)
 *  Collection(I)
 *  List(I)
 *  	ArrayList(C)-
 *  		Heterogeneous elements
 *  		Duplicate elements allowed
 *  		Insertion order is maintained
 *  		Iterate-
 *  			for,foreach,iterator,listIterator
 *  		UnderLying datastructure - arrays
 *  		random Access
 *  		No thread safety
 *  
 *  	LinkedList(C)
 *  		Heterogeneous elements
 *  		Duplicate elements allowed
 *  		Insertion order is maintained
 *  		Iterate-
 *  			for,foreach,iterator,listIterator
 *  		UnderLying datastructure - doubly linked list
 *  		Manipulations
 *  		No thread safety
 *  		
 *  	Vector(C)
 *  		Heterogeneous elements
 *  		Duplicate elements allowed
 *  		Insertion order is maintained
 *  		Iterate-
 *  			for,foreach,iterator,listIterator
 *  		UnderLying datastructure -
 *  		
 *  	Stack(C)
 *  
 *  Set(I)
 *  Queue(I)
 *  
 *  Map(I)
 * 
 */


package day6;
import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("ab");
		al.add(10);
		al.add(10.4f);
		al.add('c');
		
		//Generic ArrayList
		ArrayList<String> all=new ArrayList<String>();
		all.add("abc");
		all.add("xyz");
		//addAll,clear,isEmpty,toArray,subList,contains,remove,sort
		
		al.addAll(all);
		System.out.println(al);
		al.retainAll(all);
		System.out.println(al);
		
		System.out.println(al.contains("ab"));
		
		Object[] arr=all.toArray();
		for(Object obj:arr) {
			System.out.println(obj);
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//foreach
		for(Object a1:al) {
			System.out.println(a1);
		}
		//Iterator
	Iterator iter=al.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	//listiterator
/*	ListIterator litr=al.listIterator();
	while(litr.hasNext()) {
		System.out.println(litr.next());
	}*/
	List<Integer> v=new Vector<>();
	v.add(7);
	v.add(78);
		
	}
	//Vector<Integer> v2=new Vector<>();

	//stack
	/*Stack<Integer> st=new Stack<>();
	st.add(45);
	st.add(20);
	st.addElement(30);
	st.push(35);*/
}
