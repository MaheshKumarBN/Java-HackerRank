package com.berry.codingchallenge;

class Result5 {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
    	int level = 0;
    	int valley = 0;
    	for(int i = 0; i < path.length()-1; i++) {
    		if(path.charAt(i) == 'U') {
    			level++;
    		} else if(path.charAt(i) == 'D') {
    			if(level == 0) {
    				valley++;
    			}
    			level--;
    		}
    	}
    	return valley;
    }

}

public class CountingValleys {
    public static void main(String[] args) {
       int steps = 8;

        String path = "UUDDDDUU";

        int result = Result5.countingValleys(steps, path);
        System.out.println(result);
    }
}

