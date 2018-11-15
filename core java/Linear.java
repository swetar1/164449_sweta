package assign;
import java.util.Scanner;
public class Linear {

	public static void main(String[] args) {
		int n,i,search,array[];
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter number of elements:");
		n=scanner.nextInt();
		array=new int[n];
		System.out.println("Enter"+n+"integers");
		for(i=0;i<n;i++)
			array[i]=scanner.nextInt();
		System.out.println("Enter value to find");
		search = scanner.nextInt();
		for(i=0;i<n;i++)
		{
			if (array[i]==search)
			{
				System.out.println(search+"is present at location"+(i+1)+".");
				break;
			}
		}
		if(i==n)
			System.out.println(search+"isn't present in array");
		

	}

}
