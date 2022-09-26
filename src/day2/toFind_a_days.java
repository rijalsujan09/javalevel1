package day2;

import java.util.Scanner;

public class toFind_a_days {

	public static void main(String arg[]) {

		int x;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your input");
		x = input.nextInt();
		input.close();

		switch (x) {

		case 1:
			System.out.println("Today is monday");
			break;

		case 2:
			System.out.println("Today is tuesday");
			break;
		case 3:
			System.out.println("Today is wednesday");
			break;
		case 4:
			System.out.println("Today is monday");
			break;
		case 5:
			System.out.println("Today is monday");
			break;
		case 6:
			System.out.println("Today is monday");
			break;
		case 7:
			System.out.println("Today is monday");
			break;
		default:
			System.out.println("Today is monday");

		}

	}

}
