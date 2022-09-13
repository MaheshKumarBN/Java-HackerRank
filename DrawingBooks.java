package com.berry.codingchallenge;

public class DrawingBooks {
	public static void main(String[] args) {
		System.out.println(pageCount(6, 2));
	}

	public static int pageCount(int n, int p) {
		// Write your code here
		return Math.min(p / 2, (n/2) - (p/2));
	}
}
