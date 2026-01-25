package com.test.java.problemsolve;

public class Problem54 {
	
	public static void main(String[] args) {
		
		boolean isPrime = true;
		
		for(int i=2; i<=100; i++) {
			
			isPrime = true;
			
			for(int j=2; j<i; j++) {
				if(i % j == 0) {
					isPrime = false;
				}
			}
			
			if(isPrime = true) {
				System.out.printf("%d,", i);
			}
		}
		
	}

}
