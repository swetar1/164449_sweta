package FOrEach;
import java.util.*;
public class Iterate {
public static void main(String[] args) {
	List<String>list=new ArrayList<String>();
	list.add("ram");
	list.add("dam");
	list.add("cam");
	list.add("fam");
	list.add("gam");
	list.remove("ram");
	list.forEach((names)->System.out.println(names));
}
}
