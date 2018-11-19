package assign;
import java.util.Scanner;
public class result {

	public static void main(String[] args) {
		int marks1,marks2,marks3;
		Scanner scanner=new Scanner(System.in);
	    System.out.println("enter marks1");
	    marks1=scanner.nextInt();
	    System.out.println("enter marks2");
	    marks2=scanner.nextInt();
	    System.out.println("enter marks3");
	    marks3=scanner.nextInt();
	    int sum= marks1+marks2+marks3;
	    int total=marks1+marks2;
	    
	    if(sum > 60)
	    {
	    	System.out.println("passed");
	    }
	    else if(total>60)
	    {
	      System.out.println("promoted");	
	    }
	    else
	    {
	    	
	    	System.out.println("failed");
	    }
	    
	    
	    
	    
	    
				
		
		
	}

}
