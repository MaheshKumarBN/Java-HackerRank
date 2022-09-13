package com.berry.codingchallenge;

public class StrongPassword {
	public static void main(String[] args) {
		String password = "Ab1";
		System.out.println(minimumNumber(password.length(), password));
	}

	public static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong
		
		int number = 0;
		int low_case = 0;
		int up_case = 0;
		int special = 0;
		
		int min = 0;
//		if (password.length() < 6) {
//			min = 6 - n;
//		} else if(password.length() >= 6) {
//			for(int i = 0; i < n; i++) {
//				if(!numbers.contains(""+password.charAt(i))) {
//					min += 1;
//				}
//				if(!lower_case.contains(""+password.charAt(i))) {
//					min = 1;
//				}
//				if(!upper_case.contains(""+password.charAt(i))) {
//					min = 1;
//				}
//				if(!special_characters.contains(""+password.charAt(i))) {
//					min = 1;
//				}
//			}
//		}
		
		for(int i = 0; i < password.length(); i++) {
			int asciiChar = (int)password.charAt(i);
			if(asciiChar >= 48 && asciiChar <= 57) {
				number++;
			} if(asciiChar >= 65 && asciiChar <= 90) {
				up_case++;
			} if(asciiChar >= 97 && asciiChar <= 122) {
				low_case++;
			} else {
				special++;
			}
		}
		
		if(number == 0) {
			min++;
		} if(low_case == 0) {
			min++;
		} if(up_case == 0) {
			min++;
		} if(special == 0) {
			min++;
		}
		
		if(password.length()+min >= 6) {
			return min;
		}
		else { 
			return (min+(6-(password.length()+min)));		
		}
	}
}
