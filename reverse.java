import java.util.Scanner;


class reverse
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
			sum = sum * 10 + r ;
			num = num/10;
		}
		System.out.println(sum);
		
	}
}