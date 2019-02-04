package Practice;

import java.util.Scanner;

public class SwapNoWoTemp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos to be swapped");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("A =   "+a);
		System.out.println("B =   "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("######Nos after Swapping#####");
		System.out.println("A =   "+a);
		System.out.println("B =   "+b);

	}

}
