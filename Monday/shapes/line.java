package Monday;
import java.util.Scanner;
public class line extends shape1 {
	

		@Override
		public void draw() {
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter x co ordinates x1 and x2");
			int x1=scanner.nextInt();
			int x2=scanner.nextInt();
			int y1=scanner.nextInt();
			int y2=scanner.nextInt();
			System.out.println("Line drawn from x coordinates "+x1+" "+x2+"Line drawn from y coordinates "+y1+" "+y2);
			
		}

		

	}