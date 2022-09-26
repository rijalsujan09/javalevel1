package pat_T_E_rnS;

public class InvertedPyrimid_with_Space {

	public static void main(String arg[]) {
		
//  ----- for pattern
//	-----       *
//	-----      **
//	-----     ***
//	-----    ****
//	-----   *****
		
		
		
		int n=5;
		
		// for outer loop
		for(int i=1; i<=n; i++) {
			
			// for inner loop space
			for(int j=1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			// for inner loop stars(*)
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			
			System.out.println();	
		}
	}

}
