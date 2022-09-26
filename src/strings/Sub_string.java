package strings;

public class Sub_string {
	public static void main(String arr []) {
		
		String sentence ="My name is Sujan Rijal.";
		String lname = sentence.substring(17, sentence.length()-1);
		
		String fname = sentence.substring(11,17);
		
		System.out.println(lname);
		System.out.println(fname);
		
		
		System.out.println(fname.concat(lname));
		
	}

}
