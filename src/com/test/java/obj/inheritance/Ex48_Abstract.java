package com.test.java.obj.inheritance;

public class Ex48_Abstract {

	public static void main(String[] args) {
		
		/*
		 * 추상, Abstract
		 * - 여러 가지 사물이나 개념에서 공통되는 특성이나 속성 따위를 추출하여 파악하는 작용.
		 * 
		 * 추상화
		 * - 시츄
		 * - 우리집 > 다리 짧고, 주동이 납작, 털길고, 먹성 좋음
		 * - 옆집 > 다리 짧고, 주동이 납작, 털길고, 먹성 좋음
		 * - 앞집 > 다리 짧고, 주동이 납작, 털길고, 먹성 좋음
		 * 
		 * 
		 * 여러 클래스들이 가지는 공통된 특성 > 수집,추출 > 클래스 추상화(공통적인 특성을 가지는 클래스들을 제어하기 위해서)
		 * 
		 * 추상 클래스, Abstract Class
		 * - 추상 메서드, Abstract Method
		 * - 객체를 생성할 수 없다.
		 * - 참조 변수는 생성할 수 있다.
		 * - 클래스 상속에 개입 가능 > 일반 클래스의 부모 클래스가 될 수 있다.
		 */
		
		VXE m1 = new VXE();
		
		m1.click();
		m1.click();
		m1.click();

		
		G305 m2 = new G305();
		
		m2.click();
		m2.push();
		m2.push();
		m2.push();
		
		
		//Cannot instantiate the type Mouse
		//Mouse m3 = new Mouse(); //추상 클래스는 객체를 생성할 수 없다.
		//m3.click(); //호출 > 추상메서드에 구현부가 없다 > 문제 발생 > 추상 클래스는 객체를 생성할 수 없다.
		Mouse m3;
		
		//Mouse = G305
		//부모 = 자식
		//업캐스팅, 암시적
		m3 = m2;
		
		Mouse m4 = new G305();
		Mouse m5 = new VXE();
		
		VXE m6 = new VXE();
		G305 m7 = new G305();
		
		//구현된 멤버의 역할 > 모든 마우스가 동일한 동작
		m6.color = "black";
		m6.checkColor();
		
		//추상 멤버 > 구현함 > 껍데기는 동일 + 마우스마다 다른 동작
		m6.click();
		
		m7.color = "white";
		m7.checkColor();
		m7.click();
		
		
	}
	
}

//추상 클래스
//- 일반 클래스(구현된 멤버) + 추상 멤버(메서드)
abstract class Mouse{
	
	//구현된 멤버
	//- 변수 > 실제 잡히는 공간
	//- 메서드 > 호출 + 실행 가능
//	public int a;
//	public int b;
//	
//	public void ccc() {
//		
//	}
//	
//	public void ddd() {
//		
//	}
	
	public String color; //공통된 변수
	
	public void checkColor() {
		System.out.println("마우스 색상: " + this.color);
	}
	
	//구현부가 없는 메서드 = 추상 메서드 > 객체의 행동을 표준화!!! > 고객 편의성
	public abstract void click();
	
}

//마우스 클래스
class VXE extends Mouse{
	public int price;
	//public String color;
	
	public void click() {
		System.out.println("VXE 마우스 클릭");
	}
	
	//The abstract method test in type VXE can only be defined by an abstract class
	//- 일반 클래스는 절대(***)로 추상 메서드를 가질 수 없다.
	//public abstract void test();
}

//The type G305 must implement the inherited abstract method Mouse.click() //구현을 강제한다!!
class G305 extends Mouse{
	
	public int weight;
	//public String color;
	
	public void push() {
		System.out.println("G305 마우스 클릭");
	}
	
	//추상 클래스(Mouse)의 추상 메서드(click) > 구현했다!!(메서드 오버라이딩)
	//- public abstract void click(); //이걸 물려받아야 하는데 일반클래스는 추상메서드를 가질 수 없으니 메서드 오버라이딩을 한다.
	@Override
	public void click() {
		System.out.println("G305 마우스 클릭");
	}
	
}

class M100 extends Mouse{

	@Override
	public void click() {
		
	}
	
}