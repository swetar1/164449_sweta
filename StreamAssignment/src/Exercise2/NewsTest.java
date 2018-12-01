package Exercise2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class NewsTest {
public static void main(String[] args) {
	

	News news1=new News(1,"Sweta","raj","budget");
    News news2=new News(2,"Rajesh","ram","high");
    News news3=new News(3,"Siddhi","sid","budget");
    News news4=new News(1,"Sweta","shuu","low");
    News news5=new News(4,"Mak","ASH","okay");
    News news6=new News(5,"Sweta","tanu","budget");

    List<News>listed=new ArrayList<News>();
    listed.add(news1);
    listed.add(news2);
    listed.add(news3);
    listed.add(news4);
    listed.add(news5);
    listed.add(news6);

    System.out.println("Find out the newsId which has received maximum comments");
System.out.println(listed.stream().max(Comparator.comparing(News:: getComment)).get().newsId);
System.out.println("\n");
System.out.println("-------");

System.out.println("Find out how many times the word 'budget' arrived in user comments all news");
System.out.println(listed.stream().filter(i->i.getComment().contains("budget")).count());
System.out.println("\n");
System.out.println("user");
System.out.println("--------------------------------------------------");

System.out.println("Find out which user has posted maximum comments.");
System.out.println(listed.stream().max(Comparator.comparing(News:: getPostedByUser)).get().postedByUser);
System.out.println("\n");
System.out.println("-----------------------------------------");


System.out.println(listed.stream().max(Comparator.comparing(News::getPostedByUser)).get().getPostedByUser());
System.out.println("\n");
listed.stream().sorted(Comparator.comparing(News:: getCommentByUser)).map(i->i).forEach(System.out::println);
System.out.println("-------------------------------------------");



}
}
