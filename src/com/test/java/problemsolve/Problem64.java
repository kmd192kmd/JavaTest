package com.test.java.problemsolve;

import java.util.Random;

public class Problem64 {
	public static void main(String[] args) {
		
		int[] arr = new int[20];
		
		Random ran = new Random();
		
		int max = Integer.MIN_VALUE;
		
		int min = Integer.MAX_VALUE;
		
		System.out.print("원본: ");
		for(int i=0; i<arr.length; i++) {
			//arr[i] = (int)(Math.random()*20) + 1;
			arr[i] = ran.nextInt(20) + 1;
			System.out.print(arr[i] + ",");
			
			if(arr[i] >= max) {
				max = arr[i];
			}
			if(arr[i] <= min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
		
	}
}
