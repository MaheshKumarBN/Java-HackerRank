package com.berry.codingchallenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result20 {

	/*
	 * Complete the 'separateNumbers' function below.
	 *
	 * The function accepts STRING s as parameter.
	 */

	public static void separateNumbers(String s) {
		// Write your code here
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 0) {
				System.out.println("NO");
			} else if(s.charAt(i) == 9) {
				
			}
		}
	}

}

public class SeparateTheNumbers {
	public static void main(String[] args) {
		String[] s = { "99910001001", "7891011", "9899100", "999100010001" };
		for(String s1: s) {
			Result20.separateNumbers(s1);
		}
	}
}
