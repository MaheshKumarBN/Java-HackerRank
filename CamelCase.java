package com.berry.codingchallenge;

class Result11 {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcasemethod(String s) {
    // Write your code here
    	int count = 0;
    	if((int)s.charAt(1) != 32) {
    		count  = 1;
    		for(int i = 0; i < s.length(); i++) {
        		int l = (int)s.charAt(i);
        		if(l >= 65 && l <= 90) {
        			count++;
        		}
        	}
    	}
    	if(s == null || s == "" || s == " ") {
    		return 0;
    	}
    	return count;
    }

}

public class CamelCase {
    public static void main(String[] args) {

    	String s = "                           ";
        int result = Result11.camelcasemethod(s);

        System.out.println(result);
    }
}

