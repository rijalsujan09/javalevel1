package day1;

import java.util.*;

public class Find_odd_Even {

	public static void main(String arg []) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number.");
		int x = sc.nextInt();
		sc.close();
		
		if (x%2 == 0) {
	    System.out.println("Your number is even.");
		}
		else {
		System.out.println("Your number is odd.");
		}
		
	}

}
