package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ex57_HashMap {

	public static void main(String[] args) {
		
		/*
		 * 1. List > ArrayList
		 * 2. Map > HashMap
		 * 3. Set > HashSet
		 * 
		 * List 계열
		 * - 요소 관리 > 첨자(index) > 방번호
		 * - 순서가 있는 집합(방번호 == 요소의 순서)
		 * ex) 1강의실, 2강의실, 3강의실
		 * - 스칼라 배열(Scalar Array)
		 * - 요소(Element) = 첨자(index) + 값(value)
		 * - 첨자(index)는 유일하다.
		 * - 값(value)은 중복이 가능하다.
		 * 
		 * Map 계열
		 * - 요소관리 > 키(key) 사용 > 방이름
		 * - 순서가 없는 집합(순서가 중요하지 않은 경우)
		 * ex) 햇님반, 달님반, 별님반
		 * - 연관 배열, 사전 구조(Dictionary)
		 * - 요소(Element) = 키(key) + 값(value)
		 * - 키(key)는 유일하다.
		 * - 값(value)은 중복이 가능하다.
		 */
		
		//m1();
		//m2();
		m3();
		
		
	}//main

	private static void m3() {

		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("red", "장미");
		map.put("yellow", "개나리");
		map.put("blue", "라일락");
		map.put("white", "백합");
		map.put("blue2", "라일락");
		
		//Map > 루프에 적합하진 않지만, 써야되는 상황이 온다면...
		//Can only iterate over an array or an instance of java.lang.Iterable
		//for (Object o : map) {}
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
		Collection<String> values = map.values();
		System.out.println(values);
		
	}

	private static void m2() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		//1. 요소 추가
		map.put("red", "장미");
		map.put("yellow", "개나리");
		map.put("blue", "라일락");
		
		//2. 요소 개수
		System.out.println(map.size());
		
		//3. 요소 읽기 > 루프 불가능
		System.out.println(map.get("yellow"));

		//4. 요소 수정
		map.put("yellow", "영춘화"); //key는 유일하다. //요소 추가와 수정이 겉으로는 구분되지 않는다.
		System.out.println(map); //dump //toString이 오버라이딩 되어있음 //순서는 자바 내부의 알고리즘에 따른 것이다.
		
		//5. 요소 삭제
		map.remove("yellow");
		System.out.println(map);
		
		//6. 요소 검색
		System.out.println(map.containsKey("red"));
		System.out.println(map.containsValue("장미"));
		
		map.clear();
		System.out.println(map.isEmpty());
		
		
	}

	private static void m1() {

		//학생 1명 > 국어, 영어, 수학 점수 저장 + 관리
		//데이터의 집합을 다루어야한다.
		//1. 배열
		//2. ArrayList
		//3. HashMap
		//4. Class
		
		//1. 배열
		//- 집합
		//- 방번호만으로 무슨 과목인지 알 수 없음.
		//- 루프 가능(일괄 처리에 좋음)
		int[] s1 = new int[3];
		
		s1[0] = 100;
		s1[1] = 90;
		s1[2] = 80;
		
		System.out.println(s1[0] + s1[1] + s1[2]);
		
		
		//2. ArrayList
		//- 집합
		//- 길이 가변적
		//- 방번호만으로 무슨 과목인지 알 수 없음.
		//- 루프 가능(일괄 처리에 좋음)
		ArrayList<Integer> s2 = new ArrayList<Integer>();
		s2.add(100);
		s2.add(90);
		s2.add(80);
		
		System.out.println(s2.get(0) + s2.get(1) + s2.get(2));
		
		
		//3. Class
		//- 집합
		//- 방번호(X) > 방이름(O) > 가독성 높음
		//- 초기 비용 발생 > 클래스 설계
		Student s3 = new Student();
		
		s3.setKor(100);
		s3.setEng(90);
		s3.setMath(80);
		
		System.out.println(s3.getKor() + s3.getEng() + s3.getMath());
		
		
		//4. HashMap
		//- 집합
		//- 방번호(X) > 방이름(O) > 가독성 높음
		//- 초기 비용 무료 > 설계도 없음(가변적) > (클래스의 하위버전 느낌) > 클래스는 휴먼에러가 거의 없는 반면 해쉬맵은 휴먼에러 가능성이 높다.
		HashMap<String, Integer> s4 = new HashMap<String, Integer>();
		
		s4.put("kor", 100);
		s4.put("eng", 90);
		s4.put("math", 80);
		
		System.out.println(s4.get("kor") + s4.get("eng") + s4.get("math"));
	}
	
}

class Student {
	
	private int kor;
	private int eng;
	private int math;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}













