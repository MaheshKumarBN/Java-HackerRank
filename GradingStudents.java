package com.berry.codingchallenge;

import java.util.*;

class Result2 {

	/*
	 * Complete the 'gradingStudents' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY grades as parameter.
	 */

	public static List<Integer> gradingStudents(List<Integer> grades) {
		// Write your code here
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) > 37) {
				if (grades.get(i) % 5 > 2) {
					grades.set(i, (int) Math.ceil(((grades.get(i) / 5) + 1) * 5));
				}
			}
		}
		return grades;
	}
}

public class GradingStudents {
	public static void main(String[] args) {

		List<Integer> grades = new ArrayList<Integer>();

		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);

		List<Integer> result = Result2.gradingStudents(grades);

		System.out.println(result);
	}
}
