package com.berry.codingchallenge;

class Result8 {

	/*
	 * Complete the 'caesarCipher' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. STRING s 2. INTEGER k
	 */

	public static String caesarCipher(String s, int k) {
		// Write your code here
//		String result = "";
//		for (int i = 0; i < s.length(); i++) {
//			int getChar = (int) s.charAt(i);
//			if (!(getChar + k > 122) || !(getChar + k > 90)) {
//				if ((getChar >= 65 && getChar <= 90) || (getChar >= 97 && getChar <= 122)) {
//					char c = (char) (getChar + k);
//					result += c;
//				} else {
//					result += s.charAt(i);
//				}
//			} else if (getChar + k > 122 && (((getChar + k) - 26 >= 65 && (getChar + k) - 26 <= 90)
//					|| ((getChar + k) - 26 >= 97 && (getChar + k) - 26 <= 122))) {
//				char c = (char) ((getChar + k) - 26);
//				result += c;
//			} else if (getChar + k > 90 && (((getChar + k) - 26 >= 65 && (getChar + k) - 26 <= 90)
//					|| ((getChar + k) - 26 >= 97 && (getChar + k) - 26 <= 122))) {
//				char c = (char) ((getChar + k) - 26);
//				result += c;
//			}
//		}
//		return result;

//		String res = "";
//
//		for (int i = 0; i < s.length(); ++i) {
//			int val = s.charAt(i);
//			int dup = k;
//
//			if (val + k > 122) {
//				k -= (122 - val);
//				k = k % 26;
//
//				res += (char) (96 + k);
//			} else if((val >= 65 && val <= 90) || (val >= 97 && val <= 122)){
//				res += (char) (val + k);
//			} else {
//				res += (char) val;
//			}
//
//			k = dup;
//		}
//		return res;
		
		
		StringBuilder builder = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            boolean upperCase = Character.isUpperCase(temp);
            if (Character.isLetter(temp)) {
                temp += k%26;
                if (!Character.isLetter(temp) || (upperCase && !Character.isUpperCase(temp))) {
                    temp -= 26;
                }
            }
            builder.append(temp);
        }
        
        return ""+builder;
	}

}

public class CaesarCipher {
	public static void main(String[] args) {

		int k = 2;

		String s = "middle-Outz";

		String result = Result8.caesarCipher(s, k);

		System.out.println(result);
	}
}
