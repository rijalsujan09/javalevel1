package strings;

public class Comparing_string {
	public static void main(String arg []) {
		
		String name1 = "Sujan";
		String name2 = "Sujan";
		
		//s1>s2 : +ve,
		//s1==s2: 0,
		//s1<s2 : -ve,
		
		if(name1.compareTo(name2) == 0) {
			
			System.out.println("Strings are equal.");
		}
		else {
			System.out.println("Strings are Not equal.");
		}

	}

}
