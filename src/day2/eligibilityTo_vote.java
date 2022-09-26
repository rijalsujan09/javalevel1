 package day2;

import java.util.Scanner;

public class eligibilityTo_vote {

	public static void main(String arg[]) {

		int x;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		x = input.nextInt();
		input.close();
		
		if(x>=18) {
			System.out.println("you are elligible to vote.");
		}

		else {
			System.out.println("Sorry! you are not elligible to vote.");
		}
	}

}
