package PaTT_ERnS_Advanced;

public class Number_pyrimid {

	public static void main(String arg[]) {

		// number pyrimid pattern

		// ------ 1       here space is printed first.
		// ----- 2 2      space= (n-i)
		// -----3 3 3
		// --- 4 4 4 4
		// -- 5 5 5 5 5

		int n = 5;

		// for outer loop
		for (int i = 1; i <= n; i++) {

			// for space
			int space = (n - i);
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			// for inside loop.
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
