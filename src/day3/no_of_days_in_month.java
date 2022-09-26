package day3;

import java.util.Scanner;

public class no_of_days_in_month {

	public static void main(String arg[]) {

		int d;

		System.out.println("Enter the number between 1 to 12");
		System.out.println("here,1= jan and 12=Dec ");
		System.out.println("Enter Your Number:");

		Scanner scan = new Scanner(System.in);
		d = scan.nextInt();
		scan.close();
		
		if(d==1 || d==3 || d==5|| d==7 || d==8 || d==10 || d==12) {
			
			System.out.println("your month have 31 days.");
		}
		
		else if ( d==4 || d==6 || d==9 || d==11) { 
			
			System.out.println("your month have 30 days.");
		}
		
		else if(d==2) {
			
			System.out.println("your month have 28 day.");
		}
		else {
			
			System.out.println("Enter the number a valid between 1 to 12.");
		}

	}

}
// we can also execute this program using stitch case.

/*                                                   */