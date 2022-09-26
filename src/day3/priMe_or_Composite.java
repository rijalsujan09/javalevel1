package day3;

import java.util.Scanner;

public class priMe_or_Composite {
	
	public static void main (String arg []) {
		
		int n ;
		System.out.println("enter your number:");
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
		in.close();
		int x = 1;
		int factorCount= 0;
		
		while ( x <= n) { 
			if (n%x==0) { factorCount++;}
			x++;
		}
	
		if( factorCount > 2 ) {
			
			System.out.println("your number " + n + " is Composite.");
			
		}
		else {
			
			System.out.println("your number " + n + " is prime.");
		}
}
}