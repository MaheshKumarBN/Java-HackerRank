package com.berry.codingchallenge;

public class JumpingOnTheClouds_Revisited {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c, int k) {
//		int energy = 100;
//		int i = 0;
//		if (c != null) {
//			while (energy > 0 && i <= c.length - 1) {
//				if (c[i + k] == 1) {
//					energy = energy - 1 - 2;
//					System.out.println(energy);
//				} else if (c[i + k] == 0) {
//					energy = energy - 1;
//					System.out.println(energy);
//				}
//				i = i + k;
//				if (i + k >= c.length) {
//					i = (i + k) - c.length;
//					if (c[i] == 1) {
//						energy = energy - 1 - 2;
//					} else {
//						energy = energy - 1;
//					}
//				}
//				if (i == 0) {
//					break;
//				}
//			}
//		}
//		return energy;

		int energy = 100;
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			index = (index + k) % c.length;
			if (c[index] == 1)
				energy -= 3;
			else 
				energy -= 1;
			if (index == 0) 
				break;
		}
		return energy;
	}

	public static void main(String[] args) {

		int k = 2;

		int[] c = { 0, 0, 1, 0, 0, 1, 1, 0 };

		int result = jumpingOnClouds(c, k);
		System.out.println(result);
	}
}
