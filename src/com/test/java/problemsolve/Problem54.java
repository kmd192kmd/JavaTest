package com.test.java.problemsolve;

public class Problem54 {
	
	public static void main(String[] args) {
			
		for(int i=2; i<=100; i++) {
			
			if(divideRecursive(i, 2) == true) {
				System.out.print(i+",");
			}
			
		}
		
	}

	private static boolean divideRecursive(int dividend, int divisor) {
		
		if(divisor == dividend) {
			return true;
		}
		
		if(dividend % divisor == 0) {
			return false;
		} else {
			return divideRecursive(dividend, divisor + 1);
		}
	
	}
}
