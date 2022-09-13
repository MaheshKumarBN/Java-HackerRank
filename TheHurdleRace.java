package com.berry.codingchallenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TheHurdleRace {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<Integer>();

		System.out.println("Enter size");
		int size = sc.nextInt();
		
		for(int i = 0; i < size; i++) {
			al.add(sc.nextInt());
		}
		
		System.out.println("Enter k value");
		int k = sc.nextInt();
		System.out.println(hurdleRace(k, al));
	}

	public static int hurdleRace(int k, List<Integer> height) {
		// Write your code here
		int max = 0;
		Iterator<Integer> itr = height.iterator();
		while (itr.hasNext()) {
			int num = itr.next();
			if (num > max) {
				max = num;
			}
		}
		if (k < max) {
			return max - k;
		} else {
			return 0;
		}
	}
}
