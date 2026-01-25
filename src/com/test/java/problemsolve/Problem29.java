package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem29 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		double num1 = sc.nextInt();
		
		System.out.println("두번째 숫자: ");
		double num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("연산자: ");
		String operator = sc.nextLine();
		
		double result = 0;
	
		if(operator.equals("+")) {
			result = num1 + num2;
			System.out.printf("%.0f %s %.0f = %.0f", num1, operator, num2, result);
		} else if(operator.equals("-")) {
			result = num1 - num2;
			System.out.printf("%.0f %s %.0f = %.0f", num1, operator, num2, result);
		} else if(operator.equals("*")) {
			result = num1 * num2;
			System.out.printf("%.0f %s %.0f = %.0f", num1, operator, num2, result);
		} else if(operator.equals("/")) {
			result = num1 / num2;
			System.out.printf("%.0f %s %.0f = %.1f", num1, operator, num2, result);
		} else if(operator.equals("%")) {
			result = num1 % num2;
			System.out.printf("%.0f %s %.0f = %.1f", num1, operator, num2, result);
		} else {
			System.out.println("연산이 불가능합니다.");
		}
		
		sc.close();
		
	}


}
