package com.test.java;

public class Ex19_Method {
	
	public static void main(String[] args) {
		int a = 30; // 메인메서드의 지역변수라고 할수있다.
		System.out.println(a);
		/*
		자바 변수의 종류
		-선언된 위치, 역할 차이
		
		1. 멤버 변수, Member variables 
			- 클래스 수업때 다시 볼 예정
		
		2. 지역 변수, Local Variables
			- 지금까지의 모든 변수
			- 메서드 내에서 선언한 변수
			- 변수의 영역(Scope) > 변수를 사용할 수 있는 영역(***)		
		
			지역 변수의 생명 주기,  Life Cycle
			- 변수가 언제 태어나서(메모리 생성) ~ 언제 죽는지(메모리 해제)
			- 생성 : 변수 선언문이 실행되는 순간 / 즉, 변수를 미리 메모리에 할당 해두지 않는다.
			- 소멸 : 변수 선언문이 포함된 자신의 영역을 제어가 벗어날 때 / 즉, 메서드가 종료되면 메모리에서 사라진다.
			
		*/
		//int a; a를 초기화 시켜주어야 한다.
		//System.out.println(a); 
		
		
		m1();
		//name cannot be resolved to a variable
		//System.out.println(name); 이 경우에 홍길동으로 접근불가능하다. 메서드 각자가 독립되어 있고 포함관계가 아니다. / m1의 변수 a는 이미 소멸했다.
		
		m2();
		m2(); // 두번째 찍히는 20는 앞의 20과는 완전히 다른 20이다.
	}
		
		public static void m1() { //{}: Scope, Block 이라고도 부름 
			
			//지역 변수
			int a = 10;
			System.out.println(a);
			String name = "홍길동";
			
			//int a = 20;
		}
	
		
		public static void m2() {
		
			int a = 20;
			System.out.println(a);
			// 변수는 메서드가 다르다면 같은 이름을 사용해도 지역변수이기 때문에 괜찮다.
		}
}
