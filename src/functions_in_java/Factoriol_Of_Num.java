package functions_in_java;

import java.util.*;

public class Factoriol_Of_Num {

	public static void findFactoriol(int n) {

		if (n < 0) {
			System.out.println("Invalid number!");

			return;
		}

		int factoriol = 1;

		for (int i = n; i >= 1; i--) {

			factoriol = factoriol * i;
		}

		System.out.println("your factoriol is:" + factoriol);

		return;
	}

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your num:");
		int n = sc.nextInt();
		sc.close();

		findFactoriol(n);

	}

}
