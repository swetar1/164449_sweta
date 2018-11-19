package Monday;
import java.util.Scanner;
public class line extends shape1 {
public void draw(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter x-coordinates:");
	int x1=sc.nextInt();
	int x2=sc.nextInt();
	System.out.println("Enter y-coordinates:");
	int y1=sc.nextInt();
	int y2=sc.nextInt();
	
	System.out.println("line drawn from (" + x1 + "," + y1 + ") to (" + x1 + "," + y1 + ").");
}
}
