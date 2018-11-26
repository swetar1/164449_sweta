package framework;

import java.util.ArrayList;
import java.util.ListIterator;

public class arrayback {
public static void main(String args[]){
	ArrayList<Integer> list= new ArrayList<Integer>();
	list.add(20);
	list.add(30);
	list.add(50);
	list.add(40);
	ListIterator listIterator = list.listIterator(list.size());
	while(listIterator.hasPrevious())
	System.out.println(listIterator.previous());
	
}
}
