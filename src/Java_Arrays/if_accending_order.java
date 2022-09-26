package Java_Arrays;
import java.util.*;

public class if_accending_order {
	public static void main (String arg[]) {
		
		Scanner scn = new Scanner(System.in);
		// input for the size.
		System.out.println("Enter your size: ");
		 int lengt = scn.nextInt();
		 int numbers[]= new int[lengt];
		 
		 
		 // inputs start
		 System.out.println("start your number inputs: ");
		 for(int i=0; i<lengt; i++) {
			 numbers[i] = scn.nextInt();
		 }
		  boolean isAscending = true;
		  
		  
		 for(int i = 0; i<numbers.length-1; i++) {
			 
			 if(numbers[i] > numbers[i+1]) {
				 
				 isAscending = false;
			 }
				 
		 }
		 if(isAscending) {
			 System.out.println("The array is sorted in ascending order");
		 }
		 else {
			 System.out.println("The array is not sorted in ascending order");
		 }
		 
		 scn.close();
	}

}
