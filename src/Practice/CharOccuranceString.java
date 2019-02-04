package Practice;

import java.util.Scanner;

public class CharOccuranceString {
	
	void charOccurance(String s,char c)
	{
		System.out.println("String is  "+s);
		System.out.println("character is   "+c);
		int counter=0;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
				counter++;
			}
		}
		if(counter>0)
		{
			System.out.println("The Character   "+c+"   occured "+ counter +"  times in the given string   "+s);
		}
		else
		{
			System.out.println("the given character is no present in the String");
		}
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.nextLine();
	System.out.println("Enter the character");
	char ch=sc.next().charAt(0);
	CharOccuranceString obj=new CharOccuranceString();
	obj.charOccurance(str, ch);
	}

}
