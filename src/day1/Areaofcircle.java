package day1;

import java.util.Scanner;

public class Areaofcircle {
	
	   public static void main (String [] args) {
		   
		    double radius;
		    double area;
		      
		     Scanner input = new Scanner(System.in);
		     
		  System.out.println("Enter the radious:");
		    radius = input.nextDouble();
		    input.close();
		   
		  
		     area = Math.PI * (radius *radius);
		  
		 System.out.println("Area is:" + area );
	   }
	   
	   

}
