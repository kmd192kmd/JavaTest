package com.test.java.problemsolve;

public class Problem57 {

	public static void main(String[] args) {
			
		for(int i=1; i<=10; i++) {
			printSum(i*10);
		}
		
	}

	private static void printSum(int a) {
		
		int sum = 0;
		for(int i=1; i<=a; i++) {
			sum += i;
		}
		
		System.out.printf("1 ~ %d: %d", a, sum);
		System.out.println();
		
	}

}

