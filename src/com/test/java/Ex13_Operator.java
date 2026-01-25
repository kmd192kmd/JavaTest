package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_Operator {
	
	public static void main(String[] args) throws IOException {
		
		//Ex13_Operator.java
		/*
		
			비교 연산자
			- >, >=, <, <=, ==(equals), !=(not equals)
			- 2항 연산자
			- 피연산자들의 우위/동등 비교
			- 피연산자는 숫자형을 가진다.
			- 연산의 결과가 boolean이다.
			
		*/
		
		int a = 10;
		int b = 3;
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		
		//요구사항] 사용자 나이 입력 > 18세 이상 통과, 거절
		//Ctrl + Shift + O //자동 import
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("나이 입력: ");
		
		String input = "20"; //reader.readLine(); //"20"
		
		//System.out.println(input >= 18);
		
		int age = Integer.parseInt(input); //"20" > 20
		
		System.out.println(age >= 18); //좋은 코드
		System.out.println(18 <= age); //나쁜 코드
		
		
		
		//문자열 연산자
		//- 2항 연산자
		//- 문자열과 문자열을 합치기
		
		String s1 = "하나";
		String s2 = "둘";
		
		System.out.println(s1 + s2);
		
		System.out.println("문자열" + "문자열");
		System.out.println("문자열" + 123);
		System.out.println(123 + "문자열");
		System.out.println("문자열" + true);
		
		
		
		//==, !=
		//- 숫자형
		//- 문자열
		
		s1 = "강아지";
		s2 = "고양이";
		
		//System.out.println(s1 > s2);
		System.out.println(s1 == s2); //절대 이렇게 사용 금지!!
		System.out.println(s1 != s2); //절대 이렇게 사용 금지!!
		
		
				
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = "홍";
		name3 = name3 + "길동";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(name1 == name2);
		System.out.println(name1 == name3); //***
		
		System.out.println(name1.equals(name2)); //name1 == name2
		System.out.println(name1.equals(name3)); //name1 == name3
		
		//*** 문자열의 비교
		//- ==, != > 사용금지!!
		//- equals() 메서드 > 사용!!
		
		
		//값형
		int num1 = 10;
		boolean f1 = true;
		char c1 = 'A';
		
		//참조형
		String d1 = "강아지";
		String d2 = "안녕하세요";
		
		int a1 = 1;
		int a2 = 1000000;
		
		System.out.println(d1);
		
	}

}











