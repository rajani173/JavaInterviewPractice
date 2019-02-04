package Practice;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the number to be reversed");
		 int number=sc.nextInt();
		 int mod,div=0;
		 while(number>0)
		 {
			 div=number%10+div*10;
			 number=number/10;
			
		 }
		 
		 System.out.println("The reverse of the number is  "+div);
			 
	}

}
