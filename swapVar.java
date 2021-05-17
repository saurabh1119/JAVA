// Java program to swap two variables

import java.util.*;
class swapVar
{
		
	public static void main(String args[])
	{
		Scanner at= new Scanner(System.in);
		System.out.println("Enter Two Number:");
		int a= at.nextInt();
		int b= at.nextInt();
		int temp;

		System.out.println("You have entered :");
		System.out.print("a="+a);
		System.out.println(" b="+b);

			temp=a;
			a=b;
			b=temp;
		 
		System.out.println(" After Swapping :");
		System.out.print("a="+a);
		System.out.print(" b="+b);

	}
}


