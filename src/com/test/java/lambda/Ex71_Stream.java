package com.test.java.lambda;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;

import com.test.data.Item;

public class Ex71_Stream {

	public static void main(String[] args) {
		
		/*
		 * 자바의 스트림
		 * 1. 입출력
		 *     - 파일 입출력, 콘솔 입출력, 네트워크 입출력..
		 * 
		 * 2. 스트림
		 *     - Java 8(JDK 1.8) > 람다식 + 함수형 인터페이스 + 스트림
		 *     - 배열(컬렉션) 등의 탐색(조작) 기술
		 *     
		 * 
		 * 표준 API 함수형 인터페이스
		 * 
		 * 1. Consumer
		 *     - (매개변수) -> {}
		 *     
		 * 2. Supplier
		 *     - () -> { 반환값 }
		 *     
		 * 3. Function
		 *     - (매개변수) -> { 반환값 }
		 *     
		 * 4. Operator
		 *     - (매개변수) -> { 반환값 }
		 *     - 매개변수 자료형 == 반환값 자료형
		 *     
		 * 5. Predicate
		 *     - (매개변수) -> { 반환값 }
		 *     - 반환값이 boolean
		 *     
		 *     
		 * 스트림, Stream
		 * - 특정 데이터 집합(소스)으로부터 생성
		 * 
		 * 
		 * 파이프, Pipe
		 * - 스트림 객체를 통해서 호출되는 메서드
		 * - 중간 파이프 > 반환값이 Stream
		 * - 최종 파이프 > 반환값이 Stream이 아닌 나머지
		 * 
		 * 최종 처리
		 * - forEach(Consumer)
		 * - 최종 파이프
		 * - 앞의 스트림으로부터 데이터를 받아 최종 처리를 하는 메서드
		 * 
		 * 필터링
		 * - filter(Predicate)
		 * - 중간 파이프
		 * - 앞의 스트림으로부터 데이터를 받아 조건에 맞는 요소만 남기고 맞지 않는 요소는 버린다.
		 * 
		 * 중복 제거
		 * - distinct()
		 * - 중간 파이프
		 * - 앞의 스트림으로부터 데이터를 받아 중복값을 제거한다.
		 * 
		 * 변환(*****)
		 * - map(Function), mapXXX(Function)
		 * - 중간 파이프
		 * - 앞의 스트림으로부터 요소를 받아 데이터를 다른 형태로 변환 후 새로운 스트림을 반환
		 * 
		 * 정렬
		 * - sorted(Comparator)
		 * - 중간 파이프
		 * - 사용법이 기존(Collenctions.sort(), Arrays.sort())과 동일
		 * 
		 * 매칭
		 * - allMatch(), anyMatch(), noneMatch()
		 * - 최종 파이프
		 * - boolean allMatch(Predicate): 모든 요소가 조건을 모두 만족하는지?
		 * - boolean anyMatch(Predicate): 일부 요소가 조건을 만족하는지?
		 * - boolean noneMatch(Predicate): 모든 요소가 조건을 불만족하는지?
		 * 
		 * 집계/통계, Reduce
		 * - count()
		 * - max()
		 * - min()
		 * - sum()
		 * - avg()
		 * - 최종 파이프 
		 *
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		m9();
		
		
		//스트림 타입: 숫자, 문자열, 날짜
		//- count(), max(), min()
		
		//스트림 타입: 숫자
		//- sum(), avg()
		
		
		//Stream<T> 제네릭은 숫자라는 보장이 없다
		//Data.getIntList().stream().
		
		//Stream<Integer>: 범용
		//IntStream: 전용
		//DoubleStream 등등..
		
		//Stream<Integer> > (변환) > IntStream
		int sum = Data.getIntList().stream()
							.mapToInt(n->n)
							.sum();
		System.out.println(sum);
		//int[] list1 = new int[3]; //초기값이 0
		//int[] list1 = {}; //빈 배열 //null은 아님
		System.out.println(Data.getIntList().stream().mapToInt(n->n).average()); //OptionalDouble, Optional<Double>
		//System.out.println(Arrays.stream(list1).average().getAsDouble()); //If a value is present, returns the value, otherwise throws NoSuchElementException.
		
		
		//user > 남자의 평균키?
		
		double height = Data.getUserList().stream()
							.filter(u -> u.getGender() == 1)
							.mapToInt(u -> u.getHeight())
							.average()
							.getAsDouble();
		
		System.out.println(height);
		
	}//main

	private static void m9() {
		
		System.out.println(
				Data.getIntList().stream()
									.filter(n -> n % 2 == 0)
									.count()
		);
		
		System.out.println(
				Data.getIntList().stream()
									.filter(n -> n % 2 == 1)
									.count()
		);
		
		System.out.println(Data.getUserList().stream().count());
		System.out.println(Data.getUserList().stream().filter(user -> user.getGender() == 1).count());
		System.out.println(Data.getUserList().stream().filter(user -> user.getGender() == 2).count());
		
		//max(), min()
		System.out.println(Data.getIntList().stream().max((a, b) -> a - b));
		System.out.println(Data.getIntList().stream().min((a, b) -> a - b));
		
		System.out.println(Data.getIntList().stream().max((a, b) -> b - a));
		System.out.println(Data.getIntList().stream().min((a, b) -> b - a));
		
		System.out.println(Data.getUserList().stream().max((a, b) -> a.getAge() - b.getAge()));
		System.out.println(Data.getUserList().stream().min((a, b) -> a.getAge() - b.getAge()));
	
		
		List<Integer> nums2 = new ArrayList<Integer>();
		//nums2.add(100);
		//nums2.add(50);
		//nums2.add(20);
		
		//메서드의 반환값/인자값을 아무것도안주고 싶을 때..
		//- 값형은 사용 불가능(null을 대입 불가능해서) //값형은 결과값이 반드시 있을 때만...
		//int maxNum = nums2.stream().max((a, b) -> a - b); //값이 없다면 null을 반환해야해서 int 불가능
		Optional<Integer> maxNum = nums2.stream().max((a, b) -> a - b);
		
		//if(maxNum != null)
		//System.out.println(maxNum.intValue()); //Integer maxNum인 경우에도 값이 없다면 NullPointerException발생!
		
		if(maxNum.isPresent()) { //if(maxNum != null)
			System.out.println(maxNum);
			System.out.println(maxNum.get());
		}
		
		if(maxNum.isEmpty()) { //if(maxNum == null)
			
		}
		
	}

	private static void m8() {
		
		//int[] nums = {2, 4, 6, 8, 10};
		
		//Returns an unmodifiable list containing five elements.
		List<Integer> nums = List.of(2, 4, 5, 6, 8, 10); //읽기 전용
		//nums.add(12); //런타임 에러!
		//nums.remove(0); //런타임 에러!
		//System.out.println(nums);
		
		
		//nums에 짝수만 있는지? > true, false
		boolean result = true;
		
		for (int n : nums) {
			if(n % 2 == 1) {
				result = false;
				break;
			}
		}
		
		System.out.println(result);
		
		
		result = nums.stream().allMatch(num -> num % 2 == 0);
		System.out.println(result);
		
		
		result = Data.getUserList().stream()
										.filter(user -> user.getHeight() > 180)
										.allMatch(user -> user.getGender() == 1);
		System.out.println(result);
		
		
		nums = List.of(2, 4, 5, 8, 10);
		
		//nums안에 홀수가 (1개라도) 있느냐?
		result = nums.stream().anyMatch(n -> n % 2 == 1);
		System.out.println(result);
		
		
		nums = List.of(2, 3, 4);
		
		//짝수가 존재하지 않느냐?
		result = nums.stream().noneMatch(n -> n % 2 == 0);
		System.out.println(result);
		
	}

	private static void m7() {
		
		Data.getIntList(10)
			.stream()
			//.sorted((a, b) -> b - a)
			//.sorted(Comparator.naturalOrder()) //(a, b) -> a - b
			.sorted(Comparator.reverseOrder()) //(a, b) -> b - a
			.forEach(n -> System.out.println(n));
		
	}

	private static void m6() {
		
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		//각 단어 > (변환) > 글자수
		List<Integer> result = new ArrayList<Integer>();
		
		for (String str : list) {
			result.add(str.length());
		}
		
		System.out.println(result);
		
		list.stream()
			.map(word -> word.substring(0, 1)) //반환값으로 구성된 스트림 생성
			.forEach(word -> System.out.println(word));
		
		list.stream()
			.map(word -> word.length())
			.forEach(word -> System.out.println(word));
		
		list.stream()
			.map(word -> word.length() >=5 ? "긴단어" : "짧은단어")
			.forEach(result2 -> System.out.println(result2));
		
		
		//User 배열
		Data.getUserList().stream()
							//.map(user -> user.getName())
							//.map(user -> user.getName())
							.map(user -> user.getGender() == 1 ? "남자" : "여자")
							.forEach(result3 -> System.out.println(result3));
		
		String[] names = {"홍길동", "아무개", "강아지", "고양이", "병아리"};
		
		//com.test.java.lambda
		//new User(이름, 나이, 주소) x 5개
		
		//String[] names > (변환) > List<User> ulist
		List<User> ulist = new ArrayList<User>();
		
		for(String name : names) {
			User u = new User(name, 20, "서울시");
			ulist.add(u);
		}
		
		Arrays.stream(names)
				.map(name -> new User(name, 20, "서울시"))
				.forEach(user -> System.out.println(user));
		System.out.println();
		
	}

	private static void m5() {
		
		List<Integer> nums = Data.getIntList(10);
		System.out.println(nums);
		System.out.println(nums.size());
		System.out.println(nums.stream().count());
		System.out.println();
		
		System.out.println(nums.stream().distinct().count());
		System.out.println();
		
		int[] nums2 = { 10, 20, 30, 10, 10, 10, 10 };
		
		System.out.println(Arrays.stream(nums2).distinct().count());
		
		long begin = System.nanoTime();
		long end = System.nanoTime();
		
		begin = System.nanoTime();
		Data.getStringList().stream()
							.filter(word -> word.length() >= 5)
							.distinct() //distinct는 상태유지연산이며 내부적으로 hashSet과 유사한 기능을 쓰기 때문에 메모리 사용량이 높아질 수 있다.
							.forEach(word -> System.out.println(word));
		end = System.nanoTime();
		System.out.println(end - begin + "ns");
		System.out.println();
		
		begin = System.nanoTime();
		Data.getStringList().stream()
							.distinct()
							.filter(word -> word.length() >= 5)
							.forEach(word -> System.out.println(word));
		end = System.nanoTime();
		System.out.println(end - begin + "ns");
		System.out.println();
		
	}

	private static void m4() {
		
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		
		//짝수만 출력
		for (int i=0; i<list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				System.out.printf("%-4d", list.get(i));
			}
		}
		System.out.println();
		
		list.stream().forEach(n -> {
			if(n % 2 == 0) {
				System.out.printf("%-4d", n);
			}
		});
		System.out.println();
		
		
		list.stream()
			.filter(n -> n % 2 == 0) // &&으로 붙이는 것보다 나누는 걸 권장
			.filter(n -> n >= 50)
			.forEach(n -> System.out.printf("%-4d", n));
		System.out.println();
		
		
		Data.getStringList().stream()
							.filter(word -> word.length() >= 5)
							.filter(word -> word.startsWith("애"))
							.forEach(word -> System.out.println(word));
		System.out.println();
		
		Data.getUserList().stream()
							.filter(user -> user.getGender() == 1)
							.filter(user -> user.getHeight() > 180)
							.filter(user -> user.getWeight() > 80)
							.forEach(user -> System.out.println(user));
		
	}

	private static void m3() {
		
		//스트림을 얻어오는 방법
		//- stream() / 여러가지 메서드를 호출
		//1. 배열로부터
		//2. 컬렉션으로부터
		//3. 숫자 범위
		//4. 파일로부터
		//5. 디렉토리로부터
		//6. ..
		
		//1.
		int[] nums1 = { 10, 20, 30}; //JDK 1.0
		//스트림 > JDK 1.8
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();
		
		//2.
		List<Integer> nums2 = Data.getIntList(3);
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		//3.
		//Stream<T>
		//IntStream
		
		IntStream.range(1, 10).forEach(num -> System.out.println(num));
		System.out.println();
		
		
		try {
			
			//4. 파일 읽기
			//- FileReader
			//- Scanner
			//- Stream
			Path path = Paths.get(".\\data\\score.dat"); //File 참조 객체 역할
			
			Files.lines(path).forEach(str -> System.out.println(str));
			
			//5.
			Path dir = Paths.get("C:\\Users\\user\\Downloads\\eclipse-jee-2025-12-R-win32-x86_64\\eclipse");
			Files.list(dir).forEach(p -> {
				System.out.println(p.getFileName());
				File file = p.toFile();
				System.out.println(file.isFile());
			}); //dir.listFiles()
			
			
		} catch (Exception e) {
			System.out.println("Ex71_Stream.m3() 예외 발생");
			e.printStackTrace();
		}
		
	}

	private static void m2() {

		//배열(컬렉션) 탐색
		List<String> txt1 = Data.getStringList(10);
		System.out.println(txt1);
		
		
		//1. for문(while문)
		for(int i=0; i< txt1.size(); i++) {
			System.out.printf(" %s ", txt1.get(i));
		}
		System.out.println();
		
		//2. 향상된 for문
		for(String s : txt1) {
			System.out.printf(" %s ", s);
		}
		System.out.println();
		
		//3. iterator
		Iterator<String> iter = txt1.iterator();
		while(iter.hasNext()) {
			System.out.printf(" %s ", iter.next());
		}
		System.out.println();
		
		//4. Stream
		//4.1 데이터 소스로부터 스트림을 얻기
		Stream<String> stream = txt1.stream();
		
		//4.2 스트림 객체를 통해서 배열의 요소에 접근 가능 + 조작
		Consumer<String> c1 = s -> System.out.println("단어: " + s);
		
		//- 스트림으로부터 요소 하나를 꺼낸다.
		//- 꺼낸 요소를 Consumer에게 전달한다.
		//    - c1.accept(문자열) 호출한다.
		stream.forEach(c1);
		System.out.println();
		
		
		txt1.stream()
				.forEach(s -> System.out.println(s));
		System.out.println();
		
		
		//숫자 10개 > 제곱 출력
		Data.getIntList(10)
			.stream()
			.forEach(num -> System.out.println(num * num));
		
		//Item 10개 > 정보 출력
		Data.getItemList(10).stream().forEach(item -> {
			System.out.println(item.getName());
			System.out.println(item.getColor());
			System.out.printf("%tF\n", item.getDate());
			System.out.println();
		});
		
		
		
	}

	private static void m1() {
		
		int[] nums1 = Data.getIntArray();
		System.out.println(Arrays.toString(nums1));
		
		int[] nums2 = Data.getIntArray(10);
		System.out.println(Arrays.toString(nums2));
		
		List<Integer> nums3 = Data.getIntList();
		System.out.println(nums3);
		
		List<Integer> nums4 = Data.getIntList(10);
		System.out.println(nums4);
		
		String[] txt1 = Data.getStringArray(5);
		System.out.println(Arrays.toString(txt1));
		
		com.test.data.User[] ulist = Data.getUserArray();
		System.out.println(Arrays.toString(ulist));
		
		Item[] ilist = Data.getItemArray();
		System.out.println(Arrays.toString(ilist));
		
	}
	
}
