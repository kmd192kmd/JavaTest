package com.test.java.collection;

import java.io.FileOutputStream;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

public class Ex67_Collection {
	
	public static void main(String[] args) {
		
		/*
		 * 스레드 안전(safe) + 동기화 지원 > Vector, HashTable
		 * - Vector > ArrayList
		 * - HashTable > HashMap
		 * - Properties
		 * 
		 * 
		 * List > 방번호 + 순서
		 * - ArrayList > 보편적
		 * - LinkedList > 잦은 조작
		 * 
		 * Set > 유일값
		 * - HashSet > 보편적
		 * - TreeSet > 자동 정렬
		 * 
		 * Map > 방이름
		 * - HashMap > 보편적
		 * - TreeMap > 자동 정렬
		 */
	
		//m1();
		m2();
		
	}

	private static void m2() {
		
		//Properties
		//- 어떤 옵션들이나 상태값을 저장하는 용도
		//- Map과 유사
		
		Properties prop = new Properties();
		
		prop.put("color", "red");
		prop.put("font-size", "18px");
		prop.put("font-family", "JetbrainsMono");
		
		System.out.println(prop.get("font-family"));
		
		try {
			
			//XML, JSON으로 대체됨
			prop.store(new FileOutputStream(".\\setting.ini"), "환경설정");
			
		} catch (Exception e) {
			System.out.println("Ex67_Collection.m2() 예외 발생");
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		
		Vector<String> list = new Vector<String>();
		
		list.add("하나");
		list.add("둘");
		list.add("셋");

		System.out.println(list.size());
		
		System.out.println(list.get(0));
		
		
		Hashtable<String, Integer> map = new Hashtable<String, Integer>();
		
		map.put("kor", 100);
		map.put("eng", 90);
		map.put("math", 80);
		
		System.out.println(map.get("kor"));
		
		//요약
		//- Vector, Hashtable은 동기화 지원이 되어, 멀티스레드 환경에서 안전하다. 하지만 느리다.
		//- ArrayList, HashMap은 동기화 지원이 안되어, 멀티스레드 환경에서 직접 동기화 처리가 필요하다. 상대적으로 속도가 빠르다.
		
	}

}
