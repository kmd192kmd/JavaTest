package com.test.java.obj;

public class Ex33_Access {
	
	public static void main(String[] args) {
		
		/*
		 * OOO지정자(제어자)
		 * - 클래스 or 클래스 멤버 > 부가적인 기능을 제공하는 키워드
		 * 
		 * 접근 지정자(제어자), Access Modifier
		 * - 클래스에 붙일 수 있다.
		 * - 클래스 멤버 변수에 붙일 수 있다.
		 * - 클래스 멤버 메서드에 붙일 수 있다.(모든 메서드는 클래스 멤버 메서드이긴 하다.)
		 * - 지역 변수에는 사용이 불가능하다.
		 * 
		 * - *** 멤버 자신이 속한 영역 밖으로 공개를 할지 말지 정하는 키워드
		 * - 캡슐화/정보은닉화 > 객체의 안정성 or 사용법 통제
		 * 
		 * 1. public
		 * 		- 100% 공개
		 * 2. private
		 * 		- 100% 비공개
		 * ---------------------
		 * 3. protected
		 * 4. (default, package)
		 */
		
		//m1();
		//m2();
		m3();
		
	}//main

	private static void m3() {
		
		Note n1 = new Note();
		
		//n1.color;
		//n1.price;
		
		n1.setColor("파란색");
		System.out.println(n1.getColor());
		
		n1.setPrice(3000);
		System.out.println(n1.getPrice());
		
	}

	private static void m2() {
		
		Book b1 = new Book();
		
//		b1.title = "자바의 정석";
//		b1.price = 350000000;
//		
//		System.out.println(b1.title);
//		System.out.println(b1.price);
		
		b1.aaa();
		//b1.bbb();
		b1.ccc("자바의정석"); //우리는 title를 볼 수 없고 접근할 수 없지만, ccc()는 title을 볼 수 있고 접근할 수 있다.
		System.out.println(b1.ddd());
		
		b1.eee(3000000);
		System.out.println(b1.fff());
	}

	private static void m1() {
		
		Book b1 = new Book();
		//System.out.println(b1.a);
		//System.out.println(b1.b); //The field Book.b is not visible
		
	}//m1

}

class Note {
	
	//1. 우선 > 모든 멤버 변수 > private
	private String color;
	private int price;
	
	//2. 통로 > 인터페이스 역할 > public 메서드 구현
	
	//외부 > (값) > 내부
	//입력 interface
	//- Setter
	//- 이름: set멤버변수명()
	public void setColor(String color) {
		
		//멤버 변수와 지역 변수 충돌 > 에러는 안나고 지역 변수를 가르키게 됨.
		this.color = color;
	}
	
	//내부 > (값) > 외부
	//출력 interface
	//- Getter
	//- 이름: get멤버변수명()
	public String getColor() {
		return this.color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

class Book{
	
	//멤버 변수 = 필드(field)
	//public int a = 10;
	//private int b = 20;
	
//	public String title;
//	public int price;
	
	private String title = "자바";
	private int price;
	
	public void aaa() {
		System.out.println("aaa");
	}
	
	private void bbb() {
		System.out.println("bbb");
	}
	
	public void ccc(String a) {
		title = a;
	}
	
	public String ddd() {
		return title;
	}
	
	public void eee(int a) {
		
		if(a >= 0 && a <= 1000000) {
			price = a;
		} else {
			System.out.println("책 가격 오류");
		}
		
	}
	
	public int fff() {
		return price;
	}
	
}
