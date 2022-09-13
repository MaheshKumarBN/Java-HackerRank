package com.berry.codingchallenge;

import java.util.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        Iterator<List<Integer>> itr = arr.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        int sum1 = 0;
        int sum2 = 0;
        //towards right
        for(int i = 0; i < arr.size(); i++) {
        	sum1 += arr.get(i).get(i);
        	sum2 += arr.get(i).get((arr.size()-1)-i);
        	System.out.print(arr.get(i).get(i)+" ");
        	System.out.print(arr.get(i).get((arr.size()-1)-i)+" ");
        }
        return ((sum1-sum2) > -1)?(sum1-sum2): (-1*(sum1-sum2));
    }
}

public class DiagonalDifference {
    public static void main(String[] args) {
        
    	List<List<Integer>> arr = new ArrayList<>();
    	
    	List<Integer> a1 = new ArrayList<Integer>();
    	a1.add(11);
    	a1.add(2);
    	a1.add(4);
        
    	List<Integer> a2 = new ArrayList<Integer>();
    	a2.add(4);
    	a2.add(5);
    	a2.add(6);
    	
    	List<Integer> a3 = new ArrayList<Integer>();
    	a3.add(10);
    	a3.add(8);
    	a3.add(-12);
    	
    	arr.add(a1);
    	arr.add(a2);
    	arr.add(a3);
    	
        int result = Result.diagonalDifference(arr);
        System.out.println();
        System.out.println("result = "+ result);
    }
}
