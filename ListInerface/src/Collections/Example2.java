package Collections;
import java.util.*;
public class Example2 {
public static void main(String args[]){
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("enter the elements in the array:");
	al.add("sweta");
	al.add("siddhi");
	al.add("shubham");
	al.add("darshan");
	al.add("Shasheen");
	al.add(1,"A2");
	System.out.println("Size of al after additions:"+al.size());
	System.out.println("contents of array :"+al);
	al.remove("sweta");
	System.out.println("Size of al after deletion:"+al.size());
	System.out.println("contents of array:"+al);
}
}
