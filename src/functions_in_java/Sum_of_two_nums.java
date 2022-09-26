package functions_in_java;
import java.util.*;

public class Sum_of_two_nums {
	
	public static int calculateSum(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter first num:");
	int a = sc.nextInt();
	
	System.out.println("enter second num:");
	int b = sc.nextInt();
	sc.close();
	
	int sum = calculateSum(a,b);
	System.out.println("sum of two number is :" + sum);
	}
	

}
