package Java_Arrays;

import java.util.*;
public class my_Arrays_input {
	
	public static void main(String arg[]) {
		
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("size:");
		int size = scn.nextInt();
		
		int number[] = new int[size];
		
		//input
		System.out.println("Start your input:");
		for(int i=0; i<size; i++) {
			
			number[i] = scn.nextInt();
			
		}
		
		System.out.println("which num:");
			int x = scn.nextInt();
			scn.close();
		//output
		for(int i=0; i<number.length; i++) {
			
			//System.out.println(number[i]);
			if(number[i] == x) {
				System.out.println( x + " is found  at index :" + i);
			}
			
		}
		
	}

}
