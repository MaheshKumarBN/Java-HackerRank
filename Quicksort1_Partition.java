package com.berry.codingchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quicksort1_Partition {
	public static void main(String[] args) {
		Integer[] arr = { 4, 5, 3, 7, 2 };
		List<Integer> result = quickSort(Arrays.asList(arr));
		System.out.println(result);
	}

	public static List<Integer> quickSort(List<Integer> arr) {
		// Write your code here
//		int pivot = arr.get(0);
//		int mid = 0;
//		int j = 0;
//		List<Integer> res = new ArrayList<Integer>(arr.size());
//		
//		
//		if (arr.size() % 2 == 0)
//			mid = arr.size() / 2 + 1;
//		else
//			mid = (arr.size() / 2);
//
//		int k = mid + 1;
//		
//		for (int i = 0; i < arr.size(); i++) {
//			res.add(0);
//		}
//
//		for (int i = 1; i < res.size(); i++) {
//			res.set(mid, pivot);
//			if (arr.get(i) > pivot) {
//				res.set(k, arr.get(i));
//				k++;
//			}
//			else if (arr.get(i) < pivot)
//				res.set(j++, arr.get(i));
//		}
//		return res;
		
		
		int pivot = arr.get(0);
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> mid = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == pivot)
				mid.add(arr.get(i));
			else if(arr.get(i) > pivot)
				right.add(arr.get(i));
			else if(arr.get(i) < pivot)
				left.add(arr.get(i));
			
			
		}
		left.addAll(mid);
		left.addAll(right);
		return left;
	}
}
