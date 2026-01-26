package com.test.java.problemsolve;

import java.util.Calendar;
import java.util.Scanner;

public class Problem33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도 입력: ");
		int year = sc.nextInt();
		
//		if(year % 4 != 0) {
//			System.out.printf("%d년은 \'평년\'입니다.", year);
//		} else if(year % 100 != 0) {
//			System.out.printf("%d년은 \'윤년\'입니다.", year);
//		} else if(year % 400 == 0) {
//			System.out.printf("%d년은 \'윤년\'입니다.", year);
//		} else {
//			System.out.printf("%d년은 \'평년\'입니다.", year);
//		}
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.printf("%d년은 \'윤년\'입니다.", year);
		} else {
			System.out.printf("%d년은 \'평년\'입니다.", year);
		}
		
		sc.close();
		
	}
	
}
