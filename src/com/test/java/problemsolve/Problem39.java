package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작 숫자: ");
		int start = sc.nextInt();
		
		System.out.println("종료 숫자: ");
		int end = sc.nextInt();
		
		int result = cal(start, end);	
		
		System.out.printf(" = %d", result);
		
	}

	private static int cal(int start, int end) {
		
		System.out.print(start);
		
		if(start == end) {
			return start;
		}
		
		System.out.print(" + ");
		
		return start + cal(start + 1, end);
		
	}
	
}
