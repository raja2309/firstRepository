package com.raja.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student student = new Student("Raja", 94, 81, 94, 96, 62);
		
		int number = student.getNumberOfMarks();
		System.out.println("number of marks : " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Total sum : " + sum);

		int maximumMarks = student.getMaximumMarks();
		System.out.println("Maximun marks : " + maximumMarks);

		int minimumMarks = student.getMinimumMarks();
		System.out.println("Minimum marks : " + minimumMarks);

		BigDecimal averageMarks = student.getAverageMarks();
		System.out.println("Avergare Marks : " + averageMarks);

		student.addNewMark(89);


		student.removeMarkAtIndex(1);
		System.out.println(student);
		System.out.println("edited for fit");
	}



}
