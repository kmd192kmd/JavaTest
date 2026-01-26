package com.test.java.problemsolve;

public class Problem41 {

	public static void main(String[] args) {
		
		int start = 1;
		int sum = 0;
		
		solve(start, sum, "");
	}

	private static void solve(int n, int sum, String expression) {
		
		int currentSum = n + sum;
		
		String nextExpression = (n==1) ? "" + n : expression + " + " + n;
		
		if(currentSum > 1000) {
			System.out.println(nextExpression + " = " + currentSum);
			return;
		}
		
		solve(n + 1, currentSum, nextExpression);
	}
	
}
