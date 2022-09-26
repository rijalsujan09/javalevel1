package PaTT_ERnS_Advanced;

public class Palindromic_pattern {

	public static void main(String arg[]) {

		// --- Palindromic pattern

		// ---     1
		// ---    212
		// ---   32123
		// ---  4321234
		// --- 543212345

		int n = 5;

		// outer loop
		for (int i = 1; i <= n; i++) {
			// space
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// first half
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			// final part
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
