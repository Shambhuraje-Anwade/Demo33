package pack;

import java.util.*;
public class Employee {

	public static void main(String[] args) {
	
		String name;
		int age;
		float salary;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the name");
		name=s.next();
		
		System.out.println("Enter the age");
		age=s.nextInt();
		
		System.out.println("Enter the salary");
		salary=s.nextFloat();
		
		
		System.out.println("name=" +name);
		System.out.println("age=" +age);
		System.out.println("salary=" +salary);

	}

}
