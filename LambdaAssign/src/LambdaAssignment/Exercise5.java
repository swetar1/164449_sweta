package LambdaAssignment;

import java.util.ArrayList;
import java.util.function.Function;

public class Exercise5 {
public static void main(String[] args) {
	ArrayList<String>names= new ArrayList<String>();
	 names.add("khyati");
	 names.add("shweta");
	 names.add("bhavika");
	 System.out.println(constructString(names,(i)->i.substring(0,1)));
	
	
}
	
	static StringBuilder constructString(ArrayList<String>a,Function<String,String>p)
{ StringBuilder str= new StringBuilder();
for(String i:a){
	str.append(p.apply(i));
	
}
return str;
}
		}

