package pat_T_E_rnS;

public class Patern_1_0_Triangle {
	public static void main(String arg[]) {
		
		//  ------ for patter (1-0) traingle.
		
		//  -------1
		//  -------01
		//  -------101
		//  -------0101
		//  -------10101
		
		int n = 5;
		// for outer loop
		for (int i = 1; i <= n; i++) {
			// for inner loop
			for (int j = 1; j <= i; j++) {
				int sum = i + j;
				if (sum % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}

			System.out.println();
		}
	}

}
