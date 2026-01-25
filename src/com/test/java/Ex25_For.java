package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_For {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * 반복문
		 * - 특정 코드를 개발자가 원하는 횟수만큼 반복한다.
		 * 
		 * for(초기식; 조건식; 증감식){
		 * 	코드;
		 * }
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
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		//m14();
		//m15();
		m16();
	
	} //main

	private static void m16() {
		
		//프로그램 실행(Run): Ctrl + F11
		//프로그램 실행(Debug) : F11 > F6
		
		//breakpoint 찍기
		System.out.println("시작");
		
		for(int i=0; i<10; i++) {
			
			System.out.println(i);
		}
		
	}

	private static void m15() {
		
		//다중 for + break, continue
		
		for(int i=0; i<10; i++) {
			
			for(int j=0; j<10; j++) {
				
				//if(i==5) {
				//if(j==5) {
				//if(i==5 && j==5) {	
				if(i==5 || j==5) {
					//break;
					continue;
				}
					
				System.out.printf("i: %d, j: %d\r\n", i, j);
			}
		}
		
	}

	private static void m14() {
		
		//구구단
		//- 2단 ~ 9단
		for(int j=2; j<=9; j++) {
			//int dan = 2;
			
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %2d\r\n" , j, i, j*i);
			}
			System.out.println();
		}
		
	}

	private static void m13() {
		
		//- (단일) for문
		//- 중첩 for문 > 2중 for문, 3중 for문.. N중 for문
		
		//단일 for문
		for(int i=0; i<10; i++) {
			System.out.printf("i: %d\n", i);
		}
		System.out.println();
		
		//2중 for문
		for(int i=0; i<10; i++) { //대회전
			for(int j=0; j<10; j++) { //소회전
				//System.out.println("출력문"); //몇번 실행? 100번
				System.out.printf("i: %d, j: %d\r\n", i, j);
			}
		}
		System.out.println();
		
		//3중 for문
		for(int i=0; i<24; i++) { //대회전 > 시침
			for(int j=0; j<60; j++) { //중회전 > 분침
				for(int k=0; k<60; k++){ //소회전 > 초침
					System.out.printf("i: %d, j: %d, k: %d\r\n", i, j, k);
				}
			}
		}
		System.out.println();
		
		/*
		 * 학교
		 * 
		 * for(학년){
		 * 	  for(반){
		 * 		 for(번호){
		 * 			
		 * 		}
		 * 	  }
		 * }
		 * 
		 * 아파트
		 * 
		 * for(단지){
		 * 	  for(동){
		 * 	  	 for(층){
		 * 		 	for(호수){
		 * 
		 * 			}
		 * 		}
		 * 	 }
		 * }
		 */
		
	}

	private static void m12() {
		
		//난수 만들기
		
		//1. Math 클래스
		//2. Random 클래스(Math 감싼 클래스)
	
		//Math.PI 파이값
		//- Matn.abs(5) 절대값 
		//- Math.ceil(0) 반올림
		//- Math.round(0) 반올림
		//- Math.floor(0) 내림
		//- Math.exp(0) 자연상수
		
		//0.0 ~ 0.99999999999
		//0이상 1미만
		//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. 
		//	Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range.
		//진정한 난수는 아니다.
		//System.out.println(Math.random());
		
		for(int i=0; i<10; i++) {
	
			//가공 > 1 ~ 10 정수
			System.out.println((int)(Math.random() * 10) + 1);
			
			//주사위 > 1 ~ 6
			//System.out.println((int)(Math.random() * 6) + 1);
			
			//3 ~ 8 > 0 ~ 5 먼저 만들고 더하기
			//System.out.println((int)(Math.random() * 6) + 3);
			
		}
		
	}

	private static void m11() {
		
		//중학교 > 선생님 + 학생 상담(30명)
		for(int i=1; i<=30; i++) {
			
//			if(i >= 16) {
//				break;
//			}
			
			if(i == 10 || i == 15 || i == 19) {
				continue; //skip
			}
			
			System.out.println(i + "번 학생 상담 중..");
		}
		
	}

	private static void m10() {
		
		//분기문
		//- break, continue
		//- switch문 반목문과 같이 사용
		//- if문 제외(인식 못함)
		
		//1. break
		//- 자신이 포함된 제어문을 탈출하는 역할
		//- 중단하는 역할(Stop)
		
		//2. continue
		//- 자신이 포함된 제어문의 처음으로 돌아간다.
		//- 잠시 건너뛰기 역할(Skip)
		
		for(int i=1; i<=10; i++) {
//			break; //java는 unreachable code를 용납하지 않는다. 컴파일 오류가 난다.
			
			if(i == 5) { //5자리엔 보통 사용자 입력값같은 변수가 온다.
//				break; //break는 if문이 아니고 for문을 탈출한다. if문을 인식하지 못한다. if문을 인식하면 if문 안에서 써먹기가 곤란하다.
				continue; //sysout까지 가지 않고 처음으로 돌아가므로 5만 안나온다.
			}
			
			System.out.println(i);
			
		}
		
	}

	private static void m9() throws NumberFormatException, IOException {
		
		//무한 루프, Infinite Loop
		//1. 개발자 실수
		//2. 개발자 의도적으로
		//	a. 반복 횟수 미정
		//	b. 진짜로 무한 루프가 필요할 때
		
		//엄밀히 따지면 int의 한계를 넘어가면 오버플로우가 발생하여 반복문이 끝난다. 약 21억바퀴를 돌게된다. 
//		for(int i=0; i<10; i--) {
//			System.out.println("실행문");
//		}
		
		//고의로 무한루프 생산하기
//		for(int i=0; true; i++) {
//		for(int i=0; ; i++){
//		for(;;) {
//			System.out.println("실행문");
//		}
		
		//사용자가 숫자 입력 x ?번 > 합 구하기
		//- 반복 횟수 미정 > 무한 루프
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for(;;) {
			
			//숫자: 0 > 그만 입력하고 싶다라고 가정한다.
			System.out.print("숫자: "); //콘솔에서 줄바꿈이 생기는건 사용자 입력시 엔터를 눌러서이다...
			int num = Integer.parseInt(reader.readLine());
			
			if(num == 0) {
				break;
			}
			
			sum += num;
			
		}
		
		System.out.println(sum);
		
		/*
		 * for(;;){
		 * 		게임실행코드;
		 * }
		 */
		
	}

	private static void m8() throws NumberFormatException, IOException {
		
		//요구사항] 사용자 보고싶은 구구단 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("단(2~9): ");
		int dan = Integer.parseInt(reader.readLine()); //read.readLine()의 반환값은 항상 String타입이기 때문에 int로 형변환을 해주고 있다.
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\r\n", dan, i, dan*i);
		}
		
	}

	private static void m7() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 사용자 숫자 10개 입력 > 수의 합
		int sum = 0;
		
		for(int i=0; i<10; i++) {
			
			System.out.println("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			sum += num;
		}
		
		System.out.println(sum);
		
	}

	private static void m6() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 사용자 숫자 입력 >1~사용자입력숫자까지의 합
		System.out.println("숫자: ");
		
