package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex24_Switch {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Switch문, Switch CASE문
		 * -조건: 정수, 문자열, 열거형
		 * 
		 * switch (조건) {
		 * 		case 값 :
		 * 			코드;
		 * 			break;
		 * 		case 값 :
		 * 			코드;
		 * 			break;
		 * 		case 값 :
		 * 			코드;
		 * 			break;
		 * 		default:
		 * 			코드;
		 * 			break;
		 * }
		 */
		 
		//1();
		//m2();
		//m3();
		m4();
		
	}// main
	
	private static void m4() {

		//형변환
		//- 숫자형(6+1)끼리만 가능
		
		//'A' > 65
		System.out.printf("%c\r\n", 65);
		System.out.println((char)65); //문자형도 결국 숫자로 메모리에 저장되므로 형변환이 된다!
		System.out.println((int)'A');
		
		char c1 = 'B'; //2byte // '가'는 4만이 넘어가므로 오버플로우가 발생하게 될것이다.
		byte b1;
		short s1; //2byte
		
		//short(2) = char(2)
		//작은형 = 큰형
		s1 = (short) c1;
		
		System.out.println(s1); //66
		
		char c2;
		short s2 = 67; //'C'
		
		//char(2) = short(2)
		//작은형 = 큰형
		c2 = (char)s2;
		
		System.out.println(c2);
		
		//*** 문자 코드를 저장할 숫자형은 int이다. long을 구지 쓸 이유는 없고, short는 불완전하다.
		
	}

	private static void m3() {
		
		//달력 > 마지막일?
		
		int month = 4;
		int lastDay = 0;
		
		if(month == 1 
				|| month == 3 
				|| month == 5 
				|| month == 7 
				|| month == 8 
				|| month == 10 
				|| month == 12 ) {
			lastDay = 31;
		} else if (month == 4 
					|| month == 6 
					|| month == 9 
					|| month == 11) {
			lastDay = 30;
		} else {
			lastDay = 28;
		}
		
		System.out.println(lastDay);
		
		switch(month) {
			case 1:		
			case 3:
			case 5:		
			case 7:
			case 8:	
			case 10:
			case 12:
				lastDay = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lastDay = 30;
				break;
			case 2:
				lastDay = 28;
				break;
		}
		
		
		
		System.out.println(lastDay);
		
	}

	private static void m2() throws IOException {
		
		//요구사항] 자판기
		//- 메뉴 출력 > 음료 선택 > 가격 출력
		//- 가격 변동 > 앞으로 평생 콜라와 사이다는 가격이 같다.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("==========");
		System.out.println(" 자 판 기 ");
		System.out.println("==========");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("----------");
		System.out.println("번호 선택: ");
		
		String input = reader.readLine();
		
		if (input.equals("1") || input.equals("2")) {
			System.out.println("700원입니다.");
		} else if (input.equals("3")) {
			System.out.println("500원입니다.");
		}
		
		//위 반복문 코드의 or조건문을 아래의 switch 코드로 구현한것.
		switch (input) {
			case "1":
			case "2":
				System.out.println("700원 2");
				break;
			case "3":
				System.out.println("500원");
				break;
		}
		
	}

	private static void m1() {
		
		//숫자 1개 입력 > 한글로 출력
		//-1 > 하나
		//-2 > 둘
		//-3 > 셋
		
		int num = 4;
		
		
		if(num == 1) {
			System.out.println("하나");
		} else if (num == 2) {
			System.out.println("둘");
		} else if (num == 3) {
			System.out.println("셋");
		} else {
			System.out.println("나머지 숫자");
		}

	
		switch (num) {
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			default:
				System.out.println("나머지 숫자");
				break;
		} 
		
		int score = 55;
		
		if(score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		//*** switch문은 범위 조건에는 부적합하다. 아래의 코드로 위의 코드를 구현하려면 굉장히 불편하다.
//		switch(score / 10) {
//			case 값:
//				System.out.println("합격");
//				break;
//			case 값:
//				System.out.println("불합격");
//				break;
	}//m1  
		
}
