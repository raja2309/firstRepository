package com.raja.loops;

public class MyNumberRunner {
	public static void main(String[] args) {
		
		MyNumber number = new MyNumber(10);

		System.out.println(number.isPrime());
		int sum = number.sumUptoN();
		System.out.println(sum);
		int sumOfDivisors = number.sumOfDivisors();
		System.out.println(sumOfDivisors);

		number.printANumberTriangle();

		}


}
