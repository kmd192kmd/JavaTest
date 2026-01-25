package com.test.java;

public class Ex18_Method {
	
	public static void main(String[] args) {
		
		//Ex18_Method.java
		
		//Type mismatch: cannot convert from int to String
		//String result = m1();
		
		//m2();
		
	}
	
	public static int m2() {
		
		System.out.println("1");
		System.out.println("2");
		
		return 10; //반환값 + 메서드 중지
		
		//Unreachable code
		//System.out.println("3");
		
		//return 10;		
	}
	
	public static int m1() {
		
		return 10;
	}

}









