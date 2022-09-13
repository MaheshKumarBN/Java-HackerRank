package com.berry.codingchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {
	public static void main(String[] args) {
		List<String> grid = new ArrayList<String>();
		grid.add("ebacd");
		grid.add("fghij");
		grid.add("olmkn");
		grid.add("trpqs");
		grid.add("xywuv");
		String result = gridChallenge(grid);
		System.out.println(result);
	}

	private static String gridChallenge(List<String> grid) {
		List<String> sortedList = new ArrayList<String>(grid.size());
		String isTrue = "YES";
		for (String s : grid) {
			String stringObject = s;
			stringObject = sortStringObject(stringObject);
			sortedList.add(stringObject);
		}
		System.out.println(sortedList);

//		char[][] sortedListArray = new char[sortedList.size()][sortedList.get(1).length()];
//		for (int i = 0; i < sortedList.size(); i++) {
//			for (int j = 0; j < sortedList.get(i).length(); j++) {
//				sortedListArray[i][j] = sortedList.get(i).charAt(j);
//			}
//		}
//
//		for (int i = 0; i < sortedList.size(); i++) {
//			for (int j = 0; j < sortedList.get(i).length(); j++) {
//				System.out.print(sortedListArray[i][j] + " ");
//			}
//			System.out.println();
//		}

		for (int i = 1; i < sortedList.size(); i++) {
			for (int j = 0; j < sortedList.get(i).length(); j++) {
				if (sortedList.get(i-1).charAt(j) > sortedList.get(i).charAt(j)) {
					isTrue = "NO";
					break;
				}
			}
		}

		return isTrue;
	}

	private static String sortStringObject(String stringObject) {
		char[] arr = stringObject.toCharArray();
		Arrays.sort(arr);
		String sortedString = "";
		for (int i = 0; i < arr.length; i++) {
			sortedString += arr[i];
		}
		return sortedString;
	}
}
