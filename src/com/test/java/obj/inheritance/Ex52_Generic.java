package com.test.java.obj.inheritance;

public class Ex52_Generic {
	
	public static void main(String[] args) {
		
		/*
		 * 제네릭, Generic
		 * - Object 클래스 업무 일부를 대신하기 위해서
		 * 1. 제네릭 클래스
		 * 2. 제네릭 메서드
		 * 
		 * 요구사항] 클래스 설계해 주세요.
		 * 1. 멤버 변수 1개 > int
		 * 2. 멤버 변수를 중심으로 여러가지 행동을 하는 메서드를 구현
		 * 
		 * 추가사항] String 중심으로 하는 클래스 설계
		 * 추가사항] boolean 중심으로 하는 클래스 설계
		 * 추가사항] double 중심으로 하는 클래스 설계
		 * 추가사항] byte 중심으로 하는 클래스 설계
		 * 추가사항] long 중심으로 하는 클래스 설계
		 * 추가사항] Student 중심으로 하는 클래스 설계
		 * 추가사항] 무한대...
		 */
		
		WrapperInteger n1 = new WrapperInteger(10);
		System.out.println(n1.getData());
		System.out.println(n1.getData()*2);
		System.out.println(n1.toString());
		System.out.println();
		
		WrapperObject n2 = new WrapperObject(20);
		System.out.println(n2.getData());
		//The operator * is undefined for the argument type(s) Object, int
		//System.out.println(n2.getData()*2);
		System.out.println((int)n2.getData()*2);  //명시적 형변환은 사람이 실수했을때 컴파일 단계에서 오류를 확인하기 어렵다.
		System.out.println(n2.toString());
		System.out.println();
		
		Wrapper<Integer> n3 = new Wrapper<Integer>(30); //지금 상황에는 위 두 코드의 장점을 모아놓은 느낌이다.(상황에 따라 다르다)
		System.out.println(n3.getData());
		System.out.println(n3.getData()*2);
		System.out.println(n3.toString());
		System.out.println();
		
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.getData());
		System.out.println(s1.getData().length());
		System.out.println(s1.toString());
		System.out.println();
		
		WrapperObject s2 = new WrapperObject("대한민국");
		System.out.println(n2.getData());
		System.out.println(((String)s2.getData()).length());
		System.out.println(s1.toString());
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper<String>("라구파스타");
		System.out.println(s3.getData());
		System.out.println(s3.getData().length());
		System.out.println(s3.toString());
		System.out.println();
				
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.getData());
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println(b1.toString());
		System.out.println();
		
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2.getData());
		System.out.println((boolean)b2.getData() ? "참" : "거짓");
		System.out.println(n1.toString());
		System.out.println();
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.getData());
		System.out.println(b3.getData() ? "참" : "거짓");
		System.out.println(b3.toString());
		System.out.println();
		
		
	}//main

}

class Wrapper<T>{
	
	private T data;
	
	public Wrapper(T data) {
		this.setData(data);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

class WrapperInteger {
	
	//1. 핵심 데이터
	private int data;
	
	//2. 데이터 중심 > 조작하는 메서드
	public WrapperInteger(int data) {
		//this.data = data;
		this.setData(data); //이클립스가 생성자와 setter의 겹치는 역할을 분리해주었다. ex)유효성검사
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

class WrapperString {
	
	private String data;
	
	public WrapperString(String data) {
		this.setData(data);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		return "[data=" + data + "]";
	}
	
}

class WrapperBoolean {
	
	private boolean data;
	
	public WrapperBoolean(boolean data) {
		this.setData(data);
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		return "[data=" + data + "]";
	}
	
}

class WrapperObject {
	
	private Object data;
	
	public WrapperObject(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		return "[data=" + data + "]";
	}
	
}

