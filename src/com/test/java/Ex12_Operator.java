package com.test.java;

public class Ex12_Operator {
	
	public static void main(String[] args) {
		
		//Ex12_Operator.java
		/*
		
			연산자, Operator
			- 수학 연산자 > 프로그래밍 연산자
			- 피연산자를 대상으로 미리 정해진 연산(행동)을 한 후에 연산의 결과를 반환하는 역할
			- 주로 기호를 사용 + 단어도 사용
			
			
			1. 문장, Statement
			2. 표현식, Expression
			3. 연산자, Operator
			4. 피연산자, Operand
			5. 연산자 우선순위
			6. 연산자 연산방향
			
			1. 문장, Statement
			- 1개 이상의 표현식이 모여서 문장을 만든다.
			ex) int sum = 10 + 20;
			
			2. 표현식, Expression
			- 문장을 구성하는 최소 단위
			- 값을 나타내는 의미
			ex) int sum
			    10 + 20
			    sum = 30
			    10
			    20
			    
			3. 연산자, Operator
			ex) int sum = 10 + 20;
			    - =
			    - +
			    
			4. 피연산자, Operand    
			ex) int sum = 10 + 20;
			    - +: 10, 20
			    - =: sum, 30
			    
			5. 연산자 우선순위
			- 하나의 문장에 속해있는 모든 연산자들 중 누구를 먼저 실행야하는지 정해져 있는 순서
			ex) 1 + 2 x 3 = ?
			
			6. 연산자 연산방향
			- 하나의 문장에 속해있는 연산자들 중 같은 우선순위를 가지는 연산자들끼리의 실행 순서
			ex) 1 + 2 + 3 = ?
			
			
			int sum = 1 + 2 + 3;
			int sum = 3 + 3;
			int sum = 6;
			int sum > sum 생성
			sum = 6;
			;
			
			
			
			연산자 종류
			1. 행동(목적)
				a. 산술 연산자
				b. 비교 연산자
				c. 논리 연산자
				d. 대입 연산자
				e. 증감 연산자
				f. 조건 연산자
				g. 비트 연산자		
				i. 문자열 연산자	
			
			2. 형태(피연산자 개수)
				a. 1항 연산자, 단항
				b. 2항 연산자
				c. 3항 연산자
		
		*/
		
		//a. 산술 연산자
		//- +, -, *, /, %(mod(modulo), 나머지)
		//- 2항 연산자
		//- 피연산자 > 숫자형(정수,실수)
		
		int a = 10;
		int b = 3;
		
		//10 + 3 = 13
		System.out.printf("%d + %d = %d\r\n", a, b, a + b);
		System.out.printf("%d - %d = %d\r\n", a, b, a - b);
		System.out.printf("%d * %d = %d\r\n", a, b, a * b);
		System.out.printf("%d / %d = %d\r\n", a, b, a / b); //몫
		System.out.printf("%d %% %d = %d\r\n", a, b, a % b);//나머지
		
		
		double c = 10;
		double d = 3;
		
		System.out.printf("%f + %f = %f\r\n", c, d, c + d);
		System.out.printf("%f - %f = %f\r\n", c, d, c - d);
		System.out.printf("%f * %f = %f\r\n", c, d, c * d);
		System.out.printf("%f / %f = %f\r\n", c, d, c / d);
		System.out.printf("%f %% %f = %f\r\n", c, d, c % d);
		
		
		System.out.println(10); 	//정수
		System.out.println(3.14); 	//실수
		System.out.println(10F);    //실수(float)
		System.out.println(10D);    //실수(double)
		System.out.println(10.0);   //실수(double)
		
		System.out.println(10 / 3);		//3
		System.out.println(10.0 / 3.0); //3.33333
		
		//- 정수 / 정수 = 정수
		//- 실수 / 실수 = 실수
		//- 정수 / 실수 = 실수
		//- 실수 / 정수 = 실수
		
		//*** 모든 산술 연산자의 결과값의 자료형 > 두 피연산자 자료형 중 크기가 더 큰 자료형으로 반환된다.
		//- 예외 > int보다 작은 형으로만 되어 있는 연산의 결과는 무조건 int를 반환한다. > 
		//	- byte + byte = int
		//	- short + short = int
		//	- byte + short = int
		
		
		System.out.println(10 / 3); 	//int / int = int
		System.out.println(10.0 / 3.0); //double / double = double
		System.out.println(10 / 3.0);   //int / double = double
		System.out.println(10.0 / 3);   //double / int = double
		
		
		int e = 1000;
		byte f = 10;
		
		System.out.println(e + f); //자료형? int + byte = int
		
		
		int g = 1000000000; 
		int h = 2000000000;
		
		System.out.println(g + h); //int + int = int
		System.out.println((long)g + h); //long + int = long
		
		
		byte j = 100;
		byte k = 100;
		
		//byte + byte = byte (X)
		//byte + byte = int (O)
		System.out.println(j + k); 
		
		//Type mismatch: cannot convert from int to byte
		//1 = (byte)4
		byte l = (byte)(j + k);
		System.out.println(l);
		
		int m = j + k;
		
		
		
		//% 나머지 > 패턴 작업
		System.out.println(100 % 3);
		System.out.println(100 % 4);
		System.out.println(100 % 5);
		System.out.println(100 % 6);
		
		//달력 만들기 > 2025년 12월
		//1. 마지막 날짜 > 31일
		//2. 1일의 요일 > 월
		
		
		
	}

}









