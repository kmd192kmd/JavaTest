package com.test.java.problemsolve;

public class Problem53 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(j <= 5) {
				System.out.printf("%2d × %d = %2d   ", j, i, i*j);
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(j > 5) {
				System.out.printf("%2d × %d = %2d   ", j, i, i*j);
				}
			}
			System.out.println();
		}
		
	}
}
