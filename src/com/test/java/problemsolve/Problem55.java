package com.test.java.problemsolve;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem55 {
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int sum = 0;
			for(int j=1; j<=i/2; j++) {
				if( i % j == 0) {
					arr.add(j);
					sum += j;
				}
			}
			if(sum == i) {
				System.out.printf("%d = [", i);
				for(int k=0; k<arr.size(); k++) {
					System.out.printf("%d,", arr.get(k));
			}
			System.out.print("]");
			System.out.println();
		}
		
	}

}
}

