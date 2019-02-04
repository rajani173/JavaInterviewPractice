package Practice;

import java.util.Scanner;

public class LargestSmallestinArray {

	public static void main(String[] args) {
		int[] array1=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements to be entered into an array");
		int k=sc.nextInt();
		System.out.println("Enter the elements intp an array");
		for(int i=1;i<=k;i++)
		{
			array1[i]=sc.nextInt();
		}
		
        int small=array1[1];
        for(int i=2;i<=k;i++)
        {
        	if(small>array1[i])
        	{
        		small=array1[i];
        	}
        }
        
        System.out.println("The smallest no in the array1 is   "+small);
        
        int large=array1[1];
        for(int i=2;i<=k;i++)
        {
        	if(large<array1[i])
        	{
        		large=array1[i];
        	}
        }
        
        System.out.println("The largest no in the array1 is   "+large);
        
	}

}
