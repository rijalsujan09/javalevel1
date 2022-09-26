package day2;

import java.util.Scanner;

public class shortHandifelse {

	public static void main(String args[]) {

		int x;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your age:");
		x = input.nextInt();
		input.close();

		String result = (x >=18 ) ? "you are eligible to caste a vote" : "You are not eligible to caste avote";
		System.out.println(result);
	}

}
