
/*
 *  Sequence of characters
 *  pkg-java.lang.String
 *  Strings are immutable
 *  
 *  ways to define string:
 *  1.String lateral
 *  String str="Hello";
 *  2.using new keyword
 *  String str=new String("Hello");
 *  
 *  Memory areas :
 *  Heap area - object
 *  stack area - method data & used in threads
 *  Program Counter Register
 *  Class area
 *  Native method area
 */




package day3;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java";//scp
		String str2="Java";//scp
		String str3="Program";//scp
		String str4="java";//scp
		//str1.concat("Program");
		//System.out.println(str1);//java
		//str1=str1.concat("Program");
		//System.out.println(str1);//javaprogram
		String str5=new String("Hello");//heap
		String str6=new String("Hello");
		String str7=str5;
		
		//comparision
		//equals == compareTo
		System.out.println(str1.equals(str2));//content-true
		System.out.println(str1==str2);//reference-true
		System.out.println(str5.equals(str6));
		System.out.println(str5==str6);
		System.out.println(str5.equals(str7));
		System.out.println(str5==str7);
		
		//compareTo - lexographically comparision
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.substring(1,3));
		System.out.println(str1.contains("va"));
		System.out.println(str1.startsWith("J"));
		System.out.println(String.join("-",str1,str3));
		String[] strings=str1.split("a");
		System.out.println(Arrays.toString(strings));
		for(String str:strings) {
			System.out.println(str);
		}
		System.out.println(str1.isEmpty());
	}
}
