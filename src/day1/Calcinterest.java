package day1;

import java.util.Scanner;

public class Calcinterest {

	public static void main(String[] args) {

		double p, t, r, i;

		Scanner input = new Scanner(System.in);
		System.out.println("principle ammount p:");
		p = input.nextDouble();
		System.out.println("time period t:");
		t = input.nextDouble();
		System.out.println("rate of interest r:");
		r = input.nextDouble();

		input.close();

		i = (p * t * r) / 100;

		System.out.print("total  interest is:  " + i);

	}

}
