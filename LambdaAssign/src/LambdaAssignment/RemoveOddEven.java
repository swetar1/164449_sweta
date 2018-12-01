package LambdaAssignment;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveOddEven {
	
	  public static void main(String[] args) {
	 
	  ArrayList<String> name_list= new ArrayList<>();
	      
	  name_list.add("Sweta");
	  name_list.add("Siddhi");
	  name_list.add("Shubham");
	  name_list.add("Shasheen");
	  name_list.add("khyati");  
	 
	  System.out.println("List of names");
	  System.out.println(name_list);
	  
	  name_list.removeIf(n -> (n.length()) % 2 == 0); 
	  
      
      for (String i : name_list) { 
          System.out.println(i); 
      } 
	 /* 
	  ArrayList<String>longnames= (ArrayList<String>)removeIf.filter(str ->str.length()/2==0).collect(Collectors.toList());
	  
	  longnames.forEach(System.out::println);
	*/
	 }
	}