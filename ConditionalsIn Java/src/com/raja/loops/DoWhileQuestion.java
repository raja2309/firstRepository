package com.raja.loops;

import java.util.Scanner;

public class DoWhileQuestion {
	Scanner scanner = new Scanner(System.in);

	public void printCube() {
		int number = -1;

		do {

			if (number != -1) {
				System.out.println("cube is : " + number * number * number);
			}
			System.out.println("Enter number : ");
			number = scanner.nextInt();



		} while (number >= 0);

	}

}
