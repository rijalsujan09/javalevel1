package Java_Arrays;
import java.util.*;
public class string_arrays {
	public static void main(String arg[]) {
		
		Scanner input = new Scanner(System.in);
		
		 int lnth = input.nextInt();
		 String name[] = new String[lnth];
		 
		 for (int i=0; i<lnth; i++) {
			 
			 name[i] = input.nextLine();
			
			 //System.out.println(name[i]);
		 }
		 
		 for(int i =0; i<name.length; i++) {
			 
			 System.out.println(name[i]);
		 }
		  input.close();
	}

}
