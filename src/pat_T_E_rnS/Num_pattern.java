package pat_T_E_rnS;

public class Num_pattern {
	 public static void main(String arg[]) {
		 
          // ------  Pattern     
		 
                //-------1
                //-------12
                //-------123
                //-------1234
                //-------12345
                //-------123456
                //-------1234567
                //-------12345678
		 
		 int n=8;
		        
		 for(int i=1; i<=n; i++) {
			 
			 for(int j=1; j<=i; j++) {
				 System.out.print(j + " ");
			 }
			 System.out.println();
		 }
	}
}


