package com.berry.codingchallenge;

public class ReducedString {

	public static void main(String[] args) {

		String s = "aaabccddd";

		String res = superReducedString(s);
		System.out.println(res);
	}

	private static String superReducedString(String s) {
		if (s.length() < 1) {
			return "Empty String";
		}
		if (s.length() == 1) {
			return s;
		}
		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() - 1) {
				if (s.charAt(i) == s.charAt(i + 1)) {
					return superReducedString(s.substring(0, i) + s.substring(i + 2, s.length()));
				}
			}
		}
		return s;
	}
}
