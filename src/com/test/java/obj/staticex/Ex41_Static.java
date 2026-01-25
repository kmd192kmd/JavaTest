package com.test.java.obj.staticex;

public class Ex41_Static {
	
	public static void main(String[] args) {
		
		//요구사항]
		//1. 펜을 만드시오.
		//2. 생상된 펜의 개수를 세시오.
		
		//Case 1.
		//- 간단함.
		//- Pen 객체와 count간의 관계.. 모호..
		//- count++ 누락 위험!!(error가 발생하지 않으니까!!)
		
//		int count = 0; //누적 변수
//		
//		Pen p1 = new Pen("MonAmi 153" , "black");
//		count++;
//		
//		Pen p2 = new Pen("MonAmi 153" , "black");
//		count++;
//		
//		Pen p3 = new Pen("MonAmi 153" , "black");
//		count++;
//			
//		System.out.println(count);
		
		
		//Case 2.
		//- Pen 객체와 count 변수간의 관계 강화
		//- count(객체 변수) > 객체(펜)마다 생성 > count가 개인 데이터(X) > 공용 데이터(O) 
		
//		Pen p1 = new Pen("MonAmi 153", "black");
//		p1.count++; //대치 중학교 예제 때와 같은 문제가 발생했다.
//		
//		Pen p2 = new Pen("MonAmi 153", "black");
//		p1.count++;
//		
//		Pen p3 = new Pen("MonAmi 153", "black");
//		p1.count++;
//		
//		System.out.println("펜 개수: " + p1.count);
//		System.out.println("펜 개수: " + p2.count);
//		System.out.println("펜 개수: " + p3.count);
		
		
		//Case 3.
		//- Pen 객체와 count 변수간의 관계 강화
		//- 개인 데이터와 공용 데이터를 잘 분리시켰다.
		//- count++ 누락 위험!!
//		Pen p1 = new Pen("MonAmi 153", "black");
//		Pen.count++;
//		
//		Pen p2 = new Pen("MonAmi 153", "black");
//		Pen.count++;
//		
//		Pen p3 = new Pen("MonAmi 153", "black");
//		Pen.count++;
//		
//		System.out.println("펜 개수: " + Pen.count);
		
		
		//Case 4.
		Pen p1 = new Pen("MonAmi 153", "black");
		
		
		
		Pen p2 = new Pen("MonAmi 153", "black");
		
		Pen p3 = new Pen("MonAmi 153", "black");
		
		System.out.println("펜 개수: " + Pen.count);
		
		
	}//main

}
//Case 4.
class Pen{
	
	private String model;
	private String color;
	public static int count;
	
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		Pen.count++;
	}
	
	static {
		Pen.count = 0;
	}
	
	public String info() {
		
		return this.model + ":" + this.color;
		
	}
	
}

//Case 3.
//class Pen{
//	
//	//객체 변수
//	private String model;
//	private String color;
//	
//	//객체 생성자 > 객체 변수들을 초기화하는 역할
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//		
//		//this.count = 0; //The static field Pen.count should be accessed in a static way
//		//Pen.count = 0;
//	}
//	
//	//정적 변수
//	public static int count; //누적 변수, 공용 변수
//	
//	//정적 생성자 > 정적 변수를 초기화하는 역할
//	static {
//		Pen.count = 0;
//	}
//	
//	public String info() {
//		
//		return this.model + ":" + this.color;
//		
//	}
//	
//}

//Case 2.
//class Pen{
//	
//	private String model;
//	private String color;
//	
//	public int count; //누적 변수, 객체 변수
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//		this.count = 0;
//	}
//	
//	public String info() {
//		
//		return this.model + ":" + this.color;
//		
//	}
//	
//}

//Case 1.
//class Pen{
//	
//	private String model;
//	private String color;
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	public String info() {
//		
//		return this.model + ":" + this.color;
//		
//	}
//	
//}
