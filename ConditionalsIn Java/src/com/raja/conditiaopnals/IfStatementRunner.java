package com.raja.conditiaopnals;

import java.util.Scanner;

public class IfStatementRunner {

	public static void main(String[] args) {
		IfStatement ops = new IfStatement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter number 2 : ");
		int number2 = scanner.nextInt();
		System.out.println("Enter the task number to be performed .\n 1:add 2:multiply 3:subtraction 4:divide");
		int task = scanner.nextInt();
		if (task == 1) {
			System.out.printf("result : %d", ops.add(number1, number2)).println();
		} else if (task == 2) {
			System.out.printf("result : %d", ops.multiply(number1, number2)).println();

		} else if (task == 3) {
			System.out.printf("result : %d", ops.subtract(number1, number2)).println();

		} else if (task == 4) {
			System.out.printf("result : %.2f", ops.divide(number1, number2)).println();

		} else {
			System.out.println("enter a valid number");
		}

	}

}
