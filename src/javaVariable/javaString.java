package javaVariable;

public class javaString {

	public static void main(String args[]) {

		/*
		 * String - stores text, such as "Hello". String values are surrounded by double
		 * quotes
		 * 
		 * int - stores integers (whole numbers), without decimals, such as 123 or -123
		 * 
		 * float - stores floating point numbers, with decimals, such as 19.99 or -19.99
		 * 
		 * char - stores single characters, such as 'a' or 'B'. Char values are
		 * surrounded by single quotes
		 * 
		 * boolean - stores values with two states: true or false
		 */

		String name = " My name is Sujan riajl:";
		int myAge = 23;
		myAge = 24;
		float myFloat = 24.1f;
		char myletter = 'S';
		boolean myBool = false;

		System.out.println(name);
		System.out.println(myAge);
		System.out.println(myFloat);
		System.out.println(myletter);
		System.out.println(myBool);
		System.out.println("The length of the text is:" + name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

	}

}
