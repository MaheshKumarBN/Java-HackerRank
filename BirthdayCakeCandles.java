package com.berry.codingchallenge;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class Result1 {

	/*
	 * Complete the 'birthdayCakeCandles' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY candles as parameter.
	 */

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here
		int maxCandles = 0;
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(Integer i: candles) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			}else {
				hm.put(i, 1);
			}
		}
		
		Iterator<Entry<Integer, Integer>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, Integer> entry = itr.next();
			if(maxCandles<entry.getValue()) {
				maxCandles = entry.getValue();
			}
		}
		return maxCandles;
	}

}

public class BirthdayCakeCandles {
	public static void main(String[] args) throws IOException {

		List<Integer> candles = new ArrayList<Integer>();
		candles.add(3);
		candles.add(2);
		candles.add(1);
		candles.add(3);
		candles.add(3);
		candles.add(18);
		candles.add(2);
		candles.add(3);

		int result = Result1.birthdayCakeCandles(candles);

		System.out.println("Max Candles = "+result);
	}
}
