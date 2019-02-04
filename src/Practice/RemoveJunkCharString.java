package Practice;

import java.util.Scanner;

public class RemoveJunkCharString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		System.out.println("The given String is   "+s);
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
		
		
		
		
		
		}
		
		
		
}


