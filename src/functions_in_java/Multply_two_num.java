package functions_in_java;
import java.util.*;
public class Multply_two_num {
	
	public static int calcProduct(int a , int b, int c) {
		return a*b*c;
	}
	
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st num:");
		int a = sc.nextInt();
		System.out.println("enter 2nd num:");
		int b = sc.nextInt();
		System.out.println("enter 3rd num:");
		int c = sc.nextInt();
		sc.close();
		
		System.out.println("product of num is :" + calcProduct( a , b, c));
	}
	

}
