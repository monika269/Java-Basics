
/*
 * unary operator
 * Binary :
 * arithmetic operator
 * logical operator
 * bitwise operator
 * relational operators
 * assignment operators
 * ternary : :?
 * 
 * Flow control statements
 * 
 * Decision/conditional statements
 * if(cond){
 *  //logic
 *  }
 *  else if
 *  switch -----> byte,short,int,char and string
 *  
 *  Jump statements
 *  goto
 *  break
 *  continue
 *  
 *  Loop statements
 *  while
 *  do-while
 *  for
 *  
 * foreach loop
 * for(int i:array){
 *  //logic
 * }
 * 
 */


package day2;

public class OperatorsDemo {
	public static void main(String args[]) {
	
		OperatorsDemo od=new OperatorsDemo();
	int i=0;
	System.out.println(++i);
	System.out.println(i++);
	System.out.println(i--);
	
	//add 10 numbers
	int sum=0;
	/*for(int j=0;j<10;j++)
	{
		sum+=j;
	}
	
	System.out.println(sum);
	//add all numbers from 0-9 except 5
	for(int j=0;j<10;j++)
	{
		if(j==5) {
			continue;
		}
		sum+=j;
	}*/
	/*for(int j=0;j<10;j++)
	{
		if(j%2==0)
			sum+=j;
	}
	
	System.out.println(sum);*/
	int k=0;
	while(k%2==0) {
		sum+=k;
		k++;
	}
	System.out.println(sum);
	
	//find given year is a leap year or not.
	int year=2000;
	if(year%4==0) {
		if(year%100==0) {
			if(year%400==0) {
				System.out.println("Given year is leap year");
			}
			else {
				System.out.println("Given year is not a leap year");
			}
		}
		else {
			System.out.println("Given year is not a leap year");
		}
	}
	else
		System.out.println("Given year is not a leap year");
	
	}
}
