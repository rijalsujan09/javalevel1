package functions_in_java;

import java.util.*;

public class sum_of_Odd_Nums {

	public static void sumOfOdd(int n) {

		if (n < 1) {

			System.out.println("Invalid input!");

			return;
		}

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;

			}
		}

		System.out.println(sum);

		return;
	}

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your num:");
		int n = sc.nextInt();
		sc.close();
		sumOfOdd(n);
	}

}
