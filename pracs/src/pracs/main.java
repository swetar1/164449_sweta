package pracs;

class Singletone1 {
	 
		// static variable single_instance of type Singleton 
		private static Singletone1 single_instance = null; 

		// variable of type String 
		public String s; 

		// private constructor restricted to this class itself 
		private Singletone1() 
		{ 
			s = "Hello I am a string part of Singleton class"; 
		} 

		// static method to create instance of Singleton class 
		public static Singletone1 getInstance() 
		{ 
			if (single_instance == null) 
				single_instance = new Singletone1(); 

			return single_instance; 
		} 
	} 

	// Driver Class 
	public class Main { 
		public static void main(String args[]) 
		{ 
			// instantiating Singleton class with variable x 
			Singletone1 x = Singletone1.getInstance(); 

			// instantiating Singleton class with variable y 
			Singletone1 y = Singletone1.getInstance(); 

			// instantiating Singleton class with variable z 
			Singletone1 z = Singletone1.getInstance(); 

			// changing variable of instance x 
			x.s = (x.s).toUpperCase(); 

			System.out.println("String from x is " + x.s); 
			System.out.println("String from y is " + y.s); 
			System.out.println("String from z is " + z.s); 
			System.out.println("\n"); 

			// changing variable of instance z 
			z.s = (z.s).toLowerCase(); 

			System.out.println("String from x is " + x.s); 
			System.out.println("String from y is " + y.s); 
			System.out.println("String from z is " + z.s); 
		} 
	} 


