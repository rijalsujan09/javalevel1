package functions_in_java;

import java.util.*;

public class Average_of_Nums {

	

	public static float calcAverage(int a, int b, int c) {

		float average = (a + b + c) / 3;

		return average;

	}

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		float average = calcAverage(a, b, c);
		System.out.println("Average of your num: " + average);
	}

}
