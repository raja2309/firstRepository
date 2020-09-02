package com.raja.loops;

public class DoWhileQuestionRunner {
	public static void main(String[] args) {
		// DoWhileQuestion number = new DoWhileQuestion();

		// number.printCube();
		// System.out.println("Thank you");
		String str = "This is a lot of text again";
		/*
		 * int i = 0; while (str.charAt(i) != '\0') { System.out.println(str.charAt(i));
		 * i++; }
		 */
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}

}
