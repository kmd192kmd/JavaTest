package com.test.java.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ex70_Lambda {

	public static void main(String[] args) {
		
		/*
		 * 람다식 > 익명 객체의 구현된 추상 메서드 > 인터페이스 참조 변수에 저장 > 람다식을 사용하려면 반드시 인터페이스가 필요하다!!
		 * 
		 * 
		 * *** 자바는 람다식을 저장하기 위한 여러가지 인터페이스를 미리 제공한다. > 함수형 인터페이스(Functional Interface)
		 * 
		 * 
		 * 함수형 인터페이스
		 * 1. 표준 API 함수형 인터페이스
		 * 		- JDK에서 제공하는 인터페이스
		 * 2. 사용자 정의 함수형 인터페이스
		 * 		- 개발자가 만든 인터페이스
		 * 
		 * 
		 * 표준 API 함수형 인터페이스
		 * 
		 * 1. Consumer
		 * 		- Consumer<T>
		 * 		- BiConsumer<T, U>
		 * 		- ..
		 * 		- 매개변수O, 반환값X > 추상 메서드 제공
		 * 
		 * 2. Supplier
		 * 		- Supplier<T>
		 * 		- ..
		 * 		- 매개변수X, 반환값O > 추상 메서드 제공
		 * 
		 * 3. Function
		 * 		- Function<T,R>
		 * 		- BiFunction<T,U,R>
		 * 		- ..
		 * 		- 매개변수O, 반환값O > 추상 메서드 제공
		 * 
		 * 4. Operator
		 * 		- Function 하위셋
		 * 
		 * 5. Predicate
		 * 		- Function 하위셋
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
	}

	private static void m5() {

		//Predicate
		//- 매개변수를 전달하면, 처리후, 반환값을 돌려주는 업무
		//- testXXX() 추상 메서드 제공
		//- 논리 검사 한 후 boolean 반환
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		
		Predicate<Integer> p1 = num -> num > 0;
		
		System.out.println(f1.apply(10));
		System.out.println(p1.test(10));
		
		BiPredicate<Integer, Integer> p2 = (a, b) -> a > b;
		System.out.println(p2.test(10, 5));
		
	}

	private static void m4() {
		
		//Operator
		//- 매개변수를 전달하면, 처리 후, 반환값을 돌려주는 업무(input / output)
		//- applyXXX() 추상 메서드 제공
		//- 1 + 2 = 3
		//- 추상 메서드의 매개변수 자료형과 반환값의 자료형이 동일하다.
		
		BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a + b;
		System.out.println(bf1.apply(10, 20));
		
		BinaryOperator<Integer> bo1 = (a, b) -> a + b;
		System.out.println(bo1.apply(10, 20));
		
		UnaryOperator<Integer> uo1 = a -> a * a;
		System.out.println(uo1.apply(3));
		
	}

	private static void m3() {

		//Function
		//- 매개변수를 전달하면, 처리 후, 반환값을 돌려주는 업무(input / output)
		//- applyXXX() 추상 메서드 제공
		
		Function<String, Integer> f1 = str -> str.length();
		System.out.println(f1.apply("안녕하세요"));
		
		Function<Integer, Boolean> f2 = num -> num > 0;
		System.out.println(f2.apply(10));
		System.out.println(f2.apply(-10));
		
		BiFunction<Integer, Integer, Integer> f3 = (a, b) -> a + b;
		System.out.println(f3.apply(10, 20));
		
		BiFunction<Integer, Integer, String> f4 = (a, b) -> {
			if(a > b) {
				return "크다";
			} else  if(a < b) {
				return "작다";
			} else {
				return "같다";
			}
		};
		System.out.println(f4.apply(10, 5));
		
	}

	private static void m2() {
		
		//Supplier
		//- 매개변수가 없고, 반환값만 돌려주는 업무를 구현하는 메서드가 필요
		//- getXXX() 추상 메서드 제공
		
		Supplier<Integer> s1 = () -> 100;
		System.out.println(s1.get());

		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get());
		
		Supplier<String> s3 = () -> "홍길동";
		System.out.println(s3.get());
		
		IntSupplier s4 = () -> 20;
		System.out.println(s4.getAsInt());
		
	}

	private static void m1() {

		//Consumer
		//- 업무 구현 > 메서드 구현
		//- 매개변수를 받아서 > 소비하는 업무를 구현하는 메서드가 필요할 때
		//- 매개변수O, 반환값X
		//- acceptXXX() 추상 메서드 제공
		
		MyConsumer c1 = new MyConsumer() {
			
			@Override
			public void test(int num) {
				System.out.println(num * 2);
			}
		};
		c1.test(100);
		
		MyConsumer c2 = num -> System.out.println(num * 2);
		c2.test(200);
		
		Consumer<Integer> c3 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t * 2);
			}
		};
		c3.accept(300);

		Consumer<Integer> c4 = num -> System.out.println(num * 2);
		c4.accept(400);
		
		Consumer<String> c5 = name -> System.out.println(name.length());
		c5.accept("대한민국");
		
		Consumer<Integer> c6 = count -> {
			for(int i=1; i<=count; i++) {
				System.out.println(i);
			}
		};
		c6.accept(5);
		
		Consumer<User> c7 = user -> {
			System.out.println("이름: " + user.getName());
			System.out.println("나이: " + user.getAge());
			System.out.println("주소: " + user.getAddress());
		};
		c7.accept(new User("홍길동", 20, "서울시"));
		
		//Consumer<T>
		//BiConsumer<T,U>
		BiConsumer<String, Integer> bc1 = (name, age) -> {
			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
		};
		bc1.accept("홍길동", 20);
		
		BiConsumer<Integer, Integer> bc2 = (a, b) -> System.out.println(a + b);
		bc2.accept(10, 20);
		
		
		Consumer<Integer> ic1; //범용 > 타입에 관계없는 업무만 구현
		IntConsumer ic2;       //전용 > 정수와 관계된 업무들 집중적으로 구현
		
		IntConsumer ic3 = num -> System.out.println(num * num);
		ic3.accept(10);
		
		DoubleConsumer dc1;
		LongConsumer lc1;
		ObjDoubleConsumer<String> odc1 = (name, weight) -> {
			System.out.println(name);
			System.out.println(weight);
		};
		odc1.accept("몸무게", 75.8);
		
		
	}//m1
	
}


interface MyConsumer{
	void test(int num);
}

class User{
	
	private String name;
	private int age;
	private String address;
	
	public User(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}





