package com.berry.codingchallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {
	public static void main(String[] args) {
		Integer[] arr = {2, 6};
		Integer[] brr = {24, 36};
		
		Arrays.asList(arr);
		Arrays.asList(brr);
		int result = getTotalX(Arrays.asList(arr), Arrays.asList(brr));
		System.out.println(result);
	}
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
	    // Write your code here
	        int result = 0;
	        Collections.sort(a);
	        Collections.sort(b);
	        
	        for(int i = 1; i <= 100; i++){
	        	boolean isTrue = true;
	            
	            for(int j = 0; j < a.size(); j++) {
	            	if(i % a.get(j) != 0) {
	            		isTrue = false;
	            	}
	            }
	            for(int j = 0; j < b.size(); j++) {
	            	if(b.get(j) % i != 0) {
	            		isTrue = false;
	            	}
	            }
	            if(isTrue) {
	            	result++;
	            }
	        }
			return result;
	    }
}
