package com.test.java;

public class Ex26_While {

	public static void main(String[] args) {
		
		/*
		 * while문 > for문 수업때 했던것 while문으로 만들어보자!
		 * 
		 * while (조건식) {
		 * 	    코드;
		 * }
		 * 
		 * do while문
		 * - 최초 1회는 무조건 실행 > 조건부 반복 싱행
		 * 
		 * do {
		 * 	    코드;
		 * } while (조건식);
		 * 
		 */
		
		m1();
		//m2();
		
	}

	private static void m2() {
		
		int num = 11;
		
		do {
			System.out.println(num);
			num++;
		} while (num<=10);
		
		
	}

	private static void m1() {
		
		//1~10까지 출력
		
		for(int i=1; i<=10; i++) { //for (초기식; 조건식; 증감식;)
			System.out.println(i);
		}
		System.out.println();
		
		int num = 1; //초기식(역할)
		
		while(num<=10) { //while (조건식)
			System.out.println(num);
			num++; //증감식(역할)
		}
		
	}
	
}
