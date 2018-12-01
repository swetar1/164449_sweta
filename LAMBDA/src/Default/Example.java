package Default;

public class Example implements MyInterface {
	public void existingMethod(String str){
		System.out.println("String str="+str);
	}
public static void main(String[] args) {
	Example obj = new Example();
	obj.NewMethod();
	obj.existingMethod("oyaaa");
	
	
}
}
