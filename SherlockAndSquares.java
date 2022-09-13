package com.berry.codingchallenge;

public class SherlockAndSquares {
	public static void main(String[] args) {
		int a = 100;
		int b = 1000;
		int result = squares(a, b);
		System.out.println(result);
	}

	private static int squares(int a, int b) {
		// Write your code here
		int a1 = (int)Math.sqrt(a);
		int b1 = (int)Math.sqrt(b);
//		System.out.println(a1);
//		System.out.println(b1);
//		System.out.println(b1-a1);
//		int count = 0;
//		for(int i = 0; i <= b; i++) {
//			if(Math.pow(i, 2) >= a && Math.pow(i, 2) <= b )
//			count++;
//		}
		if(a1*a1 >= a)
			return b1-a1+1;
		return b1-a1;
	}
}
