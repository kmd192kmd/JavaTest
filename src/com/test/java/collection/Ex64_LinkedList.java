package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex64_LinkedList {
	
	public static void main(String[] args) {
		
		/*
		 * List 인터페이스
		 * - ArrayList > 읽기시 엑세스 가장 빠름, 수정시 시프트 발생.
		 * - LinkedList > 수정해도 시프트 발생안해서 수정에 적합.
		 * - 사용법은 동일하지만, 내부 구조가 다르다 > 사용 목적이 다르다.
		 * 
		 * LinkedList 종류
		 * 1. LinkedList(뒤의 주소값만 보유)
		 * 2. DoubleLinkedList(앞과 뒤의 주소값 보유)
		 * 3. Double Circular LinkedList(2번에 추가로 맨앞과 맨뒤가 주소값이 연결되어 있음) > 순환 구조 > 현재의 LinkedList
		 * 
		 * 
		 * 순서가 있는 집합 필요하다
		 * 1. ArrayList 선택(업무마다 다르지만 대부분 이걸로 끝나긴함)
		 * 2. 중간 추가/삭제 잦음 > LinkedList로 교체
		 */
		
		//m1();
		m2();
		//m3();
	}

	private static void m3() {

		ArrayList<String> names = new ArrayList<String>();
		
		names.add("빨강");
		names.add("주황");
		names.add("노랑");
		names.add("초록");
		names.add("파랑");
		
		//List 계열의 루프 + 요소추가/삭제 > *** 방번호가 변경 주의!!!(시프트)
		for(int i=names.size()-1; i>=0; i--) {
			//System.out.println(names.get(i));
			names.remove(i);
		}
		
		System.out.println(names);
		
	}

	private static void m2() {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		//스톱워치
		long begin = 0, end = 0;
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		
		//1. 순차적으로 데이터 추가하기, Append
		System.out.println("[1. 순차적으로 데이터 추가하기, Append]");
		
		begin = System.currentTimeMillis();
		
		for(int i=0; i<1000000; i++) {
			list1.add(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		
		begin = System.currentTimeMillis();
		
		for(int i=0; i<1000000; i++) {
			list2.add(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		
		
		//2. 중간에 데이터 추가하기(새치기), Insert
		//- 시프트 발생
		System.out.println("[2. 중간에 데이터 추가하기(새치기), Insert]");
		
		begin = System.currentTimeMillis();
		
		for(int i=0; i<100000; i++) {
			list1.add(0, i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		
		begin = System.currentTimeMillis();
		
		for(int i=0; i<100000; i++) {
			list2.add(0, i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		
		
		//3. 중간에 데이터 삭제하기, Delete
		//- 시프트 발생
		System.out.println("[3. 중간에 데이터 삭제하기, Delete]");
		
		begin = System.currentTimeMillis();
		
		for(int i=0; i<100000; i++) {
			list1.remove(0);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		
		begin = System.currentTimeMillis();
		
		for(int i=0; i<100000; i++) {
			list2.remove(0);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		
		
		//4. 순차적으로 데이터 삭제하기, Delete
		System.out.println("[4. 순차적으로 데이터 삭제하기, Delete]");
		
		begin = System.currentTimeMillis();
		
		for(int i=list1.size()-1; i>=0; i--) {
			list1.remove(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		
		begin = System.currentTimeMillis();
		
		for(int i=list2.size()-1; i>=0; i--) {
			list2.remove(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		
	}

	private static void m1() {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		list2.add(100);
		list2.add(200);
		list2.add(300);
		
		System.out.println(list1.size());
		System.out.println(list2.size());
		
		System.out.println(list1.get(0));
		System.out.println(list2.get(0));
		
		System.out.println(list1.indexOf(200));
		System.out.println(list2.indexOf(200));
		
		for(int n : list1) {
			System.out.println(n);
		}
		
		for(int n : list2) {
			System.out.println(n);
		}
		
	}
}
