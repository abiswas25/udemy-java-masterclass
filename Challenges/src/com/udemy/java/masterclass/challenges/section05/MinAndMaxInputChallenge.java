package com.udemy.java.masterclass.challenges.section05;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

	public static void minAndMaxUserInput() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Enter number (or Q to quit): ");
			if (scanner.hasNextInt()) {
				int number = scanner.nextInt();
				scanner.nextLine();
				if (number < min) {
					min = number;
				}
				if (number > max) {
					max = number;
				}
			} else if (scanner.nextLine().equalsIgnoreCase("Q")) {
				break;
			} else {
				System.out.println("Invalid Input (Expected Integer or \"Q\")");
			}
		}
		scanner.close();
		System.out.println("Minimum number entered: " + min);
		System.out.println("Maximum number entered: " + max);
	}

}
