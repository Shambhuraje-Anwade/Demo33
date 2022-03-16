package pack;

import java.util.Scanner;

public class GreaterNo {

	public static void main(String[] args) {
		int a;
		int b;
		
		
		Scanner c = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		a=c.nextInt();
		
		System.out.println("Enter the Secound number");
		b=c.nextInt();
		
		System.out.println("the greater is ");
		
		if (a>b)
		{
			System.out.println(a);
		}
		
		else 
		{
			System.out.println(b);
			
		}
	}

}
