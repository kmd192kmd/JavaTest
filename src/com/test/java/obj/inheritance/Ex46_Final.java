package com.test.java.obj.inheritance;

import java.awt.GraphicsEnvironment;
import java.util.Calendar;

public class Ex46_Final {

	public static void main(String[] args) {
		
		/*
		 * final 키워드
		 * - 한번 결정하면 바꿀 수 없다.
		 * - 왜? 안정성을 높히기 위해서
		 * 
		 * 1. (지역,멤버)변수 적용
		 * 	  - 의미를 가진 상수
		 * 	  - 초깃값 이후 > 수정 불가능
		 *    - 식별자는 모두 대문자로 작성
		 * 
		 * 2. 메서드 적용
		 *    - 메서드 재정의 방지
		 *    
		 * 3. 클래스 적용
		 *    - 클래스 상속을 방지
		 * 
		 */
		
		//10 > 데이터, 상수, *리터럴(Literal)* //아래와 구분하기 위해서 리터럴이라고 부르자.
		int a = 10;
		final int B = 10; //final 변수, 상수(Constant) //상수는 대문자로 쓰기로 약속함.
		
		System.out.println(a);
		System.out.println(B);
		
		a = 20; //수정 가능
		//b = 20; //수정 불가능 //The final local variable b cannot be assigned. It must be blank and not using a compound assignment
		
		//double pi = 3.14;
		//pi = 3.16;
		
		final double PI = 3.14;
		//PI = 3.16;
		
		//int NUM = 30; //변수는 대문자로 쓰지 말자.
		
		
		User u1 = new User();
		//u1.gender = "남자";
		//u1.gender = 1;
		u1.gender = Gender.MALE;
		
		User u2 = new User();
		//u2.gender = "여자";
		//u1.gender = 2;
		u2.gender = Gender.FEMALE;
		
		//if(u1.gender.equals("남자")){
		//if(u1.gender == 1) { //식별자(데이터)의 의미를 알기가 힘들어졌다.
		//if(u1.gender == u1.MALE) { //u1.male = x;를 막기위해서 final을 쓰자.
		if(u1.gender == Gender.MALE) { //공용데이터니까 static을 쓰자...
			System.out.println("군대");
		}
		
		
		Member m1 = new Member();
		//m1.gender = User.MALE; //논리에는 문제가 없지만... Member가 왜 User를 가져다 쓰나.
		m1.gender = Gender.MALE;
		
		
		System.out.println(Gender.MALE);
		System.out.println(Calendar.YEAR);
		
		//Calendar.YEAR = 2; //수정불가
		
		
		FinalParent fp1 = new FinalParent();
		System.out.println(fp1.plus()); //10 + 20
		
		//FinalChild fc1 = new FinalChild();
		//System.out.println(fc1.plus()); //10 * 20 -> 10 + 20
		
		
	}//main
	
}

class Gender{ //최종적으로 이렇게 분리하는게 좋다.
	//열거형 상수
	public final static int MALE = 1;
	public final static int FEMALE = 2;
}

class Member{
	
	public String name;
	public int age;
	public int gender; 
	
}

class User{
	
	public String name;
	public int age;
	
	//성별
	//public String gender; //문자열 > "남자", "여자" //오타가능성 높음 -> 주관식으로 받지 말자.
	public int gender; //숫자 > 남자(1), 여자(2)
	
	//final static 변수
	//public final static int MALE = 1; //공용데이터
	//public final static int FEMALE = 2;
}

//final 클래스
//실제로 자식클래스를 나중에 만들지 말지 예상을 해서 신중하게 만들어야 한다...
final class FinalParent {
	
	//멤버 변수
	public int a = 10;
	public int b = 20;
	
	//멤버 메서드 > 원작자 > 오버라이딩 금지!!!
	//- 클래스 상속 안정성 향상 / 다형성 감소
	public final int plus() {
		return a + b;
	}
	
	
}

//- The type FinalChild cannot subclass the final class FinalParent
//class FinalChild extends FinalParent{
//	
//	//부모가 의도한 주제는 벗어나지 않는 선에서 재정의
//	//- Cannot override the final method from FinalParent
//	@Override
//	public int plus() {
//		return a * b;
//	}
//	
//}
