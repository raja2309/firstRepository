package com.raja.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int mark:marks) {
			sum=sum+mark;
		}
		return sum;
	}

	/*
	 * public int getMaximumMarks() { int max = Integer.MIN_VALUE; for (int mark :
	 * marks) { if (max < mark) { max = mark; }
	 * 
	 * } return max; }
	 */

	/*
	 * public int getMinimumMarks() { int min = Integer.MAX_VALUE; for (int mark :
	 * marks) { if (min > mark) { min = mark; }
	 * 
	 * } return min; }
	 */

	public BigDecimal getAverageMarks() {

		BigDecimal avg = new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()), 3,
				RoundingMode.UP);
		return avg;
	}

	public int getMaximumMarks() {

		return Collections.max(marks);
	}

	public int getMinimumMarks() {

		return Collections.min(marks);
	}

	public void addNewMark(int mark) {
		marks.add(mark);

	}

	public void removeMarkAtIndex(int i) {
		marks.remove(i);
		
	}

	public void printMarks() {
		System.out.println(marks);

	}

	@Override
	public String toString() {
		return name + marks;

	}

}
