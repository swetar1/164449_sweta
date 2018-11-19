package assign;
import java.util.Scanner;
public class ascending {

	public static void main(String[] args) 
	{
		
		
		System.out.println("enter the number:");
		int num[]=new int[20];
		int n,n1;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		System.out.println("enter the numbers");
		for(int i=0;i<n;i++)
		{
			num[i]=scanner.nextInt();
		}
		
	
         int i,j;
         for(i=0;i<=n-1;i++){
        	 for(j=0;j<n-i-1;j++)
        	 {
        		 if(num[j]>num[j+1])
        		 {
        			 int temp;
        			 temp=num[j];
        			 num[j]=num[j+1];
        			 num[j+1]=temp;
        		 
        			 
        		 }
        	 }
         }
         System.out.println("Select the option1 1:ascend 2:reverse 3:no");
         n1=scanner.nextInt();
         if(n1==1)
         {
        	 System.out.println("Ascending order");
        	 for(i=0;i<n;i++)
        	 {
        		 System.out.println(num[i]);
        	 }
         }
         else if(n1==2)
         {
         System.out.println("Reverse number");
         for(i=n-1;i>=0;i--)
         {
        	 System.out.println(num[i]);
         }
         }
         else
         {
        	 System.out.println("done!");
         }
         
	
	
	
	
	
	}
         
         
         
         
         
         
   
         
	}


