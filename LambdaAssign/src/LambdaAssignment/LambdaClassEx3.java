package LambdaAssignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaClassEx3 {
	
	
		public static void main(String[] args) {
			String str="Shwetaa";
			
			Consumer<String> cons=(arg)->{};
			cons.accept(str);
			Supplier<String> sup=()->str;
			System.out.println(sup.get());
			Predicate<Integer>predi=a->(a>20);
			System.out.println(predi.test(30));
			Function<Integer,Integer> fun=a->(a*a);
			System.out.println(fun.apply(2));
		}
	}

