package com.test.java.problemsolve;

public class Problem43 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(j == 6) {
					System.out.println();
				break;
				}
				System.out.printf("%d × %d = %-6d", j, i, j*i);
			}
		}
		
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for(int j=6; j<=9; j++) {
				System.out.printf("%d × %d = %-6d", j, i, j*i);
			}
			System.out.println();
		}
		
	}
	
}
