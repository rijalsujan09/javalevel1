package strings;

public class Concatenation {
	
	public static void main (String arg []) {
		
		String fName = "Sujan";
		String lName = " Rijal";
		
		
		String fullName = fName.concat(lName); //using concatenation
		
		
		System.out.println(fullName);
		
		//Alternative
		System.out.println(fName+""+lName);
		
		//length of String
		int length = fullName.length();
		System.out.println("The length of string is:"+length);
		
		for (int i=0; i<fullName.length(); i++) {
		//charAT
		System.out.print(fullName.charAt(i)+" ");
		}
	}

}
