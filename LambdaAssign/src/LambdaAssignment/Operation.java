package LambdaAssignment;

public class Operation {
public static void main(String[] args) {
	 Operation1 s =(a,b)->a+b;
		 System.out.println("addition="+s.Calci(5,2));
	
	Operation1 t =(a,b)->a-b;
System.out.println("addition="+t.Calci(5,2));

Operation1 q =(a,b)->a*b;
System.out.println("addition="+q.Calci(5,2));

Operation1 r =(a,b)->a+b;
System.out.println("addition="+r.Calci(5,2));

}
	
}

