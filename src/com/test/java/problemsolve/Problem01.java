package com.test.java.problemsolve;

import java.util.Calendar;
import java.util.Scanner;

public class Problem01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 연도를 입력하세요: ");
		
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int birthYear = sc.nextInt();
		
		int age = currentYear - birthYear + 1;
		
		System.out.println("당신의 나이는 " + age + "세입니다.");
		
		sc.close();
		
	}

}
