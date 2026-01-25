package com.test.java.obj.inheritance;

public class Ex44_Overriding {

	public static void main(String[] args) {
		
		/*
		 * 메서드 오버로딩, Method Overloading
		 * - 메서드 이름 동일 x N번 선언
		 * 
		 * 메서드 오버라이딩, Method Overriding
		 * - 클래스 상속할 때 발생
		 * - 메서드 재정의 > 상속받은 메서드를 수정하는 기술
		 */
		
		OverridingParent o1 = new OverridingParent();
		o1.name = "홍길동";
		o1.hello();
		
		//중2
		OverridingChild o2 = new OverridingChild();
		o2.name = "홍철수";
		o2.hello(); //상속 hello() vs 자신 hello() ? 자신O
		o2.hi(); //프로그램상은 문제가 없지만 개발자가 헷갈린다.
		
		
	}
	
}

class OverridingParent{
	
	public String name;
	
	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다.\n"
							, this.name);
	}
	
}

//*** 상속 거부는 절대 불가능하다.
class OverridingChild extends OverridingParent{
	
	//철수 > 부모의 메서드를 사용하기 싫다.
	public void hi() {
		System.out.printf("즐거운 아침입니다~ %s입니다.\n"
				, this.name);
	}
	
	//메서드 재정의(오버라이딩)
	//- 부모가 물려준 메서드를 감추고, 내가 재정의한 메서드를 사용하겠다.
	@Override //어노테이션(일종의 기능 주석)
	public void hello() {
		
		System.out.printf("즐거운 아침입니다~ %s입니다.\n"
							, this.name);
	}	
	
}