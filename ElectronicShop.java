package com.berry.codingchallenge;

public class ElectronicShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
    	int max  = -1;
    	
    	for(int i = 0; i < keyboards.length; i++) {
    		for(int j = 0; j < drives.length; j++) {
    			int keyDrives = keyboards[i] + drives[j];
    			if(keyDrives <= b) {
    				max = Math.max(keyDrives, max);
    			}
    		}
    	}
    	return max;
    }

    public static void main(String[] args) {

        int b = 5;
       
        int[] keyboards = {5};

        int[] drives = {4, 5};

        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpent);
    }
}

