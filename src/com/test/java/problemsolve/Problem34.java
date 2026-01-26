package com.test.java.problemsolve;

import java.util.Calendar;
import java.util.Scanner;

public class Problem34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년: ");
		int year = sc.nextInt();
		
		System.out.println("월: ");
		int month = sc.nextInt() - 1;
		
		System.out.println("일: ");
		int date = sc.nextInt();
		
		Calendar c1 = Calendar.getInstance();
		
		c1.set(Calendar.YEAR, year);
		c1.set(Calendar.MONTH, month);
		c1.set(Calendar.DATE, date);
		
		int day = c1.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(day);
		
		if(day == 1 || day == 7) {
			System.out.println("입력하신 날짜는 \'휴일(토/일)\'입니다.\n"
					+ "결과가 없습니다.");
		} else {
			c1.add(Calendar.DATE, 7-day);
			System.out.printf("입력하신 날짜는 \'평일\'입니다.\n"
					+ "해당 주의 토요일로 이동합니다.\n"
					+ "이동한 날짜는 \'%tF\'입니다.", c1);
		}
		
		sc.close();
		
	}
	
}
