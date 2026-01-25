package com.test.java;

public class Ex20_Method {
	public static void main(String[] args) {
		
		/*
		 메서드 오버로딩, Method Overloading
		 	- 같은 이름의 메서드를 여러개 만드는 기술
		 
		 왜?
		 	- 사람을 위한 기술
		 	- 성능 향상(X)
		 	
		 메서드 오버로딩 구현 조건 가능
		 1. 매개변수의 개수가 다르거나
		 2. 매개변수의 자료형이 다르거나
		 
		 메서드 오버로딩 구현 조건 불가능
		 1. 매개변수의 이름(변수명)이 달라도
		 2. 반환값의 자료형이 달라도
		 
		 메서드 선언
		 1. public static void test(){} // O // void는 엄밀하게 말하면 자료형은 아니다.
		 2. public static void test(){} // X, 1번과 중복
		 3. public static void test(int n){} // O
		 4. public static void test(int m){} // X, 3번과 중복 // 선언할 때가 아니라 호출할 때 구분이 되는가를 봐야한다.
		 5. public static void test(int n, int m){} // O
		 6. public static void test(String s){} // O
		 7. public static void test(byte n){} // O // 가능은 하지만 상위타입이 있는경우는 잘 안만들긴한다. 형변환해서 넣어야 하기도 하고... 가능은 하지만 호출할때 주의해야함.
		 8. public static int test(){} // X, 1번과 중복
		 
		 메서드 호출하기(***)
		 test(); // 1번 호출
		 test(10); // 3번 호출
		 test(10, 20); // 5번 호출
		 test("문자열"); // 6번 호출
		 test(10); // 7번 호출 안되고 3번 호출
		 test((byte)10); // 7번 호출
		 int result = test(); // 8번 호출 안되고 1번 호출 -> void라서가 아니고 오버로딩 자체가 불가능하니 둘중 하나만 존재할 수 있다. // 컴파일러는 test()를 부를떄 왼쪽값을 미리 보고 하지 않는다.
		 
		*/
		
		//요구사항] 화면에 선을 그리는 메서드를 구현하시오.
		//요구사항] 선모앙(***)
		drawLine();
		System.out.println("   성적표");
		drawLine2();
		
		drawLine();
		drawLine("+");
		
		System.out.println(10);
		System.out.println("문자열");
		System.out.println(true);
		// System.out.println();가 이미 오버로딩을 쓰고 있었다!
	}//main
	
	public static void drawLine() {
		System.out.println("==========");
		
	}
	
	public static void drawLine2() {
		System.out.println("**********");
		
	}
	
	public static void drawLine(String s) {//매개변수를 이용해서 메서드 오버로딩을 하였다.
		
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.println(s); // print는 줄바꿈 없음, println은 줄바꿈
		
	}
	
	public static void m1() {
		
	}
	
	
}
