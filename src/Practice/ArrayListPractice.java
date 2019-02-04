package Practice;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		Employee e1=new Employee("Tom",24,"admin");
		Employee e2=new Employee("Peter",25,"Dev");
		Employee e3=new Employee("Steve",26,"QA");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e1);
		//foreach loop
		System.out.println("****Printing values using ForEach Loop****");
		for(Employee e:list)
			System.out.println("Employee Info  "+e.name+"  "+e.age+"  "+e.dept);
		//using iterator
		
		
		System.out.println("****Printing values using For Loop****");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i).name+list.get(i).age+list.get(i).dept);
		System.out.println("****Printing values using Iterator****");
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext())
		{
			Employee e= itr.next();
			System.out.println("Employee Info  "+e.name+"  "+e.age+"  "+e.dept);
		}
		
		

	}

}
