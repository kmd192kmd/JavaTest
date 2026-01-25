package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem04 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("섭씨 온도 입력: ");
			double C = sc.nextInt();
			double F = C*1.8 + 32;
			
			System.out.printf("섭씨%.1f\u2103는 화씨 %.1f\u2109입니다.\n", C, F);
			
			sc.close();
			
		}
	
}
