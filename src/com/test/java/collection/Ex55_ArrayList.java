package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex55_ArrayList {

	public static void main(String[] args) {
		
		/*
		 * Collection, 컬렉션
		 * - 배열의 업그레이드 버전
		 * - JCF, Java Collection Framework
		 * - 업그레이드?
		 *     1. (상황에 따른) 성능 향상
		 *     2. (상황에 따른) 사용법 향상
		 *     3. 길이 가변 > 길이가 늘었다 줄었다 가능
		 *     
		 *     
		 * 컬렉션 종류
		 * 
		 * 1. List 계열
		 *     - ArrayList(**********)
		 *     - LinkedList
		 *     - Queue
		 *     - Stack
		 *     - Vector
		 * 
		 * 2. Set 계열
		 *     - HashSet(***)
		 *     - TreeSet
		 * 
		 * 3. Map 계열
		 *     - HashMap(***)
		 *     - TreeMap
		 *     - Properties
		 *     - HashTable
		 *     
		 *     
		 * ArrayList 클래스
		 *     - Iterable<E>, Collection<E>, List<E>...
		 *     - Resizable-array implementation of the List interface.
		 */
		
		//예제 27의 배열을 ArrayList로 바꾸는 연습하자.
		//m1();
		m2();
		//m3();
		//m4();
		
	}

	private static void m4() {

		//성적표
		//- 학생 5명의 국영수 성적표 > 학생명, 국어, 영어, 수학
		//1. 배열       > 길이 고정
		//2. ArrayList > 길이 가변
		
//		Score s1 = new Score();
//		
//		s1.setName("홍길동");
//		s1.setKor(100);
//		s1.setEng(90);
//		s1.setMath(80);
//		
//		System.out.println(s1.getTotal());
//		System.out.println(s1.getAvg());
		
		
		//더미(dummy) 데이터
		
		//학생 명단
		ArrayList<Score> list = new ArrayList<Score>();
	
		String[] names = {"홍길동", "아무개", "강아지", "고양이", "병아리"};
		Random rnd = new Random();
		
		for(int i=0; i<5; i++) { //list.size는 0이다.
			
			//1회전 > 학생 1명 > Score 객체 1개
			Score s = new Score();
			
			s.setNo(i+1);
			s.setName(names[i]);
			
			//60~100
			//(0 ~ 40) + 60
			s.setKor(rnd.nextInt(41) + 60);
			s.setEng(rnd.nextInt(41) + 60);
			s.setMath(rnd.nextInt(41) + 60);
			
			list.add(s);
			
			
		}
		
		//출력
		System.out.println("=====================================================");
		System.out.println("                        성적표");
		System.out.println("=====================================================");
		System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for(Score s : list) {
			System.out.printf("%4d\t%4s\t%4d\t%4d\t%4d\t%4d\t%4.1f\n"
					, s.getNo()
					, s.getName()
					, s.getKor()
					, s.getEng()
					, s.getMath()
					, s.getTotal()
					, s.getAvg());
		}
		
	}

	private static void m3() {
		
		//int[] a1 = new int[3];
		//int a2[] = new int[3]; //잘 안씀.

		int[]     ns1 = new int[3];
		int[][]   ns2 = new int[2][3];
		int[][][] ns3 = new int[2][3][4];
		
		//int[] ns1
		ArrayList<Integer> ms1 = new ArrayList<Integer>(); //제네릭에는 클래스만 들어갈 수 있으니 int가 아니라 Integer가 들어간다.
		ns1[0] = 10;
		ms1.add(10);
		System.out.println(ms1.get(0));
		
		//int[][] ns2
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>();
		ns2[0][0] = 10;
		ms2.add(new ArrayList<Integer>()); //
		ms2.get(0).add(10);
		System.out.println(ms2.get(0).get(0));
		
		//int[][][] ns3
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 = new ArrayList<ArrayList<ArrayList<Integer>>>();
		ns3[0][0][0] = 10;
		ms3.add(new ArrayList<ArrayList<Integer>>());
		ms3.get(0).add(new ArrayList<Integer>());
		ms3.get(0).get(0).add(10);
		System.out.println(ms3.get(0).get(0).get(0));
		
	}

	private static void m2() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//1. 요소 추가하기
		//- boolean add(T value) -> 상속하다보면 필요없는 것도 있는 경우가 생김. // ArrayList는 계속해서 추가되기 때문에 쓸일이 거의 없음.
		//- 배열의 마지막방에 추가 > Append Mode
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("파인애플");
		list.add("망고");
		
		//2. 요소 개수
		//- 추가한 요소의 총 개수 = 배열의 길이 역할(엄밀하게는 아님)
		//- int size()
		System.out.println(list.size());
		
		//3. 요소 읽기
		//- T get(int index)
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		//System.out.println(list.get(5)); //IndexOutOfBoundsException
		
		//4. 요소 수정
		//- T set(int index, T newValue) -> 값 반환 가능
		//- list[2] = "파파야"
		System.out.println(list);
		list.set(0, "파파야");
		System.out.println(list.get(0));
		System.out.println(list);
		System.out.println();
		
		//5. 요소 삭제
		//- 방 없애기
		//- T remove(index index) -> 값 반환 가능
		//- boolean remove(Object o)
		//- 시프트 발생(*********)
	
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		System.out.println();
		
		System.out.println(list.get(2)); //파인애플
		System.out.println();
		
		list.add("바나나");
		
		System.out.println(list);
		list.remove("바나나"); //하나만 지우고 끝난다.
		System.out.println(list);
		System.out.println();
		
		System.out.println(list.get(2)); //망고
		System.out.println();
		
		
		//6. 요소 추가
		//- Insert Mode
		//- 새치기. 원하는 위치에 요소 추가
		//- 시프트 발생
		//- void add(int index, T value)
		list.add(2, "포도");
		System.out.println(list);
		System.out.println();
		
		
		//7. 요소 검색
		//- int indexOf(T value)
		//- int lastIndexOf(T value)
		//- boolean contains(T value)
		System.out.println(list.indexOf("파인애플")); //String의 indexOf와는 다르게 시작위치 지정 못하고, 찾으면 종료된다.
		System.out.println();
		
		//8. 탐색
		System.out.println(list);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		} 
		System.out.println();
		
		
		//향상된 for문, Enhanced for statement -> 특정기능을 강화시키다 -> 일반적인 읽기 기능만을 남김(빈도수 높음), 디테일한 변화 불가능
		//foreach (변수 : 집합){
		//for (변수 in 집합){
		for (String s : list) { //순수한 배열 혹은 Iterable<E>을 상속하여 구현한 아이들만 '집합'위치에 들어갈 수 있다 -> 컬렉션에서 List, Set은 가능, Map은 불가능.
			System.out.println(s);
		}
		System.out.println();
		
		
		//9. 초기화
		//- 모든 요소 삭제 > 모든방.remove()
		//- void clear()
		
		//list.clear();
		list = new ArrayList<String>();
		System.out.println(list);
		System.out.println();
		
		
		//10. 빈배열 확인
		//- boolean isEmpty()
		System.out.println(list.isEmpty());
		System.out.println();
		
		list.add("사과");
		System.out.println(list.isEmpty());
		System.out.println();
		
		
	}

	private static void m1() {
		
		//순수 배열
		//- 타입 명시(int)
		//- 길이 명시(3)
		int[] nums1 = new int[3];
		
		//요소 접근 > 첨자(index) 사용
		nums1[0] = 10; //Indexer(인덱서)
		nums1[1] = 20;
		nums1[2] = 30;
		
		System.out.println(nums1[0]);
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);
		System.out.println(nums1.length);
		System.out.println();
		
		
		//컬렉션(ArrayList)
		//ArrayList nums2 = new ArrayList(); //오래된 레거시
		//- 타입 명시(제네릭)
		//- 길이 없음 > 가변
		ArrayList<Integer> nums2 = new ArrayList<Integer>(); //배열이다!!
		
		//요소 접근 > Append
		nums2.add(10); //0번째 방 //Indexer가 컬렉션에는 재현되지 않았음.
		nums2.add(20); //1번째 방
		nums2.add(30); //2번째 방... 계속 들어간다... 이론상은 21억(길이나 크기에 음수를 쓰지 않음)
		
		System.out.println(nums2.get(0));
		System.out.println(nums2.get(1));
		System.out.println(nums2.get(2));
		System.out.println(nums2.size());
		
		nums2.add(40);
		nums2.add(50);
		System.out.println(nums2.size());
		
		System.out.println();
		
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums2); //println은 null을 제외한 모든 객체는 XXX.toString()을 출력한다.
		System.out.println(nums2.toString()); //Object로 부터 상속 받음.
	
	}
	
}

//학생 1명
class Score{
	
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	//계산된 프로퍼티
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	public double getAvg() {
		return this.getTotal() / 3.0;
	}
	
	
}




















