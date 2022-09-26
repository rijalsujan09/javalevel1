package Java_Arrays;
import java.util.Scanner;
public class Arrays_input {
	public static void main(String arg[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("entert the length  of your arry:");
		int length = input.nextInt();
		
		int numbers[] = new int[length];
		System.out.println("Start your inputs:");
		for(int i = 0; i<length; i++) {
			
			numbers[i] = input.nextInt();
			
		}
		System.out.println("your inputs are:");

		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		input.close();
	}  

}
