package Collections;
import java.util.LinkedList;
import java.util.Collections;

public class Linked {
public static void main(String args[]){
	LinkedList<String>ll= new LinkedList<String>();
	ll.add("Green");
	ll.add("yellow");
	ll.add("blue");
	ll.add("black");
	ll.add("red");
	System.out.println("Size of linked List"+ll.size());
	System.out.println("contents of linked List"+ll);
	System.out.println("Does linked list contain sweta?"+ll.contains("sweta"));
	System.out.println("Adding element in the list at first position:");
	ll.addFirst("orange");
	
	System.out.println("11"+ll);
	System.out.println("adding element at the end of the list");
    ll.addLast("purple");
    System.out.println("ll"+ll);

	
	
}
}
