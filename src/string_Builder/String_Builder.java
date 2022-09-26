package string_Builder;

public class String_Builder {
	public static void main(String arg[]) {

		StringBuilder sb = new StringBuilder("Tony");

		System.out.println(sb);

		// chat at index.
		System.out.println(sb.charAt(3));

		// set Char at index
		sb.setCharAt(0, 's');
		System.out.println(sb);

		// insert char at index.
		sb.insert(2, 'n');
		System.out.println(sb);

		// Delete char at index.
		sb.deleteCharAt(2);
		System.out.println(sb);

		// adding character at the end of string.
		sb.append("a");
		sb.append("l");
		sb.append("y");
		System.out.println(sb);

		// finding a length of string

		System.out.println(sb.length());

	}

}
