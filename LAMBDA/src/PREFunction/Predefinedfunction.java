package PREFunction;
import java.util.function.IntBinaryOperator;
public class Predefinedfunction {
public static void main(String[] args) {
	IntBinaryOperator sum = (a,b)->a+b;
	System.out.println("Results:"+sum.applyAsInt(12,3));
}
}
