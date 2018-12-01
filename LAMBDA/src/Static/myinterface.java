package Static;

public interface myinterface {
default void newmethod(){
	System.out.println("hiiii here Mumbai");
	System.out.println("byeeee");
}
static void verynewmethod(){
	System.out.println("in Bangaluru!");
	System.out.println("nooooo");
}
void existingMethod(String str);  
}  

