package PaTT_ERnS_Advanced;

public class Butterfly_Pattern {

	public static void main(String[] arg) {
		
		// pattern Butterfly
		

	//  --    	*        *
	//  --  	**      **
	//  --  	***    ***
	//	--      ****  ****
	//	--      **********
	//  --      **********
	//	--      ****  ****
	//	--      ***    ***
	//	--      **      **
	//	--      *        * 
		
		int n =5;
		
		
		// For upper half
		
		for(int i=1; i<=n; i++) {
			
			 // first part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			// for space
			int space = 2*(n-i);
			for( int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			// for 2nd part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		 
			System.out.println();
		}
		
		// Lower half
		for(int i=n; i>=1; i--) {
			 // first part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			// for space
			int space=2*(n-i);
			for( int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			// for 2nd part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		 
			System.out.println();
		}
		
	}

}
