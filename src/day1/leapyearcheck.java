package day1;

//1st condition if y/100 and y/400 ,remainder is 0 
//2nd condition if y/100 remainder is different than 0 and y/4 remainder is 0.
//then year is leap else not.


import java.util.Scanner;

public class leapyearcheck {
       
	    public  static void main (String[]args) {
		 
	    int y;
	    
	    
	    	System.out.println("enter any year:");
	    	Scanner input = new Scanner(System.in);
	    	y = input.nextInt();
	    	input.close();
	    	
	    	//conditions
	    	
	    	if((y%100==0 && y%400==0) || (y%100!=0 && y%4==0) ) {
	    		
	    		System.out.println("yes!A leap year");
	    	}
	    	else {
	    		System.out.println("Not a leap year");
	    	}
	    	
	    	
	    }
	
}
