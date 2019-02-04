package Practice;

import java.util.Scanner;

public class Palindrome extends StringReverse{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be verified");
		String str1=sc.nextLine();
		String str2=StringReverse.stringReverse(str1);
		System.out.println("The Reverse String is  "+str2);
		if(str1.equals(str2))
		{
			System.out.println("Given string is Palindrome");
		}
		else
		{
			System.out.println("Given string is NOT a Palindrome");
		}
	}

}
