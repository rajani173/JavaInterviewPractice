package Practice;

import java.util.Scanner;

public class PrimeNo {
 
	static void primeORNot(int n)
	{
		int counter=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				counter++;
				break;
			}
			
		}
		if(counter>0)
		{
			System.out.println(n +"    is not a prime");	
		}
		else
		{
			System.out.println(n +"    is a prime");
		}
		
	}
	public static void main(String[] args) {
	
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      primeORNot(number);
      
	}

}
