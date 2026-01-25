package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem28 {
	
	private static final int MIDDLE_START = 5;
	private static final int HIGH_START = 10;

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("근무 년수: ");
		
		int year = sc.nextInt();
		
		if(year < 1) {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
			sc.close();
		} 
		
		cal(year);
		
		sc.close();
		
	}

	private static void cal(int year) {
		
		String currentGrade;
		String nextGrade = "";
		int diffYear;
		
		if(year < MIDDLE_START) {
			currentGrade = "초급";
			nextGrade = "중급";
			diffYear = 5 - year;
			System.out.printf("%d년차 %s 개발자입니다.\n앞으로 %d년 더 근무를 하면 %s 개발자가 됩니다.", year, currentGrade, diffYear, nextGrade);
		} else if(year < HIGH_START) {
			currentGrade = "중급";
			nextGrade = "고급";
			diffYear = 10 - year;
			System.out.printf("%d년차 %s 개발자입니다.\n앞으로 %d년 더 근무를 하면 %s 개발자가 됩니다.", year, currentGrade, diffYear, nextGrade);
		} else {
			currentGrade ="고급";
			diffYear = year - (10 - 1);
			System.out.printf("%d년차 %s 개발자입니다.\n당신은 %d년전까지 중급 개발자였습니다.", year, currentGrade, diffYear, nextGrade);
		}
		
	}
	
}
