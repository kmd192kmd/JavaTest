package com.test.java.obj;

public class Ex31_Class {

	public static void main(String[] args) {
		
		/*
		 * 클래스 선언할 때 권장 사항
		 * - 클래스 1개당 파일을 1개를 만든다. -> 파일명이 클래스명과 일치해야 클래스를 찾기 수월하니까..
		 * 
		 * 클래스 선언할 때 필수 사항
		 * - 파일의 이름과 클래스의 이름은 반드시 동일해야 한다. > 다르면 컴파일 에러 발생
		 * 
		 * - 하나의 파일에 2개 이상의 클래스를 선언하는 경우
		 * 	  - 파일 내에 모든 클래스들 중 public 키워드를 가지는 클래스는 유일하다.
		 *    - public 클래스 > 파일의 대표 클래스 > 대표 클래스의 이름이 파일명이 된다.
		 */
		
		User hong = new User();
		hong.name = "홍길동";
		hong.id = "hong";
		
		Member test = new Member();
		
		test.id = "test";
		test.name = "테스트";
	    test.email = "test@email.com";
		
	}//main
	
}

class User{
	public String name;
	public String id;
}

