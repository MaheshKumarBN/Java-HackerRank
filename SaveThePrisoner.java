package com.berry.codingchallenge;

class Result15 {

    /*
     * Complete the 'saveThePrisoner' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. INTEGER s
     */

    public static int saveThePrisoner(int n, int m, int s) {
    // Write your code here
//    	if((m%n)+s-1 == 0) {
//    		return n;
//    	} else {
//    		return (m%n)+s-1;
//    	}
    	
    	int a = m+s;
    	a = (a-1)%n;
    	if(a == 0)
    		a = n;
    	return a;
    }

}

public class SaveThePrisoner {
    public static void main(String[] args) {

                int n = 3;

                int m = 7;

                int s = 3;

                int result = Result15.saveThePrisoner(n, m, s);
                System.out.println(result);
    }
}
