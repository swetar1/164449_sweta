package framework;
import framework.Person;
import java.util.Iterator;
import java.util.TreeSet;

public class per {
	public per(String string, int i, double d) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){
        TreeSet<Person> ts= new TreeSet<Person>(new Compare());
		Person person1= new Person("sweta",50,5.6);
		Person Person2= new Person("ram",60,6);
		Person Person3= new Person("lucky",45,5.9);
		
		ts.add(person1);
		ts.add(Person2);
		ts.add(Person3);
	
	Iterator<Person> i= ts.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}
	
	}
	

}
