package Java_Arrays;

import java.util.Scanner;

public class Arraywork {

	public static void main(String arg[]) {
		String myWord;
		System.out.println("enter your word:");
	try	(Scanner input = new Scanner(System.in)) {
		myWord = input.nextLine();
		input.close();

		char[] value = myWord.toCharArray();

		// System.out.println(Char);
		int vowelCount=0;
		int ConsCount=0;

		for (int i = 0; i < myWord.length(); i++) {
			if (value[i] >= 'A' && value[i] <= 'Z' || value[i] >= 'a' && value[i] <= 'z') {
               
				if (value[i] == 'a' || value[i] == 'e' || value[i] == 'i' || value[i] == 'o' || value[i] == 'u') {
					
					vowelCount++;
				
				}
				
				else {
					ConsCount++;
				}
			}
		}
				System.out.println("vowels words in sentence are " + vowelCount );
				System.out.println("Consonant words in sentence are " + ConsCount);
			}
		}
	}

