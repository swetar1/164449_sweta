package assign;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String username="sweta";
		String password="12345";
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("enter username");
			username=scanner.next();
			System.out.println("enter password");
			password=scanner.next();
			if(username== username && password == password)
			{
				System.out.println("welcome");
				i=3;
			}
			else if(i==2)
			{
				System.out.println("contact admin");
			}
		}
		

	}

}
