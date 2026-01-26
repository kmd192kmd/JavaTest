package com.test.java.problemsolve;

public class Problem42 {

	public static void main(String[] args) {
		
		int sum1 = 0;
		
		int sum2 = 0;
		
		int year = 2026;
		
		int month = 1;
		
		int date = 25;
		
		String week = "";
		
		for(int i=1; i<year; i++) {
			if(isLeapYear(i)) {
				sum1 += 366;
			} else {
				sum1 += 365;
			}
		}
		
		int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(isLeapYear(year)) {
			monthDays[2] = 29;
		}
		
		for(int i=1; i<month; i++) {
			sum2 += monthDays[i];
		}
		
		int totalDays = sum1 + sum2 + date;
		
		String[] dayOfWeek = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		week = dayOfWeek[(int)(totalDays % 7)];
		
		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s입니다.", year, month, date
				, totalDays, week);
		
	}

	private static boolean isLeapYear(int n) {
		return (n % 4 == 0 && n % 100 != 0) || n % 400 == 0;
	}
	
}
