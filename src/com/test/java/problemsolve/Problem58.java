package com.test.java.problemsolve;

public class Problem58 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			printSum(1 + 10*(i-1), i*10);
		}
		
	}

	private static void printSum(int a, int b) {
		
		int sum = 0;
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		
		System.out.printf("%d ~ %d: %d", a, b, sum);
		System.out.println();
		
	}
		
}
