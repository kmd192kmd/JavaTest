package com.test.java.obj.inheritance;

public class Ex53_Generic {
	
	public static void main(String[] args) {
		
		m1();
		m2();
		m3();
		
	}

	private static void m3() {
		
		//Item is a raw type. References to generic type Item<T> should be parameterized
		//Item item1 = new Item();
		
		//Object
		//item1.c= 10;
		
		
		Item<String> item2 = new Item<String>();
		item2.c = "문자열";
		
		Item<Integer> item3 = new Item<Integer>(); //마치 오브젝트처럼 같은 변수에 다른 자료형을 넣게 해주고 있다.
		item3.c = 100;
		
		Pen<String> p1 = new Pen<String>();
		p1.a = "문자열";
		p1.b = "문자열";
		p1.c = "문자열";
		
		Pen<Boolean> p2 = new Pen<Boolean>();
		p2.a = true;
		p2.b = false;
		p2.c = true;
		
		Desk<String> d1 = new Desk<String>(); //오른쪽 제네릭은 생략가능하지만 권장하지 않는다.
		d1.setData("문자열");
		System.out.println(d1.getData());
		
		Laptop<String,Integer> l1 = new Laptop<String,Integer>("문자열",10);
		System.out.println(l1.getA());
		System.out.println(l1.getB());
		
	}

	private static void m2() {
		
		//참조형 데이터
		Object o1 = new Object();
		Object o2 = new LG100();
		
		//값형 데이터
		int n1  = 10;
		
		//박싱(Boxing) 발생
		Object o3 = 10; //Integer.valueOf(10) = new Integer(10)으로 바꿈.
		Object o4 = true; //Boolean.valueOf(true)
		
		System.out.println(n1 *2);
		System.out.println((Integer)o3 * 3);
		System.out.println((int)o3 * 3); //언박싱(Unboxing) //박싱,언박싱은 상대적으로 비용이 큰 편이므로 남발은 하지 말자.
		
		
	}

	private static void m1() {
		
		int a = 10;
		Integer b = new Integer(20); //deprecated
		Integer c = Integer.valueOf(30);
		Integer d = 40; //Integer.valueOf(40);으로 컴파일러가 바꿔준다.
		
		System.out.println(a * 2);
		System.out.println(b * 2);
		System.out.println(c * 2);
		System.out.println(d * 2); //참조형은 산술연산의 피연산자가 될 수 없지만, 값형(8가지)의 참조형은 예외이다.
		
		
	}

}

//제네릭 클래스
//- <>: 인자리스트, 메서드의 test(int a)
//- T: 매개변수 > 타입변수 > 변수에 값을 저장(X), 자료형을 저장(O) > 참조형
//	- T = String
//  - T = LG100
//	- T = HP200
//	- T = int //에러
//	- T = boolean //에러
//	- T = Integer
//	- T = Boolean
class Item<T>{
	
	 public int a;
	 public String b;
	 public T c;
	 
	 public void ccc() {
		 
	 }
	
}

class Pen<T> {
	
	public T a;
	public T b;
	public T c;
	
}

class Desk<T>{
	
	private T data;

	public T getData() {
		
		//지역 변수 적용 > 절대 금지!! //개발하기 매우 힘들어지기 때문에.
		//T a;
		
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

class Laptop<T,U> { //타입 변수는 여러개를 넣을 수 있다. 많이 넣을수록 난이도 상승.
	
	private T a;
	private U b;
	
	public Laptop(T a, U b) {
		this.a = a;
		this.b = b;
	}
	
	public T getA() {
		return a;
	}
	
	
	public U getB() {
		return b;
	}
}




























