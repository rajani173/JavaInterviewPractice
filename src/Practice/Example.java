package Practice;

public class Example {

	
	Example()
	{
		System.out.println("Constructor 1");
	}
	
	Example(int a){
		System.out.println("Constructor 2");
	}
	public static void main(String[] args) {
		System.out.println("Inside Main");
		Example e=new Example();
		Example e1=new Example(2);

	}

}
