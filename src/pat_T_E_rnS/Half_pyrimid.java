package pat_T_E_rnS;

public class Half_pyrimid {

	public static void main(String arg[]) {
// -- pattern half pyrimid.	
//		*
//		**
//		***
//		****
//		*****

		int n = 5;

		// outer loop
		for (int i = 1; i <= n; i++) {

			// inner loop
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}
	}
}
