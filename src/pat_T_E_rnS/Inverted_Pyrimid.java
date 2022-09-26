package pat_T_E_rnS;

public class Inverted_Pyrimid {
       
	   public static void main(String arg []) {
		   
		   int n=5;
		   
		   // outer loop
		   for(int i=n; i>=1; i--) {
			  
			   // inner loop
			   for(int j=1; j<=i; j++) {
				   
				   System.out.print("*");
			   }
			      System.out.println();
		   }
	   }
}
