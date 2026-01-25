package com.test.java.obj;

public class Ex36_Class {
	
	public static void main(String[] args) {
		
		Parent f1 = new Parent();
		f1.setName("홍길동");
		f1.setAge(45);
		
		Parent m1 = new Parent();
		m1.setName("김영희");
		m1.setAge(43);
		
		Child c1 = new Child();
		c1.setName("홍철수");
		c1.setAge(18);
		
		c1.setFather(f1);
		c1.setMother(m1);
		
		System.out.println("자식: " + c1.getName());
		
		//********** 결과는 맞지만 본인에게 물어보는게 아니라 자식에게 물어보는 상황에선 잘못된 접근이다.
		System.out.println("아빠: " + f1.getName());
		System.out.println("엄마: " + m1.getName());
		
		System.out.println("아빠: " + c1.getFather().getName());
		System.out.println("엄마: " + c1.getMother().getName());
		
	}

}

//부모
class Parent{
	
	private String name;
	private int age;
	
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
	
}

//자식
class Child{
	
	private String name;
	private int age;
	
	private Parent father;
	private Parent mother;
	
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
	public Parent getFather() {
		return father;
	}
	public void setFather(Parent father) {
		this.father = father;
	}
	public Parent getMother() {
		return mother;
	}
	public void setMother(Parent mother) {
		this.mother = mother;
	}
	
}
