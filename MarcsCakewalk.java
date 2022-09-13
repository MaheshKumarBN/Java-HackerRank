package com.berry.codingchallenge;

import java.util.*;

class Result14 {

    /*
     * Complete the 'marcsCakewalk' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY calorie as parameter.
     */

    public static long marcsCakewalk(List<Integer> calorie) {
    // Write your code here
    	long minResult = 0; 
    	Collections.sort(calorie);
    	int j = 0;
    	for(int i = calorie.size()-1; i >= 0; i--) {
    		minResult += calorie.get(i) * Math.pow(2, j++);;
    	}
    	return minResult;
    }

}

public class MarcsCakewalk {
    public static void main(String[] args) {
        List<Integer> calorie = new ArrayList<Integer>();
        calorie.add(7);
        calorie.add(4);
        calorie.add(9);
        calorie.add(6);
        		
        long result = Result14.marcsCakewalk(calorie);
        System.out.println(result);
    }
}

