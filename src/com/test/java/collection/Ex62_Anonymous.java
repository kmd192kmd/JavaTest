package com.test.java.collection;

public class Ex62_Anonymous {

	public static void main(String[] args) {
		
		/*
		 * 익명 클래스, Anonymous Class
		 * - 익명 객체, Anonymous Object
		 * - 이름없는 클래스
		 * 
		 * 
		 * BBB 클래스
		 * - 실명 클래스
		 * - 객체를 여러개 만들 때 사용
		 * - 클래스 지속 > 관리
		 * 
		 * 
		 * 익명 클래스
		 * - 객체를 딱 1개만 만들 때 사용
		 * - 붕어빵을 딱 1개만 먹고 싶을 때 사용하는 붕어빵틀
		 * - 클래스 > 관리 필요 없음
		 */
		
		//요구사항] 인터페이스를 구현하는 클래스 선언하기 > 객체를 생성 > 사용
		
		//1. 본인 타입의 참조 변수를 만들기
		BBB b1 = new BBB();
		b1.test();
		
		//2. 부모 타입의 참조 변수를 만들기
		AAA b2 = new BBB();
		b2.test();
		
		//3.
		//- Cannot instantiate the type AAA
		//AAA b3 = new AAA();
		
		//- The type new AAA(){} must implement the inherited abstract method AAA.test()
		AAA b3 = new AAA() {

			@Override
			public void test() {
				System.out.println("익명 객체의 메서드");
			}
			
		};
		b3.test();
		
		
		//클래스 + 객체 > 공산품 생산
		AAA b4 = new BBB();
		b4.test();
		
		AAA b5 = new BBB();
		b5.test();
		
		AAA b6 = new BBB();
		b6.test();
		
		AAA b7 = new AAA() {

			@Override
			public void test() {
				System.out.println("익명 객체 구현");
			}
			
		};
		b7.test();
		
		AAA b8 = new AAA() {

			@Override
			public void test() {
				System.out.println("익명 객체를 구현");
			}
			
		};
		b8.test();
		
		AAA b9 = new AAA() {

			@Override
			public void test() {
				System.out.println("익명객체구현");
			}
			
		};
		b9.test();
		
		
	}//main
	
}

interface AAA{
	void test();
}

//- The type BBB must implement the inherited abstract method AAA.test()
class BBB implements AAA{

	//본인의 멤버 구현
	
	@Override
	public void test() {
		System.out.println("추상 메서드를 구현");
		
	}
	
}