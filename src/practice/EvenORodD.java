package practice;

import java.util.Scanner;

public class EvenORodD {
	
	public static void main(String arg[]) {
		
		System.out.println("Enter your number:");
		Scanner input = new Scanner(System.in);
		int x =input.nextInt();
		input.close();
		
		if (x%2==0) {
			System.out.println("your num is Even.");
		}
		else {
			System.out.println("your num is odd.");
		}
	}

}
