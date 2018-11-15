package assign;
import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
		int CTC;
		Scanner scanner=new Scanner(System.in);
		CTC = scanner.nextInt();
		if(CTC<=180000)
		{
			System.out.println("Slab-A");
			System.out.println("Your tax is Null");
		}
		
		else if(CTC> 180000 && CTC<300000)
		{
			System.out.println("Slab-B");
			System.out.println("Your tax is="+CTC*0.2);
		
		}
		else if(CTC> 300000 && CTC<500000)
		{
			System.out.println("Slab-C");
			System.out.println("Your tax is="+CTC*0.2);

			
		}
		else{
			System.out.println("Slab-D");
			System.out.println("Your tax is="+CTC*0.3);

		}

	}

}
