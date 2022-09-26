package day3;

import java.util.Scanner;

public class h_C_f_ofNumber {

	public static void main(String arg[]) {

		int a, b, i, hcf = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first Number:");
		a = scan.nextInt();
		System.out.println("Enter your first Number:");
		b = scan.nextInt();
		scan.close();
		
		for(i = 1; i <= a || i <= b; i++) {
			if( a%i == 0 && b%i == 0 )
		         hcf = i;
		}
         System.out.println("hcf of given two number is  : "+ hcf);
	}

}

     // at the same time. to find LCM.
   /*   for(i = 1; i <= a & i <= b; i++) {
        if( a%i == 0 && b%i == 0 )
         lcm = i;*/

