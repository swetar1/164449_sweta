package Exercise3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
public static void main(String[] args) {
	Transaction transaction1=new Transaction((new Trader("urvi","Mumbai")), 2000,20000);
	Transaction transaction2=new Transaction((new Trader("kajal","pune")), 1996,25000);
	Transaction transaction3=new Transaction((new Trader("shweta","mangalore")), 1998,30000);
	Transaction transaction4=new Transaction((new Trader("pooja","pune")),2011,31000);
	Transaction transaction5=new Transaction((new Trader("jill","delhi")),2011,35000);
	Transaction transaction6=new Transaction((new Trader("zeel","indore")),2011,19000);

	List<Transaction> listeds=new ArrayList<Transaction>();
	listeds.add(transaction1);
	listeds.add(transaction2);
	listeds.add(transaction3);
	listeds.add(transaction4);
	listeds.add(transaction5);
	listeds.add(transaction6);

	listeds.stream().filter(i->i.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);;
	System.out.println(listeds.stream().map(i->i.Trader.getCity()).distinct().collect(Collectors.toList()));

	System.out.println("list of traders in pune");
	listeds.stream().map(i->i.Trader.getCity()=="pune").sorted().collect(Collectors.toList());
	System.out.println("--------------------------------------------");
	listeds.stream().map(i->i.Trader.getName()).sorted().forEach(System.out::println);

	listeds.stream().filter(i->i.Trader.getCity()=="indore").map(i->i).forEach(System.out::println);
	listeds.stream().map(i->i.Trader.getCity()=="delhi");
		

		
}
}
