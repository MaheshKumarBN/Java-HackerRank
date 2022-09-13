package com.berry.codingchallenge;

import java.time.LocalDate;

class Result6 {

	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		// Write your code here
		int fine = 0;
		if(d1 == d2 && m1 == m2 && y1 == y2) {
			fine = 0;
		} else if(d1 > d2 && m1 == m2 && y1 == y2) {
			fine = (d1-d2) * 15;
		} else if(m1 > m2 && y1 == y2) {
			fine = (m1 - m2) * 500;
		} else if(y1 > y2) {
			fine = (y1 - y2) * 10000;
		}	
		return fine;
	}
}

public class LibraryFine {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		int d1 = date.getDayOfMonth();
		int m1 = date.getMonthValue();
		int y1 = date.getYear();

		LocalDate date2 = LocalDate.of(2023, 8, 1);

		int d2 = date2.getDayOfMonth();
		int m2 = date2.getMonthValue();
		int y2 = date2.getYear();
		
		System.out.println(date);
		System.out.println(date2);
		
		int result = Result6.libraryFine(d1, m1, y1, d2, m2, y2);
		System.out.println(result);
	}
}
