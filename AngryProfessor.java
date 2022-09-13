package com.berry.codingchallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AngryProfessor {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(-93);
		al.add(-86);
		al.add(49);
		al.add(-62);
		al.add(-90);
		al.add(-63);
		al.add(40);
		al.add(72);
		al.add(11);
		al.add(67);
		int k = 4;
	//	-93 -86 49 -62 -90 -63 40 72 11 67
		
		String result = angryProfessor(k, al);
		System.out.println(result);
	}

	public static String angryProfessor(int k, List<Integer> a) {
		// Write your code here
		int count = 0;
		Collections.sort(a);
		for(int a1 : a) {
			if(a1 <= 0) {
				count++;
			}
		}
		return count >= k?"NO" :"YES";
	}
}
