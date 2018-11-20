package Monday;

public abstract class persi {
	
		
		public  void presist() {
			// TODO Auto-generated method stub
			
		}
		
		public static void main (String[] args){
			filepersi presistence1 = new filepersi();
			presistence1.presist();
			databasepersi presistence2 = new databasepersi();
			presistence2.presist();

		}
	}