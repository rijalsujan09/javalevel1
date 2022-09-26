package pat_T_E_rnS;

public class Inverted_Num_Pyrimid {
	
	public static void main(String arg[]) {
		
		
	//  for pattern inverted number Pyrimid.
		
	//	1 2 3 4 5 
	//	1 2 3 4 
	//	1 2 3 
	//	1 2 
	//	1 

		
		int n=5;
		
		// for outer loop
		for(int i=n; i>=1; i--) {
			//for inner loop
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		// alternatively
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n-i+1; j++) {
				 
				System.out.print(j+" ");

			}
			
			System.out.println();
		}
	}

}
