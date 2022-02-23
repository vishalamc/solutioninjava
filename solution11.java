/*
Create an application which generate electricity bill from the following conditions:
Condition 1. If meter reading is more then 100 chargeable amount will be 6.95 Rs per unit.
Condition 2. If meter reading is less then or equal to 100 chargeable amount will be 5.95 Rs per unit.
*/

import java.util.*;

class MainClass
{
	
	public static void main(String []args)
	{
		int unit,actualunit;
		double result;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter meter unit");
		unit=in.nextInt();
		 if(unit>100) 
 		{
 			actualunit = unit - 100;
			result =(100*5.95)+(actualunit * 6.95);
 		}
 		else
 		{
 			result = unit * 5.95;
 		}
			System.out.println("You have to pay: "+ result);
	}
}