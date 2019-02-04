package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {

	static String stringReverse(String str)
	{
		String str1=str;
		String str2 = "";
		int length1=str1.length();
		System.out.println("lenght of string is   "+length1);
		
		for(int i=length1-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		return str2;
	}
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Enter the string to be reversed");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String firststring=br.readLine();
		
		String reversedString=StringReverse.stringReverse(firststring);
		
		System.out.println("The reverse string is   "+reversedString);
		
	}

}
