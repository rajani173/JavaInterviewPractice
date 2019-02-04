package Practice;

public class OverloadingMain {
	
 
	public static void main(String[] args) {
      System.out.println("Main Method-1");
      main(3);
      main("args",3);
      int k=main(3,4);

	}
	
	 static void main(int a)
	{
		System.out.println("Main Method-2");
	}
	 
	 static void main(String s,int a)
	 {
		 System.out.println("Main Method-3");
	 }
	 
	 
	 static int main(int d,int e)
	 {
		 System.out.println("Main Method-4");
		 return 5;
	 }

}
