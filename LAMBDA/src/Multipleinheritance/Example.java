package Multipleinheritance;

public abstract class Example implements MyInterface, MyInterface2 {
	public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public void disp(String str){
    	System.out.println("String is: "+str); 
    }
    //Implementation of duplicate default method
    public void newMethod(){  
        System.out.println("Implementation of default method");  
    }  
    public static void main(String[] args) {  
    	Example obj = new Example();
    	
    	//calling the default method of interface
        obj.newMethod();     
  
  
    }  
}
