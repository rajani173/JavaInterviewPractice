package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorJava {

	public static void main(String[] args) {
		ArrayList<String> strList=new ArrayList<String>();
		strList.add("Rajani");
		strList.add("Y");
		strList.add("Yalamarthy");
		Iterator<String> itr=strList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(String s:strList)
			System.out.println(s);
		
	}

}
