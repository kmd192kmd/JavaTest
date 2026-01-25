package com.test.java;

public class Ex16_Method {
		
	//main 메서드
	//- 특수한 메서드
	//	- 이름이 예약어(main)
	//	- 개발자 호출(X), 프로그램이 실행되면 자바가 호출하는 메서드
	//	- 프로그램의 시작점(Entry Point)
	//	- 프로그램의 종착점(Ent Point)
	
	public static void main(String[] args) {
		
		//Ex16_Method.java
		
		//1. F3
		//2. Outline 창
		//3. Ctrl + 마우스 클릭 > Open Declaration
		
		//메서드 인자리스트
		//- 파라미터(Parameter)
		//- 매개변수
		//- 인수
				
		
		//요구사항] '홍길동'에게 인사를 메서드를 구현하시오.
		//요구사항] '아무개'에게 인사를 메서드를 구현하시오.
		//요구사항] '강아지'에게 인사를 메서드를 구현하시오.
		//요구사항] 대한민국 모든 사람~ x 5,111만명
		
		hello();
		hello2();
		hello3();
		
		//The method test(int) is not applicable for the arguments ()
		test(10);
		test(20);
		test(30);
				
		helloEveryone("홍길동");
		helloEveryone("아무개");
		helloEveryone("강아지");	
		
		
		//요구사항] 두 수를 입력받아 합을 구하는 메서드
		sum(10, 20);
		sum(5, 7);
		sum(100, 150);
		
		checkAge(25, "홍길동");
		checkAge(10, "테스트");
		
		//checkAge("아무개", 22);
		//checkAge(22);
		//checkAge(22, "아무개", "남자");
		
		//요구사항] 성적을 입력받아 총점과 평균을 출력하는 메서드 구현
		//- checkScore(국어, 영어, 수학)
		//- checkScore(100, 90, 80);
		//출력결과]
		//- 총점: 270점
		//- 평균: 90.0점
						
	}//main
	
	
	public static void checkAge(int age, String name) {
		
		//age 검사
		String result = age >= 18 ? "성인" : "미성년자";
		
		System.out.printf("%s님 > [%s]입니다.\r\n", name, result);		
		
	}
	
	//두 수를 입력받아 합을 구하는 메서드
	public static void sum(int a, int b) {
		
		System.out.println(a + b);
		
	}
	
	
	//메서드 다형성
	public static void test(int a) {
		
		System.out.println(a);
		
	}
	
	public static void hello() {		
		System.out.println("홍길동님. 안녕하세요.");		
	}
	
	public static void hello2() {		
		System.out.println("아무개님. 안녕하세요.");		
	}
	
	public static void hello3() {		
		System.out.println("강아지님. 안녕하세요.");		
	}
	
	public static void helloEveryone(String name) {		
		System.out.println(name + "님. 안녕하세요.");		
	}

}












