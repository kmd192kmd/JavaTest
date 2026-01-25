package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사각형의 너비를 입력: ");
		int A = sc.nextInt();
		System.out.println("사각형의 높이를 입력: ");
		int B = sc.nextInt();
		
		int extent = A*B;
		int circumference = 2*A + 2*B;
		
		System.out.printf("사각형의 넓이는 %dcm\u00B2입니다\n", extent);
		System.out.printf("사각형의 둘레는 %dcm입니다\n", circumference);
		
	}

}
