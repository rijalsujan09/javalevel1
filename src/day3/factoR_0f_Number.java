package day3;

import java.util.Scanner;

public class factoR_0f_Number {

	public static void main(String arg[]) {

		/*
		 * int myNum = 24;
		 * 
		 * System.out.println("the factor of " + myNum + "is");
		 * 
		 * int i = 1;
		 * 
		 * for(i=1; i<=myNum; i++) { if (myNum%i==0) { System.out.println(i);
		 * 
		 * } }
		 */

		int n;

		System.out.println("Enter your number");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		scan.close();
		int i = 1;
		System.out.println("the factor of " + n + " are:");
		for (i = 1; i <= n; i++) {

			if (n % i == 0) {

				System.out.println(i);
			}

		}

	}

}
