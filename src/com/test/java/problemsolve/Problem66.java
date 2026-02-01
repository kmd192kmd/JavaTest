package com.test.java.problemsolve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Problem66 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = rnd.nextInt(45) + 1;
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		sort(arr);
		
	}

	private static void sort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	
		for (int i = 0; i < arr.length; i++) {
		    System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
		}
	}
}
