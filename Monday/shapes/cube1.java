package Monday;


import java.util.Scanner;


public class cube1  extends shape1{
	
	@Override
	public void draw() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter breadth to draw a cube");
		int breadth=scanner.nextInt();
		System.out.println("enter length to draw a cube");
		int length=scanner.nextInt();
		System.out.println("enter hieght to draw a cube");
		int height=scanner.nextInt();
		
		System.out.println("Cube drawn with length "+length+" and breadth"+breadth+" and height"+height);
	
	}

}