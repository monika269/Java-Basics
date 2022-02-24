
/*
 * 	java.util.function - pkg
 * 	Predictor
 * 		
 *  Consumer
 *  Supplier
 *  Function
 *  
 *  interface Intf{
 *  	boolean isEven(int num);
 *  }
 */
package day10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Intf{
	boolean isEven(int num);
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf x = (num) -> {
			if(num%2==0) 
				return true;
			return false;
		};
		System.out.println(x.isEven(5));
		
		//Predicate - Takes input of any data type and returns boolean value
		//ex1
		Predicate<Integer> x1 = (num) -> {
			if(num%2==0) 
				return true;
			return false;
		};
		
		System.out.println(x1.test(8));
		
		//ex2
		Predicate<String> s1 = (String str) -> str.startsWith("H");
		System.out.println(s1.test("Hello World"));
		
		//Function - Takes any input data type return any data type
		//public interface java,util.function.Function<T,R>{
		//        public abstract R apply(T);
		// }
		Function<Integer,Integer> square = (num) -> num*num;
		System.out.println(square.apply(10));
		
		//ex2 : find length of the given string
		Function<String,Integer> len= (str) -> str.length();
		System.out.println(len.apply("Name"));
		
		Function<Integer, Integer> cube=(num)->(num*num*num);
		System.out.println(cube.apply(10));
		
		//function chaining
		System.out.println(square.andThen(cube).apply(2));
		System.out.println(square.compose(cube).apply(2));
		
		//public interface java,util.function.Consumer<T>{
				//        public abstract void accept(T);
				// }
		int[] arr= {12,22,32,42,52,62};
		Consumer<int[]> display= (arr1) -> {
			for(int i=0;i<arr1.length;i++) {
				System.out.println(arr1[i]+" ");
			};
		};
		display.accept(arr);
		
		//supplier - no input but return value
		//public interface java.util.function.Supplier<T>{
		//       public abstract T get();
		//}
		
		Supplier<Integer> supplier=()->{
			int idx=(int)Math.random()*5+1;
			System.out.println(idx);
			return arr[idx];
		};
		System.out.println();
		System.out.println(supplier.get());
	}
	boolean isStartsWith(String str,String substring) {
		return str.startsWith(substring);
	}

}
