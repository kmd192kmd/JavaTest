package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex63_Sort {
	
	public static void main(String[] args) {
		
		//정렬, Sort
		//- 배열, 컬렉션(List 계열)
		//- 순서가 있는 데이터 집합에 한해서..
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
		
	}

	private static void m5() {

		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("강아지", "개발부", "사원"));
		list.add(new Employee("병아리", "영업부", "대리"));
		list.add(new Employee("홍길동", "개발부", "부장"));
		list.add(new Employee("아무개", "개발부", "과장"));
		list.add(new Employee("고양이", "영업부", "부장"));
		list.add(new Employee("테스트", "개발부", "대리"));
		list.add(new Employee("거북이", "영업부", "사원"));
		
		//System.out.println(list);
		
		//- (ArraysList<Integer>)
		
		//Collections.sort(list, Comparator<T>); //기준을 정해주어야 한다.
		
		list.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				//return o2.getName().compareTo(o1.getName()); //기준 정하기.
				//return o1.getDepartment().compareTo(o2.getDepartment());
				//return o1.getPosition().compareTo(o2.getPosition()); //직급 순이 아니라서 불만스러움.
				//return o1.getPositionNumber() - o2.getPositionNumber();
				
				if(o1.getPositionNumber() > o2.getPositionNumber()) {
					return 1;	
				} else if(o1.getPositionNumber() < o2.getPositionNumber()) {
					return -1;
				} else {
					//직위가 동일한 사람들끼리 > 재조건 제시
					return o1.getName().compareTo(o2.getName());
				}
				
			}
		});
		
		System.out.println(list);
		
	}

	private static void m4() {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("강아지");
		names.add("타조");
		names.add("거북이");
		names.add("독수리");
		names.add("고양이");
		
		System.out.println(names);
		System.out.println();
		
//		Comparator<String> comparator = new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//			
//		};
//		
//		names.sort(comparator);
		
//		names.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//		});
		
		names.sort((o1,o2) -> o2.compareTo(o1)); //Lambda식
		
		System.out.println(names);
		System.out.println();
		
		
	}

	private static void m3() {
		
		String[] names = {"강아지", "고양이", "병아리", "닭", "참새"};
		
		//Arrays.sort(names); //Arrays.reverse()는 없다.
		
		Arrays.sort(names, new MyComparator());
		
		System.out.println(Arrays.toString(names));
		
		}

	private static void m2() {
		
		ArrayList<String> names = new ArrayList<String>();
				
				names.add("강아지");
				names.add("타조");
				names.add("거북이");
				names.add("독수리");
				names.add("고양이");
				
				System.out.println(names);
				
				//오름차순
				Collections.sort(names);
				
				//내림차순
				//Collections.reverse(names); //반대로 뒤집는다. 즉, 오름차순 이후 사용하면 내림차순이 된다. 정석적인 방법은 아님.
				
				//System.out.println(names);
				
				//내림차순하는 방법(X) > 내가 원하는 모든 정렬하는 방법(O)
				//- Comparator 인터페이스	
				
				MyComparator my = new MyComparator();
				
				//Collections.sort(names, my);
				names.sort(my);
				
				System.out.println(names);
		
	}

	private static void m1() {
		
		//정렬
		//- 오름차순, 내림차순
		//1. 직접 구현 > 정렬 알고리즘
		//2. JDK 제공 기능
		
		//정렬 > 우위 비교를 통해서 자리를 바꾸는 행동
		
		//우위 비교가 가능한 자료형
		//1. 숫자
		//2. 문자(열) > 문자코드값 > 숫자
		//3. 날짜시간 > 타임스태프 > 숫자
		
		//정렬 메서드
		//- Arrays.sort()
		//- Collections.sort()
		
		//1.a 숫자 + 배열
		int[] nums1 = {1, 5, 3, 2, 4};
		
		System.out.println(Arrays.toString(nums1));
		
		//정렬 > 오름차순 정렬
		Arrays.sort(nums1);
		
		System.out.println(Arrays.toString(nums1));
		
		//1.b 숫자 + 컬렉션
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		nums2.add(1);
		nums2.add(5);
		nums2.add(3);
		nums2.add(2);
		nums2.add(4);
		
		System.out.println(nums2);
		
		Collections.sort(nums2);
		
		System.out.println(nums2);
		
		System.out.println();
		
		
		//2. 문자열
		String s1 = "Java";
		String s2 = "JavaCode";
		
		//System.out.println(s1 > s2);
		//System.out.println('J' > 'O');
		System.out.println(s1.compareTo(s2)); //양수 > 앞의 문자코드 값이 더 크다. 음수 > 앞의 문자코드 값이 더 작다. 0 > 문자코드 값이 같다.
		
		char c1 = 'A';
		char c2 = 'F';
		
		System.out.println(c1 > c2);
		
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("강아지");
		names.add("타조");
		names.add("거북이");
		names.add("독수리");
		names.add("고양이");
		
		System.out.println(names);
		
		//버블 정렬, 선택 정렬, 힙 정렬, 퀵 정렬, 삽입 정렬, 머지 정렬
		
		//sort() > 퀵 정렬
		Collections.sort(names);
		
		System.out.println(names);
		System.out.println();
		
		
		//3. 날짜 시간
		
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		
		d2.add(Calendar.MINUTE, 30);
		
		//System.out.println(d1 > d2);
		//System.out.println(d1.getTimeInMillis() > d2.getTimeInMillis());
		System.out.println(d1.compareTo(d2));
		System.out.println(d2.compareTo(d1));
		
		
		ArrayList<Calendar> times = new ArrayList<Calendar>();
		
		times.add(Calendar.getInstance());
		times.get(0).add(Calendar.DATE, 0);
		
		times.add(Calendar.getInstance());
		times.get(1).add(Calendar.DATE, -7);
		
		times.add(Calendar.getInstance());
		times.get(2).add(Calendar.DATE, 3);
		
		times.add(Calendar.getInstance());
		times.get(3).add(Calendar.DATE, -2);
		
		times.add(Calendar.getInstance());
		times.get(4).add(Calendar.DATE, 1);
		
		Collections.sort(times);
		
		for(Calendar c : times) {
			System.out.printf("%tF\n", c);
		}
		System.out.println();
		
	}
	
}

//- T: 정렬을 하려는 배열의 요소 타입
class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		//오름차순
		//- o1-o2
		
		//내림차순
		//- o2-o1
		
		return o2.compareTo(o1);
	}
	
}

class Employee{
	
	private String name;
	private String department;
	private String position;
	
	public Employee(String name, String department, String position) {
		this.name = name;
		this.department = department;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return String.format("\n%s(%s,%s)"
								, this.name
								, this.department
								, this.position);
	}
	
	public int getPositionNumber() {
		
		if(this.position.equals("사원")) {
			return 1;
		} else if(this.position.equals("대리")) {
			return 2;
		} else if(this.position.equals("과장")) {
			return 3;
		}  else if(this.position.equals("부장")) {
			return 4;
		}
		
		return -1;
		
	}
}











