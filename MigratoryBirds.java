package com.berry.codingchallenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MigratoryBirds {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}
		System.out.println(countAndAddInHashMap(al));
	}

	private static int countAndAddInHashMap(List<Integer> arr) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int result = 0;
		for(int num : arr) {
			if(!hm.containsKey(num)) {
				hm.put(num, 1);
			} else {
				hm.put(num, hm.get(num)+1);
			}
		}
		
		Collection<Integer> values = hm.values();
		int max = Collections.max(values);
		
		for(Entry<Integer, Integer> entry: hm.entrySet()) {
			if(entry.getValue() == max) {
				result = entry.getKey();
				break;
			}
		}
		return result;
	}
}
