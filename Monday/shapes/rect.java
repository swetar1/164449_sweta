package Monday;
import java.util.Scanner;
public class rect extends shape1 {
	
		
		@Override
		public void draw() {
			// TODO Auto-generated method stub
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter breadth to rectangle");
			int breadth=scanner.nextInt();
			System.out.println("enter length to rectangle");
			int length=scanner.nextInt();
			
			
			System.out.println("Rectrangle drawn with length "+length+" and breadth"+breadth);
			
		}
		}