package PaTT_ERnS_Advanced;

public class Solid_rhumbus {
	public static void main(String arg[]) {

		// for pattern Solid rhumbus.

		/*------- *****
		         *****
		        *****
		       *****
		      ***** -------- */

		int n = 5;

		for (int i = 1; i <= n; i++) {

			int space = (n - i);
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 5; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
