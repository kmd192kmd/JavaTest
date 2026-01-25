package com.test.java.obj.staticex;

public class Ex40_Static {
	
	//1. 전처리 과정
	//	- 클래스 로딩(Loading): 모든 클래스의 정의(선언)를 메모리에 올린다. // class/static 영역에
	//		- 로딩 중 발생하는 작업
	//			- static 붙은 걸(변수/메서드) 메모리 저장
	//2. main() 호출
	
	public static void main(String[] args) {
		
		/*
		 * Static 정적 키워드
		 * - 지시자 중 하나
		 * - 클래스에 붙일 수 있다.
		 * - 클래스 멤버(변수/메서드)에 붙일 수 있다.
		 * 
		 * 객체 변수의 생명주기 > 필요할 때 만들고 필요없을 때 버릴 수 있다.
		 * 1. 생성: 객체가 생성될 때(new 실행)
		 * 2. 소멸: 객체가 소멸될 때
		 * 
		 * static 변수의 생명주기 > 1.데이터에 문제가 생길 경우 원인을 알기가 어렵다, 2.메모리가 낭비될 가능성이 높다.
		 * 1. 생성: main() 호출 전
		 * 2. 소멸: main() 종료 후
		 */
		
		//- 홍길동의 학교 > 대치 중학교(개인 데이터)
		//- 모든 학생의 학교 > 대치 중학교(공용/집합/그룹 데이터)
		
		//요구사항] 학생 3명 > 관리 프로그램
		//- "대치 중학교" > "선릉 중학교" ***
		//	- 유지 보수 불편
		//	- 메모리 효율성
		
		//집단으로서의 행동
		Student.setSchool("대치 중학교");
		
		//개인으로서의 행동
		Student s1 = new Student();
		s1.setName("홍길동"); //s1 학생의 이름 설정 > 개인 데이터 설정
		s1.setAge(15); //s1 학생의 나이설정 > 개인 데이터 설정
		//s1.setSchool("대치 중학교"); //*** 모든 학생의 학교 설정 > 공용 데이터 설정
		
		Student s2 = new Student();
		s2.setName("강아지");
		s2.setAge(14);
		//s2.setSchool("대치 중학교");
		
		Student s3 = new Student();
		s3.setName("고양이");
		s3.setAge(15);
		//s3.setSchool("대치 중학교");
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
		
		
	}//main

}

//Ctrl + F(find) //왼쪽 버튼 누르면 replace 기능도 나옴
//Quick Search
//- Ctrl + Shift + Alt + L(load)
class Student{
	
	//객체 멤버 변수 > 개인 데이터 저장 역할 + 객체 메서드 같이 사용
	private String name;
	private int age;
    
	//정적(공용) 멤버 변수 > 공용 데이터 저장 역할 + 정적 메서드 같이 사용
	//private String school;
	// class/static 영역 메모리에 저장됨..
    private static String school;
	
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	public String getSchool() {
//		return school;
//	}
//
//	public void setSchool(String school) {
//		//this.school = school;
//		Student.school = school;
//	}

	
	
	public String info() {
		return String.format("%s(%d세) - %s" 
								,this.name
								,this.age
								,Student.school);
	}

	public static String getSchool() {
		
		//Cannot use this in a static context
		//System.out.println(this.school); //new로 만들어진 객체 자신을 가르키는 것이 this이므로 this.school은 없다.
		
		return school; //Student.school 인데 생략되어있음
		
	}

	public static void setSchool(String school) {
		Student.school = school;
	}
	
}
