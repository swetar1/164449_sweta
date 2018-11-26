package framework;

import java.util.Hashtable;

public class Employee1 {

	public static void main(String[] args) {
		Hashtable<employee, Integer> hash=new Hashtable<>();
		employee e1 = new employee(1,"sweta");
		hash.put(e1,2);
		employee e2 = new employee(1,"sweta");
		hash.put(e2, 2);
		employee e3 = new employee(2,"siddhi");
		hash.put(e3,3);
		employee e4 = new employee(4,"manan");
		hash.put(e4,4);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(hash.get(e1));
		System.out.println(hash.get(e2));
		System.out.println(hash.get(e3));
	}

}
