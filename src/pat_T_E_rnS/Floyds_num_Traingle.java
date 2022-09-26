package pat_T_E_rnS;

public class Floyds_num_Traingle {
	public static void main(String arg[]) {
		int n = 5;
		int num = 1;

		// for pattern number floyd,s triangle

		// --------- 1
		// --------- 2 3
		// --------- 4 5 6
		// --------- 7 8 9 10
		// --------- 11 12 13 14 15

		// for outer loop.
		for (int i = 1; i <= n; i++) {
			// for inner loop.
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num = num + 1;
			}

			System.out.println();
		}
	}
}
