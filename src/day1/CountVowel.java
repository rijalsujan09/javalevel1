package day1;

import java.util.Scanner;

public class CountVowel {
	   
	   public static void main(String[]args) {
		   
		   String txt;
		
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter some texts:");
		  txt = input.nextLine();
		  input.close();
		  
		  char []chars=txt.toCharArray();
		  
		   int val=0;
		  int cons = 0;
		   
		  for (char c: chars) {
			  
			  switch(c) { 
			  case 'a':
			  case 'e':
			  case 'i':
			  case 'o':
			  case 'u':
				  
				 val++;
				  break;
			default:
				cons ++;
			  }
		 
		  }
		
		  System.out.println("The number of Vowel is : " + val);
		  System.out.println("the consonant count is :" + cons);
		  
	   }


}
