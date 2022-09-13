package com.berry.codingchallenge;

import java.util.*;

class Result19 {

	/*
	 * Complete the 'theLoveLetterMystery' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts STRING s
	 * as parameter.
	 */

	public static int theLoveLetterMystery(String s) {
		// Write your code here
		boolean isPalindrome = checkPalindrome(s);
		int count = 0;
		if(!isPalindrome) {
			for(int i = 0; i < s.length()/2; i++) {
				int firstChar = s.charAt(i);
				int lastChar = s.charAt(s.length()-1-i);
				if(lastChar > firstChar) {
					while(lastChar != firstChar) {
						lastChar--;
						count++;
					}
				} else {
					while(lastChar != firstChar) {
						lastChar++;
						count++;
					}
				}
			}
		}
		return count;
	}

	public static boolean checkPalindrome(String s) {
		StringBuffer reverse = new StringBuffer(s);
		reverse.reverse();
		String rev = reverse + "";
		return rev == s ? true: false; 
	}
}

public class TheLoveLetterMystery {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String[] strings = { "abc", "abcba", "abcd", "cba" };
		for (String s : strings) {
			System.out.println(Result19.theLoveLetterMystery(s));
		}

	}
}
