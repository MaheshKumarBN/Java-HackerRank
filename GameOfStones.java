package com.berry.codingchallenge;

class Result13 {

	/*
	 * Complete the 'gameOfStones' function below.
	 *
	 * The function is expected to return a STRING. The function accepts INTEGER n
	 * as parameter.
	 */

	public static String gameOfStones(int n) {
		// Write your code here
		if (n % 7 < 2) 
			return "Second";
		else
			return "First";
	}

}

public class GameOfStones {
	public static void main(String[] args) {
		int[] arr = {1,
				2,
				3,
				4,
				5,
				6,
				7,
				10};
		for (int i = 0; i < arr.length; i++) {
			String result = Result13.gameOfStones(arr[i]);
			System.out.println(result);
		}
	}
}
