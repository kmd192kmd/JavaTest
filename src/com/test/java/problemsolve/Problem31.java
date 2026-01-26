package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem31 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int even = 0;
		int odd = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("숫자 입력: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] % 2 == 0) {
				even++;
			} else { 
				odd++;
			}
			
		}
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n"
				+ "홀수가 짝수보다 %d개 더 많습니다.", even, odd, Math.abs(odd - even));
	
		sc.close();
		
	}
}
