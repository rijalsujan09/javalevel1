package two_Dimensional_arrays;

import java.util.Scanner;

public class Find_location {
	
	public static void main (String arg[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter row:");
		int rows = scan.nextInt();
		
		System.out.println("enter column:");
		int cols=scan.nextInt();
		
		int numbers [] [] = new int [rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j =0; j<cols; j++) {
		   numbers[i][j]=scan.nextInt();
			   }
		}
		System.out.println("Tell me your num:");
		       int x = scan.nextInt();
		       
			for(int i =0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					
					if(numbers[i][j] == x) {
						
						System.out.println("Your number is found in location : " + "(" +i+","+j+")");
					}
					
				}
			}
			scan.close();
		}

	}
