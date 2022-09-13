package com.berry.codingchallenge;

import java.util.*;

class Result3 {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    	int count = 0;
    	for(int i = 0; i < ar.size(); i++) {
    		for(int j = i+1; j < ar.size(); j++) {
    			if((ar.get(i)+ar.get(j))%k == 0) {
    				count++;
    			}
    		}
    	}
    	return count;
    }

}

public class DivisibleSumPairs {
    public static void main(String[] args) {
      
      
        int n = 6;

        int k = 3;

        List<Integer> ar = new ArrayList<Integer>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);
        
        int result = Result3.divisibleSumPairs(n, k, ar);

        System.out.println(result);
    }
}
