package com.udemy.java.masterclass.codingexercises.section05;

import java.util.Scanner;

public class InputCalculator {

	public static void inputThenPrintSumAndAverage() {
		int sum = 0;
		double average = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			if (scanner.hasNextInt()) {
				sum += scanner.nextInt();
				count++;
			} else {
				break;
			}
			scanner.nextLine();
		}
		scanner.close();

		if (count > 0) {
			average = ((double) sum / count);
		}

		System.out.println("SUM = " + sum + " AVG = " + Math.round(average));

	}

}
