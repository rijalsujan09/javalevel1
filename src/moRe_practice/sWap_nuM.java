package moRe_practice;

import java.util.Scanner;

public class sWap_nuM {

	public static void main(String arg[]) {

		int x;
		int y;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of X :");
		x = scan.nextInt();
		System.out.println("Enter the value of y :");
		y = scan.nextInt();
		scan.close();

		int z = y;
		y = x;
		x = z;

		System.out.println("Value of x is: " + x);

		System.out.println("Value of y is: " + y);

		System.out.println("Thank you!");

	}

}