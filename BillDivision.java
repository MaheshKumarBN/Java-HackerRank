package com.berry.codingchallenge;

import java.util.Arrays;
import java.util.List;

public class BillDivision {
	public static void main(String[] args) {
		Integer[] a = {3, 10, 2, 9};
 		List<Integer> bill = Arrays.asList(a);
 		int k = 1;
 		int b = 12;
 		bonAppetit(bill, k, b);
	}

	public static void bonAppetit(List<Integer> bill, int k, int b) {
		// Write your code here
		int sum = 0;
		for(int i = 0; i < bill.size(); i++) {
			if(bill.get(i) != bill.get(k)) {
				sum += bill.get(i); 
			}
		}
		if(sum / 2 == b) 
			System.out.println("Bon Appetit");
		else 
			System.out.println(b - (sum / 2));
		
		
	}
}
