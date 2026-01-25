package com.test.java.problemsolve;

import java.util.Calendar;
import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) {
		
		String male;
		String female;
		int year;
		int month;
		int date;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("남자 이름: ");
		male = sc.nextLine();
		
		System.out.println("여자 이름: ");
		female = sc.nextLine();
		
		System.out.println("만난날(년): ");
		year = sc.nextInt();
		
		System.out.println("만난날(월): ");
		month = sc.nextInt() - 1;
		
		System.out.println("만난날(일): ");
		date = sc.nextInt();
		
//		Calendar now = Calendar.getInstance();
//		now.set(year, month, date);
//			
//		System.out.printf("\'%s\'과(와) \'%s\'의 기념일\n", male, female);
//		
//		now.add(Calendar.DATE, 100);
//		System.out.printf("100일: %tF\n", now);
//		
//		now.set(year, month, date);
//		now.add(Calendar.DATE, 200);
//		System.out.printf("200일: %tF\n", now);
//		
//		now.set(year, month, date);
//		now.add(Calendar.DATE, 300);
//		System.out.printf("300일: %tF\n", now);
//		
//		now.set(year, month, date);
//		now.add(Calendar.DATE, 500);
//		System.out.printf("500일: %tF\n", now);
//		
//		now.set(year, month, date);
//		now.add(Calendar.DATE, 1000);
//		System.out.printf("1000일: %tF\n", now);
		
		int[] anniversaries = {100, 200, 300, 500, 1000};
		
		Calendar cal = Calendar.getInstance();
		
		for(int i=0; i<5; i++) {
			
			cal.set(year, month, date);
			cal.add(Calendar.DATE, anniversaries[i]);
			System.out.printf("%d일: %tF\n", anniversaries[i], cal);
		}
		
		sc.close();
		
	}
	
}
