package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex58_HashSet {

	public static void main(String[] args) {
		
		/*
		 * 1. List
		 * - 순서가 있는 집합
		 * - 첨자(방번호) + 유일
		 * - 값 중복을 허용
		 * 
		 * 2. Map
		 * - 순서가 없는 집합
		 * - 키(방이름) + 유일
		 * - 값 중복을 허용
		 * 
		 * 3. Set
		 * - 순서가 없는 집합
		 * - 방을 구분하는 식별자가 없다.(번호X, 이름X) > 방을 구분할 수 없다.
		 * - 값 중복을 허용 안함(****)
		 * 
		 * 
		 * ※ 모든 컬렉션은 내부적으로는 배열을 가지고 있다. 가공해서 각자 맡는 역할로 쓰는 것이다.
		 */
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}

	private static void m4() {
		
		//User 배열
		HashSet<User> group = new HashSet<User>();
		
		group.add(new User("홍길동", 20));
		group.add(new User("아무개", 22));
		group.add(new User("테스트", 25));
		group.add(new User("홍길동", 20)); //다른 객체로 인식한다 -> 아래 해쉬코드 메서드를 오버라이딩하면 결과가 달라진다.
		
		System.out.println(group); //println은 인자로 들어온 객체가 null이 아니면 자동으로 .toString()을 호출하도록 만들어져 있습니다.
		
	}

	private static void m3() {
		
		int a1 = 10;
		int a2 = 20;
		int a3 = 10;
		
		System.out.println(a1 == a2);
		System.out.println(a1 == a3);
		
		User u1 = new User("홍길동", 20);
		User u2 = new User("아무개", 22);
		User u3 = new User("홍길동", 20);
		User u4 = u1;
		
		//u1과 u3  > 동일인? 동명이인?
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u3)); //false > true
		System.out.println(u1.equals(u4));
		
		//사전 확인
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u3.hashCode());
		System.out.println(u4.hashCode());
		
		
	}

	private static void m2() {
	
		//로또 번호 > 난수 + 유일한 번호
		
		Random rnd = new Random();
		
		//Case 1. ArrayList
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
//		for (int i=0; i<6; i++) {
//			
//			int n = rnd.nextInt(45) + 1; //1~45
//			
//			if (lotto.contains(n)) {
//				//중복됨
//				i--;
//			} else {
//				//중복안됨
//				lotto.add(n);
//			}
//			
//		}
		
		while(lotto.size() < 6){
			
			int n = rnd.nextInt(45) + 1;
			
			if(!lotto.contains(n)) {
				lotto.add(n);
			}
			
		}
		
		System.out.println(lotto);
		
		
		//Case 2. HashSet
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
		while(lotto2.size() < 6) {
			
			int n = rnd.nextInt(45) + 1;
			lotto2.add(n); //중복값 허용 X
			
		}
		
		System.out.println(lotto2);
		
		
	}

	private static void m1() {
		
		HashSet<String> set = new HashSet<String>();
		
		//1. 요소 추가
		set.add("사과");
	    System.out.println(set.add("딸기")); //반환값이 있음.(add가 T boolean을 가지고 있는 이유가 set 때문이었다.)
	    System.out.println(set.add("딸기")); //행동을 취소함.
	    set.add("바나나");
	    
	    System.out.println(set.toString()); //dump는 개발자가 보기위한 보조도구이지 읽기도구가 아니다.
		
	    
	    //2. 요소 개수
	    System.out.println(set.size());
	    
	    
	    //3. 요소 읽기
	    //- 방 식별 불가능 > 원하는 방만 접근 불가능
	    //- 전용 읽기 도구 제공(******) > Iterator
	    
	    //Iterable 인터페이스의 구현체
	    //1. 향상된 for문 사용 가능
	    //2. Iterator의 대상 가능
	    
	    for (String item : set) { //내부에 Iterator가 구현되어 있다. 컴파일러가 아래 Iterator를 이용한 코드로 바꿔준다.
	    	System.out.println(item);
	    }
	    
	    
	    //전진 커서(cursor)
	    Iterator<String> iter = set.iterator();
	    
	    System.out.println(iter.hasNext());
	    System.out.println(iter.next()); //한칸 전진 + 데이터 읽기
	    
	    System.out.println(iter.hasNext());
	    System.out.println(iter.next());
	    
	    System.out.println(iter.hasNext());
	    System.out.println(iter.next());
	    
	    System.out.println(iter.hasNext()); //false
	    //System.out.println(iter.next()); //NoSuchElementException
	    
	    //처음부터 다시 읽고 싶다..
	    System.out.println(set);
	    
	    iter = set.iterator(); //다시 만들기(유일한 초기화 방법)
	    
	    while(iter.hasNext()) {
	    	System.out.println(iter.next());
	    }
	    
	}
	
}

class User {
	
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%d)", this.name, this.age);
	}
	
	//값이 동일한 객체를 진짜 같은 객체로 취급하게 하려면..
	//1. hashCode() 재정의
	//2. equals() 재정의
	
	@Override
	public int hashCode() {
		
		//이름과 나이가 동일하면 > 같은 해시코드를 반환
		//- "홍길동20"
		//- "아무개22"
		
		return (this.name + this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//u1.equals(u2)
		
		//return super.equals(obj); > 메모리 주소값 비교
		
		//User u2 = (User)obj;
		//return this.name.equals(u2.getName()) && this.age == u2.getAge();
		
		return this.hashCode() == obj.hashCode();
		
	}
	
}









