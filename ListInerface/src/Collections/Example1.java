package Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Example1 {
	public static void main(String args[]){
		List<String> ls= new ArrayList<String>();
		ls.add("one");
		ls.add("apple");
		ls.add("banana");
		ls.add("chickoo");
	    Iterator<String> it=ls.iterator();
	    while(it.hasNext()){
	    	String value=(String)it.next();
	    	System.out.println("Value:"+value);
	    }
	}

}
