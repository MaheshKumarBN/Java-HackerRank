package com.berry.codingchallenge;

class Result18 {

    /*
     * Complete the 'howManyGames' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER d
     *  3. INTEGER m
     *  4. INTEGER s
     */

    public static int howManyGames(int p, int d, int m, int s) {
    // Return the number of games you can buy
    	int answerCount = -1;
    	int budgetCount = 0;
    	while(p >= m && budgetCount <= s) {
    		answerCount++;
    		budgetCount += p; 
    		System.out.println("budget: "+budgetCount);	
    		p -= d;
    	}
    	while(p <= m && budgetCount <= s) {
    		p = m;
    		budgetCount += p;
    		System.out.println("budget: "+budgetCount);
    		answerCount++;
    	}
    	
    	return answerCount;
    }

}

public class HalloweenSale {
    public static void main(String[] args) {

        int p = 20;
        int d = 3;
        int m = 6;
        int s = 85;
        int answer = Result18.howManyGames(p, d, m, s);

        System.out.println("matches: "+answer);
    }
}
