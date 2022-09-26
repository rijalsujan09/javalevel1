package practice;

public class Duplicate_Character {
	
	public static void main(String arg[]) {
		String word ="Hellow world! This is Programming";
		
		char[] characters = word.toCharArray();
		
		for( int i =0; i<characters.length; i++) {
			char c = characters[i];
			
			for( int j=1+1; j<characters.length;j++) {
				if(characters[i]==c) {
					characters[j]='@';
				}
			}
		}
		System.out.println(word);
		String newvalue = String.valueOf(characters);
		System.out.println(newvalue);
		
		newvalue = newvalue.replace("@" ,"");
		System.out.println(newvalue);
	}

}
