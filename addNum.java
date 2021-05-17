/*Java program that takes two numbers as input and display the product of
two numbers
*/
import java.util.*;
import java.lang.*;

class addNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers:");
		int a= sc.nextInt();
		System.out.println("You have entered number A :"+a);
		int b= sc.nextInt();
		System.out.println("You have entered number B :"+b);

		System.out.println(a + " x " + b + " = " + a * b);
	}
}