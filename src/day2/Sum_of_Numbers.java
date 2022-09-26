package day2;
import java.util.*;
public class Sum_of_Numbers {
	public static void main (String arg[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your number n:");
		int n = scn.nextInt();
		scn.close();
		int sum = 0;
		
		for(int i = 0; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of number from 1 "+ n + "is");
		System.out.println(sum);
	}

}
