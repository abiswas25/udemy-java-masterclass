package com.udemy.java.masterclass.challenges.section05;

import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static int sumOfUserInputNumbers() {

		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter number #" + i + ":");
			boolean hasNextInt = scanner.hasNextInt();
			if (!hasNextInt) {
				System.out.println("Unable to parse input (Integer Required)");
				scanner.nextLine();
				i--;
				continue;
			}
			sum += scanner.nextInt();
			scanner.nextLine();
		}
		scanner.close();
		return sum;
	}

}
