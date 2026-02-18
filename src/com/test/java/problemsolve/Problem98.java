package com.test.java.problemsolve;

public class Problem98 {

	public static void main(String[] args) {
		
		//학생 1
		Student s1 = new Student(); //기본 생성자 호출
		System.out.println(s1.info());

		//학생 2
		Student s2= new Student("홍길동", 13); //오버로딩 생성자 호출
		System.out.println(s2.info());

		//학생 3
		Student s3= new Student(3, 10, 30); //오버로딩 생성자 호출
		System.out.println(s3.info());

		//학생 4
		Student s4= new Student("아무개", 12, 1, 5, 11); //오버로딩 생성자 호출
		System.out.println(s4.info());
		
	}
	
}

class Student{
	
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	public Student() {
		this(null, 0, 0, 0, 0);
	}

	public Student(String name, int age, int grade, int classNumber, int number) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}

	public Student(String name, int age) {
		this(name, age, 0, 0, 0);
	}

	public Student(int grade, int classNumber, int number) {
		this(null, 0, grade, classNumber, number);
	}

	public String info() {
		
		String infoName = (name == null) ? "미정" : name;
		
		String infoAge = (age == 0) ? "미정" : age + "세";
		
		String infoGrade = (grade == 0) ? "미정" : String.valueOf(grade);
		
		String infoClassNumber = (classNumber == 0) ? "미정" : String.valueOf(classNumber);
		
		String infoNumber = (number == 0) ? "미정" : String.valueOf(number);
		
		return String.format("%s(나이:%s, 학년:%s, 반:%s,번호:%s)", infoName, infoAge , 
				infoGrade, infoClassNumber, infoNumber);
	}
	
	
	
}



