package com.raja.loops;

public class MyNumber {
	private int number;

	public MyNumber(int number) {
		if (number > 1) {
			this.number = number;
		}
		else {
			System.out.println("enter number greater than 1");
		}


	}

	public boolean isPrime() {

		for (int i = 2; i <= this.number / 2; i++) {
			if (this.number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {

		int sum = 0;
		for (int i = 1; i <= this.number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int sumOfDivisor = 0;
		for (int i = 2; i < this.number; i++) {
			if (this.number % i == 0) {
				sumOfDivisor = sumOfDivisor + i;
			}
		}

		return sumOfDivisor;
	}

	public void printANumberTriangle() {
		for (int i = 0; i < this.number; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
		}

	}

}
