package com.test.java.obj;

public class Ex39_This {
	
	public static void main(String[] args) {
		
		//c1 > 첫번째 컵 > 절대적인 표현
		Cup c1 = new Cup();
		c1.setColor("black");
		
		Cup c2 = new Cup();
		c2.setColor("white");
		
		Cup c3 = new Cup();
		c3.setColor("yellow");
		
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		System.out.println(c3.getColor());
		
	}//main

}

class Cup{
	
	private String color;
	private int size;
	
	public void setColor(String color) {
		
		//this > (자신)객체 접근 연산자
		//this의 역할 > 나(자기 자신) > 상대적인 표현
		this.color = color;
		
		//c1.color = color; //객체생성 이전에 c1을 정의할 수 없음.
		
		test();
		this.test(); //정석적인 방법
		
	}
	
	public void test() {}
	
	public String getColor(){
		
		//String color = "";
		//return color; //매개변수가 없을때는 멤버변수를 나타내지만... 매개변수가 있다면 그 매개변수를 나타내게 된다.
		
		//1. 가독성 높음
		//2. 코딩 쉬움
		return this.color;
	}
	
}
