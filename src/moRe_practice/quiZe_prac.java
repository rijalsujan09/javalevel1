package moRe_practice;

import java.util.Scanner;

public class quiZe_prac {

	public static void main(String arg[]) {

		Scanner input = new Scanner(System.in);

		int score = 0;
		int choice;

		System.out.println("Q:1. what is the capital of Nepal?");
		System.out.println("1. Chitwan");
		System.out.println("2. Kathmandu");
		System.out.println("3. Pokhara");
		System.out.println("4. Jhapa");

		System.out.println("Enter your answer :");
		choice = input.nextInt();

		if (choice == 2) {
			score++;
			// score =score+1;
			// score++;
			System.out.print("Corect ");
			System.out.println("Your score is " + (score++));
		} 
		else {
			System.out.println("Wrong answer your score is_:" + score);
			System.exit(0);
		}
		
		System.out.println();
		System.out.println();

		System.out.println("Q:2. what is the Molecular formula of Water?");
		System.out.println("1. Nacl");
		System.out.println("2. NhCl");
		System.out.println("3. H2O");
		System.out.println("4. H2So4");
		System.out.println("Enter your answer :");
		int in = input.nextInt();

		if (in == 3) {
			System.out.print("Correct");
			System.out.println("Your score is " + 2);
		} else if (in != 3) {
			System.out.println("incorrect");
			System.out.println("Your score is " + score++);
			System.exit(0);
		}
		
		System.out.println();
		System.out.println();

		System.out.println("Q:3. When was Java Introduced?");
		System.out.println("1. 1995");
		System.out.println("2. 2022");
		System.out.println("3. 1985");
		System.out.println("4. 1998");

		System.out.println("Enter your answer :");
		int ans = input.nextInt();

		if (ans == 1) {
			System.out.println("Correct");
			System.out.println("Your score is " + (2 + 1));
			System.out.println("Congratulation your Passed");
		} else if (ans != 3) {
			System.out.println("incorrect");
			System.out.println("Your score is " + 2);
			System.out.println("Sorry! you got failed.");
			System.exit(0);
		}
		input.close();
	}

}
