package com.test.java;

public class Ex15_Method {
	
	public static void main(String[] args) {
		
		//Ex15_Method.java
		/*
		
			메서드, Method > 자바
			- 함수(Function), 프로시저(Procedure), 서브루틴(Sub Routine)..
			- 코드의 집합 > 같은 목적을 가진 코드의 집합
			- 코드 재사용의 단위(*****)
			
			
			메서드 사용
			1. 메서드 선언(정의)
			2. 메서드 호출(사용)
			
			
			메서드 사용 이유(목적)
			1. 코드 재사용(생산성 향상, 유지보수성 향상)
			2. 코드 관리			
						
		*/
		
		//요구사항] "안녕하세요." x 5회 출력
		//수정사항] "반갑습니다."
		
		//Case A.
		//- 가장 단순한 방법
		//- 하드 코딩
		//- 재사용성 0%, 유지보수성 0%
		
		printHello();
		
		//메서드 찾기(툴 기능)
		//- F3
		printNumber();
		
		
		
		//Case B.
		//- 메서드 사용
		
		//메서드 호출(실행) > 이름을 부른다.
		hello();
		hello();
		hello();
		hello();
		hello();
		
		
	}//main

	public static void printHello() {
		
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		
	}
	
	//이곳에 메서드 선언	
	//클래스:메서드
	//부모:자식
	
	/*
		메서드 선언 구문
		
		1. 메서드 헤더(header), 서명(Signature)
		접근지정자 정적키워드 반환타입 메서드명 인수리스트
		public     static     void     hello    () 
		
		2. 메서드 몸통(Body), 구현부(=실행부)
		{
			코드;
		}
		
		
	*/
	public static void hello() {
		
		System.out.println("반갑습니다.");
		
	}
	
	//변수명,메서드명 > 캐멀표기법
	public static void printNumber() {
	
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
		
	}

}















