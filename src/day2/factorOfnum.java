package day2;

import java.util.Scanner;

public class factorOfnum {

	 public static void main(String[] args) {

	  
	    int num;
	    System.out.println("Input your number:");
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    input.close();
	    
	    System.out.println("The factors of " +  num + " are :");
	    
	    
	    for(int i = 1; i <= num; i= i+1 ) {

	      
	      if(i == 0) {
	        continue;
	      }
	      else {
		        if (num % i == 0)
		          System.out.println(i);
		       
		      }
	    }
	  }
	}