package com.berry.codingchallenge;

public class Tower_Breakers {
	public static void main(String[] args) {
		
	}
	
	
//	n: the number of towers
//	m: the height of each tower
	public int towerBreaker(int n, int m) {
		int winner = 0;
		if(n == 1 && m == 1) {
			winner = 2;
		} else if(n == 1 && m >= 2 && m % 2 == 1) {
			winner = 1;
		} else {
			winner = 2;
		}
		return winner;
	}
}
