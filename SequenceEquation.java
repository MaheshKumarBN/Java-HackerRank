package com.berry.codingchallenge;

import java.util.ArrayList;
import java.util.List;

class Result17 {

	/*
	 * Complete the 'permutationEquation' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY p as parameter.
	 */

	public static List<Integer> permutationEquation(List<Integer> p) {
		// Write your code here

		List<Integer> q = new ArrayList<Integer>();
		int num = 1;
		//int[] arr = new int[p.size()];
		
		while(num-1 < p.size()) {
			int index1 = p.indexOf(num);
			int index2 = p.indexOf(index1+1);
			
			System.out.println();

			q.add(index2+1);
//			arr[num-1] = index2+1;
			num++;
		}
		
//		for(int i = 0; i < arr.length; i++) {
//			q.add(arr[i]);
//		}
		return q;
	}
}

public class SequenceEquation {
	public static void main(String[] args) {

		int[] arr = {2, 3, 1};
		List<Integer> p = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			p.add(arr[i]);
		}

		List<Integer> result = Result17.permutationEquation(p);
		System.out.println(result);
	}
}
