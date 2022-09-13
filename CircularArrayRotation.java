package com.berry.codingchallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CircularArrayRotation {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);

		int k = 2;

		List<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(1);
		a.add(2);

		List<Integer> res = circularArrayRotation(l, k, a);
		System.out.println(res);
	}

	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		// Write your code here
		List<Integer> result = new ArrayList<Integer>();
		Collections.rotate(a, k);
		for(int i: queries) {
			result.add(a.get(i));
		}
		return result;
	}
}
