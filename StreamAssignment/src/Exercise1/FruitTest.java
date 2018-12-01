package Exercise1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FruitTest {
public static void main(String[] args) {
	ArrayList<Fruit> list= new ArrayList<Fruit>();
	
     list.add(new Fruit("Apple",89,180,"red"));
     list.add(new Fruit("mango",550,500,"green"));
     list.add(new Fruit("orange",80,100,"orange"));
     list.add(new Fruit("banana",54,24,"yellow"));
     list.add(new Fruit("grapes",841,800,"purple"));
     
     //Based on Calories.
     System.out.println("calories < 100 sorted in descending order of calories.");
     List<Fruit>str= list.stream().filter(st->st.getCalories() <100).collect(Collectors.toList());
     str.forEach(x->System.out.println(x.getName()));
     System.out.println("---------------------------------------------------------------------------");
     
     //Based on Colors.
     System.out.println("names based on colors:");
     List<Fruit>str1= list.stream().collect(Collectors.toList());
     str.forEach(x->System.out.println(x.getColor() +":"+ x.getName()));
     System.out.println("---------------------------------------------------------------------------");
     
     //Red Color with Price:
     System.out.println("names based on Red color and price:");
     List<Fruit>str2= list.stream().filter(xt->xt.getColor().equals("red")).collect(Collectors.toList());
     str2.forEach(x->System.out.println(x.getColor() +":"+ x.getName() +":"+ x.getPrice()));
     System.out.println("---------------------------------------------------------------------------");
     
     

}
}
