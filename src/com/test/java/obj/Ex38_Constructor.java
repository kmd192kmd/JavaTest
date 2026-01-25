package com.test.java.obj;

public class Ex38_Constructor {
	
	public static void main(String[] args) {
		
		/*
		 * 생성자, Constructor
		 * - (특수한 목적을 가지는) 메서드
		 * - 객체의 멤버를 초기화하는 전용 메서드
		 * 
		 * 생성자 특징
		 * 1. 반환값 없음 > 기재 안함
		 * 2. 생성자명 = 클래스명
		 * 3. 접근지정자 거의 다 public
		 * 4. 객체의 생애 > 처음 딱 1회만 호출
		 */
		
		//m1();
		//m2();
		m3();
		
	}

	private static void m3() {
		
		//박스 대량 생산
		//1. 대형 x 50개
		//2. 소형 x 50개
		
		Box b1 = new Box();		
		Box b2 = new Box("대형", 5000);
		
		//Box s1 = new Box();
		//s1.setSize("소형");
		//s1.setPrice(500);
		
		Box s2 = new Box("소형", 500);
		s2.setPrice(600); //수정
		
		//*** 역할
		//1. 생성자 > 객체의 초기화
		//2. Setter > 객체의 초기화(잘사용안함) or 객체의 수정
		
	}

	private static void m2() {
		
		//박스 대량 생산
		//1. 대형 x 100개 > 많은 값을 가지는 쪽으로 기본 생성자를 수정..
		//2. 소형 x 5개
		Box b1 = new Box();
		//b1.setSize("대형");
		//b1.setPrice(5000);
		
		Box b2 = new Box();
		//b2.setSize("대형");
		//b2.setPrice(5000);
		
		Box b3 = new Box();
		//b3.setSize("대형");
		//b3.setPrice(5000);
		
		System.out.println(b3.info());
		
		Box b100 = new Box();
		
		//---------------------
		
		Box s1 = new Box(); // 대형 > (수정) > 수형
		s1.setSize("소형");
		s1.setPrice(500);
		
		System.out.println(s1.info());
		
	}

	private static void m1() {
		
		//1. new 실행
		//	- 객체 생성 연산자 / heap에 객체(object)를 생성, 그 안의 값은 없음(null)
		//2. Box() 실행 > 메서드를 호출하는 구문
		//	- 생성자 / 객체에 초깃값을 설정
		Box b1 = new Box();
		
		System.out.println(b1.info());
		
		b1.setSize("소형");
		b1.setPrice(500);
		
		System.out.println(b1.info());
	}

}

class Box{
	
	private String size;
	private int price;
	
	//기본 생성자, Default Constructor
	//- 개발자가 구현을 안해도.. 컴파일러가 자동으로 만든다.
//	public Box() {
//		
//		//멤버 변수를 초기화(=생성자의 역할)
//		//- 자동으로 초기화되는 초깃값
//		this.size = null;
//		this.price = 0;
//	}
	
	//기본 생성자
	public Box() {
		
			this.size = "대형";
			this.price = 5000;
		}
	
	//메서드 오버로딩
	public Box(String size, int price) {
		
		this.size = "size";
		this.price = price;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//덤프(dump)
	//- Arrays.toString(배열)
	//- Box.info()
	
	public String info() {
		return String.format("%s(%,d)", size, price);
	}
	
}
