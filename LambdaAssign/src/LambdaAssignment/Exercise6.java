package LambdaAssignment;

import java.util.ArrayList;
import java.util.List;




public class Exercise6 {


	public static void main(String[] args) {
		
	List<String>drop=new ArrayList<String>();
	drop.add("khyati");
	drop.add("sweta");
	drop.add("anu");
 
	 drop.replaceAll(String::toUpperCase);
	 System.out.println(drop);
}
}
		
		