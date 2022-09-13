package com.berry.codingchallenge;

class Result16 {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
    // Write your code here
    	int count = 0;
    	
    	while(i <= j) {		
    		double resultant = 0;
        	int rev = reverseI(i);
    		int num = 0;
    		System.out.println("i : "+i);
    		num = i - rev;
    		System.out.println("num : "+num);
    		if(num < 0) {
    			num *= -1;
    			System.out.println("PositiveNum : "+num);
    		}
    		resultant = (double)num/(double)k;
    		System.out.println("resultant : "+resultant);
    		int resInt = (int) resultant;
    		System.out.println("resInt : "+resInt);
    		if(resultant % resInt == 0 || resultant == 0) {
    			count++;
    			System.out.println("count : "+count);
    		}
    		i++;
    	}
    	return count;
    }

	public static int reverseI(int i) {
		StringBuffer s = new StringBuffer(""+i);
		s.reverse();
		String reversedNum = ""+s;
		return Integer.parseInt(reversedNum);
	}

}

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        int i = 20;
        int j = 23;
        int k = 6;
        int result = Result16.beautifulDays(i, j, k);
        System.out.println(result);
    }
}

