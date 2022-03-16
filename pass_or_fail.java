package pack;
import java.util.*;
public class pass_or_fail {
	
	public static void main(String[] args) {
		
		
		int marks;
		String result;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the marks");
		
		marks=k.nextInt();
		
		result= marks>40 ? "pass": "fail";
		
		System.out.println(result);
		
	}

}
