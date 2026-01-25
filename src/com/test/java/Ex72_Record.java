package com.test.java;

import java.util.ArrayList;
import java.util.List;

public class Ex72_Record {

	public static void main(String[] args) {
		
		/*
		 * Record 자료형
		 * - 데이터를 저장하기 위한 목적으로 만든 특별한 클래스
		 * - 불변(Immutable) 객체를 생성하는 것이 목적
		 * - 생성자, Getter, equals(), hashCode, toString을 컴파일러가 자동 생성
		 */
		
		//m1();
		m2();
		
	}

	private static void m2() {
		
		//성적 관리 + Record
		//1. 학생 Recored 설계
		//2. 집합 > List
		//3. 성적순으로 정렬 + 출력 > 스트림
		
		List<StudentRecord> list = new ArrayList<StudentRecord>();
		
		list.add(new StudentRecord("홍길동", 100, 90, 80));
		list.add(new StudentRecord("아무개", 70, 80, 55));
		list.add(new StudentRecord("강아지", 90, 80, 40));
		list.add(new StudentRecord("고양이", 80, 70, 100));
		list.add(new StudentRecord("병아리", 30, 50, 20));
		
		System.out.println(list);
		System.out.println();
		
		list.sort((a, b) -> b.getTotal() - a.getTotal());
		System.out.println(list);
		System.out.println();
		
	}

	private static void m1() {

		//유저 정보 > 클래스
		UserClass u1 = new UserClass("hong", "홍길동", 20);
		System.out.println(u1);
		
		UserRecord u2 = new UserRecord("hong", "홍길동", 20); //생성자
		System.out.println(u2); //toString
		
		System.out.println(u2.name()); //Getter
		System.out.println(u2.id());
		System.out.println(u2.age());
		
		UserRecord u3 = new UserRecord("hong", "홍길동", 20);
		
		System.out.println(u2.hashCode()); //오버라이딩되어 있음(같은 값이면 같은 객체로 취급하겠다는 의도)
		System.out.println(u3.hashCode());
		
		System.out.println(u2.equals(u3)); //동일인
		
	}
	
}

//*** 읽기 전용
//1. 생성자 > 초기화
//2. Getter 구현O, Setter 구현X
class UserClass{
	
	private final String id;
	private final String name;
	private final int age;
	
	public UserClass(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "UserClass [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}

//*** 읽기 전용 객체
//Record 사용 > 컴파일러가 대신 구현
//- private final 멤버 구현O
//- 생성자 구현O
//- Getter 구현O
//- toString 구현O
//- 상속 등 클래스가 가능한 것들 불가능...
record UserRecord(String id, String name, int age){}


//학생 레코드
record StudentRecord(String name, int kor, int eng, int math) {
	
	//생성자 유효성 검사?
	//컴팩트 생성자(Compact Constructor)
	public StudentRecord{
		
		if(name == null) {
			name = "익명";
		}
		
		if(kor < 0 || kor > 100) {
			kor = 0;
		} else if(eng < 0 || eng > 100) {
			eng = 0;
		} else if(math < 0 || math > 100) {
			math = 0;
		}
		
	}
	
	//일반 메서드
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
};