//		String input = reader.readLine();
//		int num = Integer.parseInt(input);
		
		int num = Integer.parseInt(reader.readLine());
		int sum = 0; //누적변수
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.printf("1 ~ %,d = %,d\r\n", num, sum); //,는 숫자 구분자 출력이다.
		
	}

	private static void m5() {
		
		//요구사항] 1~10까지의 합
		
		int sum = 0; //누적 변수
//		sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		
		for(int i=1; i<=10; i++) {
			sum += i; //sum = sum + i 와 같다.
		}
		
		System.out.println(sum);
		
	}

	private static void m4() {
		
		//반복문
		//1. 반복 횟수 > 10
		//2. 루프 변수 > 90 난이도 > 루프 변수 값의 변화(*****)
		
		//요구사항] 숫자 1~10까지 출력
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println();
		
		
		int num = 1;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		System.out.println();
		
		
		num = 1;
		
		for(int i=0; i<10; i++) {
			System.out.println(num + "," + i);
			num++;
		}
		System.out.println();

		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		for(int i=1; i<=10; i+=2) { //i=i+2 -> i+=2
			System.out.println(i);
		}
		System.out.println();
		
	}

	private static void m3() {

		//반복문
		//1. 반복 횟수 > 10
		//2. 루프 변수 > 90 난이도
		
		//5회 반복인 것을 가시적으로 볼 수 있으므로 가장 많이 쓰이는 형태
		for(int i=0; i<5; i++) {
			//0, 1, 2, 3, 4
			System.out.println("실행문1");
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			//0, 1, 2, 3, 4
			System.out.println("실행문2");
		}
		System.out.println();
		
		for(int i=1; i<6; i++) {
			//0, 1, 2, 3, 4
			System.out.println("실행문3");
		}
		System.out.println();

		for(int i=0; i<25; i+=5) {
			//0, 5, 10, 15, 20
			System.out.println("실행문4");
		}
		
		
		
		System.out.println();
		
		//무한반복이지만 재귀호출이 아니라 메모리를 계속 할당하는 것은 아니기 때문에 컴파일러도 안잡고 런타임에러도 안나고 실행되어버린다.
//		for(int i=0; i<5; i--) {
//			System.out.println("실행문");
//		}
//		System.out.println();
		
	}

	private static void m2() {

		//지역 변수
		//- 메서드/제어문 내에서 선언한 변수
		
		int a = 10; //지역 변수(m2)
		System.out.println("a: " + a);
		
		int c = 0; //여기를 int c;로 하면 컴파일러는 아래 if문이 true인지 false인지 모르기때문에 c값이 초기화가 안될수 있다고 생각하여 에러가 난다. 
				   //컴파일러 입장에서는 그냥 int변수와 int상수를 비교하는구나만 알고있다.
		
		if(a > 0) {
			
			int b = 20;
			System.out.println("b: " + b);
			System.out.println("a: " + a);
			
			c = b;
		}
		
		//위 if문의 b는 지역변수이므로 if문이 종료될때 소멸했다.
		System.out.println("b: " + c); 
		System.out.println("a: " + a);
		
	}

	private static void m1() {

		//요구사항] "안녕하세요." x 5회 출력
		//수정사항] "반갑습니다."로 수정
		//추가사항] "반갑습니다." x 100회 출력
		
		//Case A.
		System.out.println("안녕하세요"); //복사 > Ctrl + Alt + 방향키(아래,위)
		System.out.println("안녕하세요"); //삭제 > Ctrl + D
		System.out.println("안녕하세요"); //이동 > Alt + 방향키(아래, 위)
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println();

		//Case B.
		hello();
		hello();
		hello();
		hello();
		hello();
		System.out.println();
		
		//Case C.
		//- i: 루프(Loop) 변수
		//- 초기식: 루프 변수 초기화
		//- 조건식: 루프 반복을 위한 조건
		//- 증감식: 루프 조건에 대한 변화
		//i는 지역변수이므로 반복문 끝나고 소멸한다.
		for (int i=0; i<100; i++) {
			System.out.println("안녕하세요");
		}
		
	}
	
	

	private static void hello() {
		
		System.out.println("안녕하세요");

	}
}
