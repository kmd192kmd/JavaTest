package com.test.java;

public class Ex11_Casting {
	
	public static void main(String[] args) {
		
		//Ex11_Casting.java
		/*
		
			형변환, 자료형 변환
			- Casting, Promotion 등..
			- 하나의 자료형을 다른 자료형으로 변환하는 작업
			- 하나의 자료형을 가진 데이터를 > 다른 자료형을 가진 데이터를 바꾸기
			- int > double
			- float > short
			- 숫자형끼리만 가능
			
			1. 암시적 형변환, 자동 형변환, Promotion
				- 큰형 = 작은형
				- 100% 안전한 작업
				
			2. 명시적 형변환, 강제 형변환, Casting
				- 작은형 = 큰형
				- 상황에 달라진다.
				- 책임을 개발자 전가
				
				- 오버플로우(Overflow), 언더플로우(Underflow) > 주의!!!
		
		*/

		
		//대입 연산자
		//Lvalue(변수) = Rvalue(상수,변수)
		//***** Lvalue와 Rvalue의 자료형은 반드시 같아야 한다.(절대)
		
		
		byte b1;  //길이(1바이트)
		short s1; //길이(2바이트)
		
		b1 = 100;
		
		//short = byte
		s1 = b1;
		
		//(자료형)값: 형변환 연산자
		//s1 = (short)b1;
		
		

		byte b2;
		short s2;
		
		s2 = 200;
		
		//byte = short
		//1바이트 = 2바이트
		//작은형 = 큰형
		
		//Type mismatch: cannot convert from short to byte
		b2 = (byte)s2;
		
		System.out.println(b2); //복사본 확인
		
		
		//국민은행 > 계좌
		int m1; 	//대치동
		long m2; 	//역삼동
		
		m2 = 3000000000L; //30억 계좌
		
		//계좌 이체
		//4 = 8
		m1 = (int)m2;
		
		System.out.printf("이체결과: %,d원\n", m1);
		
	}

}









