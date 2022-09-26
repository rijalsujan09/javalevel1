package Java_Arrays;

import java.util.*;

public class min_Max_num {

	public static void main(String arg[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of your Nums:");
		int size = input.nextInt();

		int numbers[] = new int[size];

		for (int i = 0; i < size; i++) {

			numbers[i] = input.nextInt();
		}

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < min) {

				min = numbers[i];
			}

			if (numbers[i] > max) {

				max = numbers[i];
			}
		}

		System.out.println("your mimimum value is : " + min);
		System.out.println("your max value is : " + max);

		input.close();
	}

}
