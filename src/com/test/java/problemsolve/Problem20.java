package com.test.java.problemsolve;

import java.util.Calendar;

public class Problem20 {
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		System.out.println(now);
		
		getNow("백일");
		getNow("첫돌");
		
	}

	private static void getNow(String s) {
		
		Calendar now = Calendar.getInstance();
		
		if(s.equals("백일")) {
			now.add(Calendar.DATE, 100);
		} else if(s.equals("첫돌")) {
			now.add(Calendar.YEAR, 1);
		}
		
		int year =  now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DATE);
		
		System.out.printf("%s: %d-%d-%d\n", s, year, month, date);
		
	}

}
