package Practice;

import java.util.Scanner;

public class Factorial {

	static long factorial(int n)
	{
		long fact=1;
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
		
	}
	public static void main(String awq[]) {
		
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the NUmber");
      int no=sc.nextInt();
      long factorial=Factorial.factorial(no);
      System.out.println("#### Factorial of the given number  "+no+"  is   "+factorial+"     #####");
	}

}
