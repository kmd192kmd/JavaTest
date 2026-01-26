package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem37 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자: ");
		int A = sc.nextInt();
		
		int result = cal(A);
		
		System.out.printf("%d~%d = %d", 1, A, result);
		
		sc.close();
		
	}

	private static int cal(int A) {
		
		if(A == 1) {
			return 1;
		} 
		
		return A + cal(A-1);
		
	}
	
}
