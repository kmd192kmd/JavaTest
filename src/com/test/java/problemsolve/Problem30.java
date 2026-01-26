package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem30 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자(영문자만 입력 가능): ");
		
		String input = sc.next();
		
		if(input.length() > 1) {
			System.out.println("영문자 한 글자만 입력하시오.");
			return;
		}
		
		char ch = input.charAt(0);
		
		if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
			System.out.println("영문자만 입력하시오.");
			return;
		} else if ((ch >= 'A' && ch <= 'Z')){
			char lowerCh = Character.toLowerCase(ch);
			System.out.printf("\'%c\'의 소문자는 \'%c\'입니다.", ch, lowerCh);
		} else if((ch >= 'a' && ch <= 'z')) {
			char upperCh = Character.toUpperCase(ch);
			System.out.printf("\'%c\'의 대문자는 \'%c\'입니다.", ch, upperCh);
		}
		
		sc.close();
		
	}
}
