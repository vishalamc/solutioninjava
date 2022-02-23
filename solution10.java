/*Create an application where you have to calculate total amount in a Piggy bank. A piggy bank having 10 Rs coin, 5 Rs coin, 2 Rs coin and 1 Rs coin.*/

import java.util.*;

class MainClass
{
	
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 10 Rs coins");
		int value10 =in.nextInt();
		System.out.println("Enter 5 Rs coins");
        	int value5 = in.nextInt();
		System.out.println("Enter 2 Rs coins");
 		int value2 = in.nextInt();
		System.out.println("Enter 1 Rs coins");
 		int value1 = in.nextInt();
 		int result = (10 * value10) + (5 * value5) + (2 * value2) + (1 * value1);
		System.out.println("Total amount:"+result);
	
	}


}