package com.test.java.obj.inheritance;

public class Ex50_Java {

	public static void main(String[] args) {
		
		/*
		 * 1. 추상클래스 or 인터페이스
		 * 2. 업캐스팅/다운캐스팅
		 * 
		 * 상황] 프린터 대리점 운영
		 * 1. LG100 x 5대, HP200 x 3대
		 * 2. 날마다(***) > 제품 점검 > 출력 기능 확인
		 * 
		 * 추가상황]
		 * 1. 프린터 재고 증가
		 * - LG100 > 500대로
		 * - HP200 > 300대로
		 * 
		 * 2. 프린터 종류 증가
		 * - Dell300
		 * - BenQ400
		 * 
		 * 3. 브랜드별 고유 기능 점검
		 * - LG100 > selfTest()
		 * - HP200 > ai()
		 * - Dell300 > checkInk()
		 */
		
		//m1();
		//m2();
		m3();
		
		//Case 1.
		//- 비효율적
		//- 대당/횟수당 반복 비용이 동일
		
		LG100 lg1 = new LG100();
		LG100 lg2 = new LG100();
		LG100 lg3 = new LG100();
		LG100 lg4 = new LG100();
		LG100 lg5 = new LG100();
		
		HP200 hp1 = new HP200();
		HP200 hp2 = new HP200();
		HP200 hp3 = new HP200();
		
		//점검시간
//		lg1.print("테스트");
//		lg2.print("테스트");
//		lg3.print("테스트");
//		lg4.print("테스트");
//		lg5.print("테스트");
//		
//		hp1.print("테스트");
//		hp2.print("테스트");
//		hp3.print("테스트");
		
	}//main

	private static void m3() {
		
		//Printer <- LG100, HP200
		LG100 lg1 = new LG100();
		Printer p1;
		p1 = lg1;
		
		Printer p2 = new LG100();
		Printer p3 = new HP200();
		
		//***
		//- 배열 특성: 같은 자료형의 집합
		//        : 다른 자료형의 집합 > 참조형의 형변환을 이용
		
		//********** 업캐스팅을 사용하는 주된 예
		//- 형제뻘 객체들의 집합을 만들기 위해 사용
		Printer[] ps = new Printer[2];
		ps[0] = new LG100();
		ps[1] = new HP200();
		
		//--------------------------------------------
		
		Printer[] list = new Printer[10];
		
		for(int i=0; i<list.length; i++) {
			if(i<5) {
				list[i] = new LG100();
			} else if(i<8){
				list[i] = new HP200();
			} else {
				list[i] = new Dell300();
			}
		}
		
		//점검시간
		//1. 상속 + 추상 메서드 구현 > 제품의 종류와 상관없이 동일한 테스트 가능
		for(int i=0; i<list.length; i++) {
//			list[i].print("테스트");
			
			//다운캐스팅
			//- 부모 배열에 모든 형제를 관리하다가 > 필요에 따라 자식이 직접 구현한 멤버를 호출할 일 있을 때
//			if(i<5) {
//				((LG100)list[i]).selfTest();
//			} else if(i<8) {
//				((HP200)list[i]).ai();
//			} else {
//				((Dell300)list[i]).checkInk();
//			}
//		}
		
		//연산자
		//- 2항 연산자
		//- A(객체) instanceof B(타입)
		//System.out.println(list[i] instanceof LG100);
		//System.out.println(list[i] instanceof HP200);
		//System.out.println(list[i] instanceof Dell300);
		
		if(list[i] instanceof LG100) {
			((LG100)list[i]).selfTest();
		} else if(list[i] instanceof HP200) {
			((HP200)list[i]).ai();
		} else if(list[i] instanceof Dell300){
			((Dell300)list[i]).checkInk();
		}
	}
		
		
		
	}
	

	private static void m2() {
		
		//Case 2.
		//- 배열 사용
		LG100[] lg = new LG100[500]; //배열(박스,껍데기)을 만든거지 객체를 만든 것은 아니다.(?)
		HP200[] hp = new HP200[300];
		Dell300[] dell = new Dell300[3];
		
		//NullPointerException
		//lg[0].print("테스트");
		
		for(int i=0; i<lg.length; i++) {
			lg[i] = new LG100(); //객체 생성
		}
		
		for(int i=0; i<hp.length; i++) {
			hp[i] = new HP200();
		}
		
		for(int i=0; i<dell.length; i++) {
			dell[i] = new Dell300();
		}
		
		
		//점검시간
		for(int i=0; i<lg.length; i++) {
			lg[i].print("테스트");
			lg[i].selfTest();
		}
		
		for(int i=0; i<hp.length; i++) {
			hp[i].print("테스트");;
			hp[i].ai();
		}
		
		for(int i=0; i<dell.length; i++) {
			dell[i].print("테스트");
			dell[i].checkInk();
		}
		
	}

	private static void m1() {
		
		
		
	}
	
}

abstract class Printer { //interface도 가능
	
	private String color;
	private int price;
	
	//프린터 기기 > 출력 기능
	public abstract void print(String txt);
	
}

class LG100 extends Printer{
	//private String color;
	//private int price;
	private int width;
	private int height;
	
	//출력 기능
//	public void output(String txt) {
//		System.out.println("LG100 출력" + txt);
//	}
	
	//자가 진단
	public void selfTest() {
		System.out.println("자가 진단을 합니다.");
	}

	@Override
	public void print(String txt) {
		System.out.println("LG100 출력" + txt);
	}
	
}

class HP200 extends Printer{
	private String description;
	private String size;
	//private String color;
	//private int price;
	
	//출력 기능
//	public void printing(String msg) {
//		System.out.println("HP200 출력" + msg);
//	}
	
	//AI 기능
	public void ai() {
		System.out.println("출력 내용을 AI가 편집합니다.");
	}

	@Override
	public void print(String txt) {
		System.out.println("HP200 출력" + txt);
	}
	
}

class Dell300 extends Printer{

	private String type;
	
	@Override
	public void print(String txt) {
		System.out.println("Dell300 출력" + txt);
	}

	public void checkInk() {
		System.out.println("잉크를 점검");
	}
	
}