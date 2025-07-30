package constructorone;

import java.util.Scanner;

public class ConstructorNewOne {

	int add;
	
	public ConstructorNewOne(int x, int y) {
		
		add = x + y;
		System.out.println(add);	
	}
	
public ConstructorNewOne(int x, int y, int z) {
		
		add = x + y + z;
		System.out.println(add);
	
	}
	

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter 1st number");
			int a = s.nextInt();
			
			System.out.println("Enter 2nd number");
			int b = s.nextInt();
			
			System.out.println("Enter 3rd number");
			int c = s.nextInt();
						
			new ConstructorNewOne(a, b, c);
			new ConstructorNewOne(a, c);
		}
		
		
	}

}
