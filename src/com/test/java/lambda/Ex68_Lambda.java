package com.test.java.lambda;

public class Ex68_Lambda {

	public static void main(String[] args) {
		
		/*
		 * 람다식, Lambda Expression
		 * - 자바의 메서드를 함수형 프로그래밍 방식으로 표현하는 역할
		 * - 메서드를 짧고 알아보기 쉽게 작성
		 * 
		 * 
		 * 람다식을 사용할 수 있는 조건
		 * 1. 익명 객체를 생성하는 경우 > 대신
		 * 2. 인터페이스가 반드시 추상 메서드를 딱 1개만 소유
		 * 
		 * 
		 * 람다식 형식
		 * - 인터페이스 변수 = 람다식;
		 * ex) MyInterface m1 = () -> {};
		 * 
		 * () -> {}
		 * - 익명 클래스의 추상 메서드
		 * 
		 * (매개변수) -> {구현부}
		 * a. (매개변수): 추상 메서드의 매개변수
		 * b. ->: 화살표(Arrow), 연결 역할
		 * c. {구현부}: 추상 메서드의 구현부
		 */
		
		//요구사항] MyInterface 인터페이스를 구현한 객체를 생성하시오.
		//- Ex62 예지
		//1. MyInterface 선언
		//2. MyClass 선어
		//3. 객체 생성
		
		//Case 1.
		//- 인터페이스 선언 + 클래스 선언 + 객체 생성
		//MyClass m1 = new MyClass();
		MyInterface m1 = new MyClass();
		m1.test();
		
		//Case 2.
		//- 인터페이스 선언 + 익명 클래스 + 익명 객체
		MyInterface m2 = new MyInterface() {
			
			@Override
			public void test() {
				System.out.println("익명 객체에서 구현한 메서드");
			}

//			@Override
//			public void aaa() {
//				
//			}
//
//			@Override
//			public void bbb() {
//				
//			}
		};
		m2.test();
		
		
		//Case 3. 인터페이스 선언 + 람다식(= 익명 함수)
		MyInterface m3 = () -> {
			System.out.println("람다식으로 구현한 객체의  메서드");
		};
		m3.test();
		
		
		
	}//main
	
}

@FunctionalInterface //추상 메서드가 딱 1개 있어요. > 람다식을 쓸 수 있어.
interface MyInterface{
	void test();
	//void aaa();
	//void bbb();
}

class MyClass implements MyInterface{

	@Override
	public void test() {
		System.out.println("실명 객체에서 구현한 메서드");
	}

//	@Override
//	public void aaa() {
//		
//	}
//
//	@Override
//	public void bbb() {
//		
//	}
	
}
