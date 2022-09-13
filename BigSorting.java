package com.berry.codingchallenge;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigSorting {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("8");
		l.add("1");
		l.add("2");
		l.add("100");
		l.add("12303479849857341718340192371");
		l.add("3084193741082937");
		l.add("3084193741082938");
		l.add("111");
		l.add("200");
		List<String> result = bigSorting(l);
		System.out.println(result);
	}

	public static List<String> bigSorting(List<String> unsorted) {
		// Write your code here
				
		List<BigInteger> bl = new ArrayList<BigInteger>();
		List<String> res = new ArrayList<String>();
		for(String s: unsorted) {
			bl.add(new BigInteger(s));
		}
		Collections.sort(bl);
		for(BigInteger i: bl) {
			res.add(""+i);
		}
		return res;
	}
}
