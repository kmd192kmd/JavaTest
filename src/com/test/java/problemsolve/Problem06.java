package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한달 수입: ");
		int income = sc.nextInt();
		double tax = income * 0.033;
		double afterTax = income - tax;
		
		System.out.printf("세후 금액(원): %,.0f원\n세금(원): %,.0f원\n", afterTax, tax);
		
		sc.close();
		
	}
	
}
