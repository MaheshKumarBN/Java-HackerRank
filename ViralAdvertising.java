package com.berry.codingchallenge;

class Result12 {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
    // Write your code here
    	int result = 0;
    	int minPeople = 5;
    	int likedPeople = 0;	
    	int sharedPeopleInAday = 0;	
    	while(n > 0) { 
    		likedPeople = Math.floorDiv(minPeople, 2);
    		sharedPeopleInAday = likedPeople * 3;
    		minPeople = sharedPeopleInAday;
    		n--;
    		result += likedPeople; 
    	}
		return result;
    }

}

public class ViralAdvertising {
    public static void main(String[] args) {

        int n = 5;

        int result = Result12.viralAdvertising(n);
        System.out.println(result);
    }
}

