/*
 * 	Collection - TO represent group of elements as a single entity
 * Stream - To process collection of objects
 * 1.8v
 */

package day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {10,20,30,40,50,10,55};
		List<Integer> list=Arrays.asList(arr);
		
		//create stream object
		Stream s=list.stream();
		long cnt=s.count();
		System.out.println(cnt);
		//count
		System.out.println(list.stream().count());
		//filter
		List<Integer> x1 = list.stream().filter(el->el>40).collect(Collectors.toList());
		System.out.println(x1);
		
		List<Integer> dis = list.stream().distinct().collect(Collectors.toList());
		System.out.println(dis);
		//even elements
		List<Integer> even = list.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		//map() - to apply a function on all elements
		List<Integer> square = list.stream().map(num->num*num).collect(Collectors.toList());
		System.out.println(square);
		
		//increment all values by 10
		List<Integer> imp10 = list.stream().map(num->num+10).collect(Collectors.toList());
		System.out.println(imp10);
		
		//sort in asc
		List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		//sort in desc
		List<Integer> sortdes = list.stream().sorted((x,y)->x>y?-1:1).collect(Collectors.toList());
		System.out.println(sortdes);
		/*(i1, i2) -> {
			if(i1<i2)
				return -1;
			else if(i1>i2)
				return 1;
			else
				return 0;
		}*/
		list.stream().forEach(num->System.out.print(num+" "));
		System.out.println();
		int res = list.stream().min((i,j)->i>j?1:-1).get();
		System.out.println(res);
	}

}
