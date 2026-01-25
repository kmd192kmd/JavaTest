package com.test.java.obj.inheritance.cast;

public class Ex47_Casting {

	public static void main(String[] args) {
		
		/*
		 * 형변환, Type Casting
		 * - *** 값형과 참조형간에는 형변환 절대(*****) 불가능 -> Integer.parseInt()는 형변환처럼 보이지만 내부적으로는 다른 방식이다.
		 * 
		 * 1. 값형(끼리) 형변환
		 *     - 숫자끼리(boolean제외)
		 *     - byte, short, int, long, float, double, char
		 *     - (): 형변환 연산자 사용
		 *     - 문제 발생 > 작은형에서 큰형으로 형변환 > 오버플로우(Overflow) 발생 가능
		 * 
		 * 2. 참조형(끼리) 형변환
		 *     - 클래스끼리 형변환
		 *     
		 * 참조형 형변환
		 * - 상속 관계에 있는 클래스끼리만 가능(***)
		 * - 직계만 가능
		 * - 방계는 불가능
		 * 
		 * 1. 업캐스팅, Up Casting
		 *     - 암시적인 형변환(작은형에서 큰형으로 가면 문제 발생 X)
		 *     - 자식 클래스 > (형변환) > 부모 클래스 //세대 수와 상관없이 가능한 행동임. ex)자식이 부모 상관없이 조부모와 캐스팅 가능
		 * 
		 * 2. 다운캐스팅, Down Casting
		 *     - 명시적인 형변환(값형 형변환시 문제 발생 가능해서 명시적으로 붙여줬었음)
		 *     - 부모 클래스 > (형변환) > 자식 클래스 //세대 수와 상관없이 가능한 행동임. ex)조부모가 부모 상관없이 손자와 캐스팅 가능
		 */
		
		
		short s1 = 10; //원본
		int n1;
		
		n1 = s1;
		
		//형변환이 성공했는지? > 복사본 출력
		System.out.println(n1);
		
		
		Parent p1;
		Child c1;
		
		c1 = new Child(); //원본 역할
		
		//참조형 변수끼리의 복사 = 주소값 복사
		
		//Parent = Child
		//부모 = 자식
		//업캐스팅 > 100%안전, 암시적
		p1 = c1;
		//p1 = (Parent)c1;
		
		//p1 문제 없는지 검증? > p1을 가지고 할 수 있는 모든 행동(***) > 문제 발생?
		p1.a = 10;
		p1.b = 20;
		//p1.c = 30; //Parent 객체로써는 c와 d는 볼 수 없음.
		
		System.out.println(p1.a);
		System.out.println(p1.b);
		System.out.println(c1.a); //주소값을 복사했기 때문에 10이 나온다.
		System.out.println(c1.b); //주소값을 복사했기 때문에 20이 나온다.
		
		
		Parent p2;
		Child c2;
		
		p2 = new Parent(); //원본
		
		//자식 = 부모
		//다운캐스팅 > 불안전 > 명시적으로 표시해야함.
		//*** 100% 불가능
		//c2 = (Child)p2;
		
		//검증
		//c2.a = 10;
		//c2.b = 20;
		//c2.c = 30;
		//c2.d = 40;
		
		//c와 d를 사용할 수 없어야 정상인 상황이다. 개발자 시점에서 이 껍데기를 사용해도 되는지 안되는지 구분하기 너무 어렵기 때문에 c2 = (Child)p2;에서 런타임에러가 발생한다.
		
		
		//다운 캐스팅
		Parent p3;
		Child c3;
		
		c3 = new Child();
		
		p3 = c3;
		
		Child c4;
		
		//다운 캐스팅
		c4 = (Child)p3; //원래 child객체를 껍데기를 parent로 바꿨던 것을 다시 child로 바꾼것이다. 겉보기에는 다운 캐스팅이다.
		
		c4.a = 10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;
		
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);
		
		
		A aa1;
		C cc1;
		
		cc1 = new C(); //원본(손자)
		
		aa1 = cc1;
		
		aa1.a = 10;
		
		
		B bb1;
		D dd1;
		
		dd1 = new D();
		
		//bb1 = (B)dd1; //방계는 아예 불가능
		
		//bb1.a = 10;
		//bb1.b = 20; // a,d가 들어있는 dd1의 주소값을 복사했는데 우리가 보는 껍데기는 a,b이다. 
		
		
	}//main
	
}

class Parent{
	public int a;
	public int b;
}

class Child extends Parent{
	public int c;
	public int d;
}

class A{
	public int a;
}

class B extends A {
	public int b;
}

class D extends A {
	public int d;
}

class C extends B {
	public int c;
}