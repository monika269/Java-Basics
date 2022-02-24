
/*
 * 	Map(I)
 * 		HashMap(C)
 * 		LinkedHashMap(C)
 * 		SortedMap(I)
 * 		TreeMap(C)
 * 
 * Store data which is in the form of key,value pair
 * 
 * HashMap()-
 * Map map=new HashMap();
 * HahsMap hm=new HashMap();
 * 
 * Map<String,Integer> map=new HahsMap();
 * HashMap<String,Integer> map=new HashMap<>();
 * 
 * Collection
 * 	List,Set,Queue
 * 
 * List(I)
 * 	ArrayList,LinkedList,Vector,Stack
 * List list=new Stack();
 * Stack list=new Stack();
 * 	duplicate keys-won't allowed
 * 	duplicate values - allowed
 * 	order of insertion - won't maintain
 * 	null keys - allowed
 * 	Only one null key allowed
 * 	null values-allowed
 * 	any no.of null values allowed
 * 
 */



package day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> marks=new HashMap<>();
		marks.put("Ram",78);
		marks.put(null, null);
		marks.put("Ram",80);
		marks.put("Kavitha", null);
		System.out.println(marks);
		
		Map<Employee,Employee> employees=new HashMap<>();
		Employee emp1=new Employee(1001,"Ram");
		Employee emp2=new Employee(1002,"jhon");
		Employee emp3=new Employee(1003,"Sam");
		Employee emp5=new Employee(1003,"Sam");
		Employee emp4=emp1;
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());
		System.out.println(emp5.hashCode());
		
		employees.put(emp1,emp1);
		employees.put(emp2,emp2);
		employees.put(emp3,emp3);
		employees.put(emp4,emp4);
		employees.put(emp5,emp5);
		
		System.out.println(employees);
		
		Map<String,String> hs=new HashMap<>();
		hs.put(new String("a"), "Sam");
		hs.put(new String("a"), "Ram");
		//hashcodes are same
		
		System.out.println(hs);
		
		//linkedhashmap
		Map<String,Integer> marks1=new LinkedHashMap<>();
		marks1.put("Ram",78);
		marks1.put("Sam", 90);
		marks1.put("Ram", 80);
		marks1.put(null, null);
		marks1.put(null, 100);
		marks1.put("Kavitha", null);
		
		System.out.println(marks1);
		
		//TreeMap - sorted order
		Map<Integer,String> tm=new TreeMap();
		tm.put(2001,"Kavitha");
		tm.put(2005,"Ramesh");
		tm.put(2003,"Sachin");
		tm.put(2004,"Harsha");
		//tm.put(null,null);
		tm.put(2001,"Kavitha");
		tm.put(2001,"Kavya");
		
		System.out.println(tm);
		
		Map<Employee,Employee> tm1=new TreeMap<>();
		tm1.put(emp1, emp1);
		tm1.put(emp2, emp2);
		tm1.put(emp3, emp3);
		tm1.put(emp4, emp4);
		tm1.put(emp5, emp5);
		
		System.out.println(tm1);
		
		//convert Map into SetView
		System.out.println();
		Set<Entry<Employee, Employee>> entries = tm1.entrySet();
		for( Entry<Employee, Employee> en: entries ) {
			System.out.print(en.getKey() +"="+en.getValue());  // returns key value
			System.out.println();
		}
		System.out.println();
		// Option 2
		 Iterator itr = entries.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 System.out.println(tm1.get(emp1));
		 // keySet()
		
	}

}
