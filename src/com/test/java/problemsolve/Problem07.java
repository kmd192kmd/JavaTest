package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem07 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
				
			System.out.println("영어 소문자 입력: ");
			String str = sc.nextLine();
			
			char smallLetter = str.charAt(0);
			int num_smallLetter = str.charAt(0) - 32;
			char bigLetter = (char)num_smallLetter; 
			
			System.out.printf("소문자 \'%s\'의 대문자는 \'%s\'입니다.", smallLetter, bigLetter);
			
			sc.close();
			
		}
		
}
