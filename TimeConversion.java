package com.berry.codingchallenge;

import java.io.*;
import java.time.LocalTime;

class Result7 {

	/*
	 * Complete the 'timeConversion' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String timeConversion(String s) {
		// Write your code here

//    	String getHours = ""+s.charAt(0)+s.charAt(1);
//    	char getMerit = s.charAt(8);
//    	
//    	Integer hrs = Integer.parseInt(getHours);
//    	
//    	System.out.println(getMerit);
//    	System.out.println(getHours);
//    	
//    	System.out.println("Int : "+hrs);
//    	
//    	if(getMerit == 'A') {
//    	} else if(getMerit == 'P') {
//    		char incnum = s.charAt(0);
//    		incnum++;
//    		char incum1 = s.charAt(1);
//    		incum1++;
//    		s.replace(s.charAt(0), incnum);
//    		s.replace(s.charAt(1), incum1);
//    	} 

		int hh = Integer.parseInt(s.substring(0, 2));
		int mm = Integer.parseInt(s.substring(3, 5));
		int ss = Integer.parseInt(s.substring(6, 8));
		LocalTime format = LocalTime.of(hh, mm, ss);
		String s1 = "00:";
		if (s.charAt(8) == 'P') {
			if(format.getHour() != 12) {
				format = format.plusHours(12);
				s1 = format + "";
			} else {
				s1 = "";
				for (int i = 0; i < s.length() - 2; i++) {
					s1 +=  s.charAt(i);
				}
			}
		} else if (s.charAt(8) == 'A') {
			if (format.getHour() == 12) {
				for (int i = 3; i < s.length() - 2; i++) {
					s1 += s.charAt(i);
				}
			} else {
				s1 = "";
				for (int i = 0; i < s.length() - 2; i++) {
					s1 +=  s.charAt(i);
				}
			}
		}
		return s1;
	}

}

public class TimeConversion {
	public static void main(String[] args) throws IOException {

		String s = "01:01:00AM";

		String result = Result7.timeConversion(s);

		System.out.println(result);

	}
}
