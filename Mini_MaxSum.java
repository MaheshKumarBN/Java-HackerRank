package com.berry.codingchallenge;

import java.util.*;

class Result4 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    	Collections.sort(arr);
    	long minSum = 0;
    	long maxSum = 0;
    	for(int i = 0; i < arr.size()-1; i++) {
    		minSum += arr.get(i);
    	}
    	for(int i = 1; i < arr.size(); i++) {
    		maxSum += arr.get(i);
    	}
    	System.out.print(minSum+" "+maxSum);
    	
    }

}

public class Mini_MaxSum {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        Result4.miniMaxSum(arr);
    }
}
