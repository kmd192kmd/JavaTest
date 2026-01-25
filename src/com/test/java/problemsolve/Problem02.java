package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		double A = sc.nextInt();
		
		System.out.println("숫자를 입력하세요.");
		
		double B = sc.nextInt();
		
		double result = A / B;
		
		System.out.printf("%,.0f + %,.0f = %,.0f\n" , A, B, A+B);
		System.out.printf("%,.0f - %,.0f = %,.0f\n" , A, B, A-B);
		System.out.printf("%,.0f * %,.0f = %,.0f\n" , A, B, A*B);
		if(result % 1 == 0) {
			System.out.printf("%,.0f / %,.0f = %,.0f\n" , A, B, A/B);
		} else {
			System.out.printf("%,.0f / %,.0f = %,.1f\n" , A, B, A/B);
		}
		System.out.printf("%,.0f %% %,.0f = %,.0f\n" , A, B, A%B);
		
		sc.close();
		
	}
}

