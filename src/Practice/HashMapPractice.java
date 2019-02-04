package Practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Integer,Car> hm=new HashMap<Integer,Car>();
		hm.put(200,new Car("Audi","A4","Diesel"));
		hm.put(300,new Car("Audi","A5","Petrol"));
		hm.put(400,new Car("Tesla","Model3","Power"));
		for(Entry<Integer, Car> e:hm.entrySet())
		{
			System.out.println("Key is"+e.getKey());
			System.out.println("Car Info"+e.getValue().carName+e.getValue().carModel+e.getValue().carFuelType);
		}

	}

}
