package functions_in_java;

import java.util.*;

public class Practiz {
	
	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}
	
	public static void main(String arg []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:");
			String name = sc.nextLine();
			sc.close();
			printMyName(name); //calling the function
		
	}

}
