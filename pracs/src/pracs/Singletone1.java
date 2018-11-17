package pracs;

public class Singletone1 {
	
		private static Singletone1 get_instance=null;
		private Singletone1(){
			
		}
		public static Singletone1 get_instance(){
			System.out.println("\n Singletone1 get_instance");
			if(get_instance==null){
				System.out.println("Value of get_instance updated");
				get_instance=new Singletone1();
				
			}
			return get_instance;
		}
		public static void main(String args[])
		{
			Singletone1 singletone= Singletone1.get_instance();
			System.out.println(singletone.hashCode());
		     
			Singletone1 singletone2= Singletone1.get_instance();
			System.out.println(singletone.hashCode());
		
			Singletone1 singletone3= Singletone1.get_instance();
			System.out.println(singletone.hashCode());
		
		
		
		}
		
	}

