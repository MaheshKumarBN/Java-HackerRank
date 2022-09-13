package com.berry.codingchallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInanArray {
	public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(-7);
        arr.add(0);

        int result = Result9.minimumAbsoluteDifference(arr);
        
        System.out.println(result);
	}
}
class Result9 {

    /*
     * Complete the 'minimumAbsoluteDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minimumAbsoluteDifference(List<Integer> arr) {
    // Write your code here
    	int res = Integer.MAX_VALUE;
//    	for(int i = 0; i < arr.size(); i++) {
//    		for(int j = 0; j < arr.size(); j++) {
//    			if(i != j) {
//    				int temp = arr.get(i)-arr.get(j);
//    				if(temp < 0) {
//        				temp *= -1;
//        			}
//    				if(temp < res) {
//        				res = temp;
//        			}
//    			}
//    		}
//    	}
    	Collections.sort(arr);
        for(int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i)-arr.get(i-1);
                if(temp < 0) {
                    temp *= -1;
                }
                if(temp < res) {
                    res = temp;
                }
            }
        return res;
    }

}
