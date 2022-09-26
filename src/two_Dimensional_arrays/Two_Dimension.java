package two_Dimensional_arrays;

import java.util.*;

public class Two_Dimension {
	public static void main(String arg[]) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your row size:");
		int row = input.nextInt();

		System.out.println("Enter your column size:");
		int cols = input.nextInt();

		int[][] numbers = new int[row][cols];

		// input

		// rows
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < cols; j++) {

				numbers[i][j] = input.nextInt();
			}
		}

		// output
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < cols; j++) {

				System.out.print(numbers[i][j] + " ");
			}

			System.out.println();
		}
		
		input.close();
	}

}
