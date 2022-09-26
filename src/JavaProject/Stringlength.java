package JavaProject;

public class Stringlength {
	
	
	
	
	
	       public static void main(String[]args) {
		  
		           String txt = "my name is sujan rijal.";
				  
				          System.out.println( "The length of the string is:" +txt.length());
				          
				          int count = 1;
				          
				          for (int i = 1; i < txt.length() - 1; i++)
				          {
				              if ((txt.charAt(i) == ' ') && (txt.charAt(i + 1) != ' '))
				              {
				                  count++;
				              }
				          }
				          System.out.println("Number of words in a string : " + count);
		  
	  }

}
