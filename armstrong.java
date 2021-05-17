import java.util.Scanner;


class armstrong
{
	public static void main(String args [])
	{   int num;
		Scanner nm = new Scanner(System.in);
		num = nm.nextInt();
		int temp = num;
		int sum = 0;
		int r;
		while(num!=0)
		{ 
			r = num%10;
			sum = sum + r * r * r;
			num = num/10;
		}
		if(temp==sum)
			System.out.println("its armstrong");
		else
			System.out.println("its not armstrong");
	}
}