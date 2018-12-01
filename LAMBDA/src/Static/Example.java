package Static;

public class Example implements myinterface{

	    public void existingMethod(String str){           
	        System.out.println("String is: "+str);  
	    }  
	    public static void main(String[] args) {  
	    	Example obj = new Example();
	    	
	    	//calling the default method of interface
	        obj.newmethod();     
	        //calling the static method of interface
	        myinterface.verynewmethod();
	        
	        obj.existingMethod("Java 8 is easy to learn"); 
	        
	  
	    }  
	}


