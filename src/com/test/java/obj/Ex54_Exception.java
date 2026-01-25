package com.test.java.obj;

import java.util.Random;
import java.util.Scanner;

public class Ex54_Exception {

	public static void main(String[] args) { //main메서드는 예외를 던져서는 안된다!!
		
		/*
		 * 예외, Exception
		 * - 런타임 오류
		 * - 컴파일(X) > 실행(O)
		 * - 테스터 or 개발자 > 경험 근거 > 미리 예측 > 사전 조치
		 * 
		 * 예외 처리, Exception Handling
		 * 1. 제어문 사용
		 * 2. 전용문 사용
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
//		try {
//			m5();
//		} catch (Exception e) {
//			//e.printStackTrace();
//			System.out.println("예외처리");
//		}
		m6();
		
	}

	private static void m6() {
		
		//예외 던지기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자(짝수만): ");
		int n = sc.nextInt();
		
		if(n%2 == 0) { //예외 조건
			System.out.println("짝수: " + n); //비즈니스 코드
		} else {
			System.out.println("홀수 입력 불가!!"); //예외 처리 코드
		}
		
		try { //try catch문은 문법적 오류를 발견하는데는 좋지만 논리적 오류를 발견하는데는 적합하지 않다.
			
			if(n%2 == 1) { //논리적 오류 발견하기 위해 추가.
				throw new Exception(); //예외 던지기
			}
			
			System.out.println("짝수: " + n);
		} catch (Exception e) {
			System.out.println("홀수 입력 불가!!");
		}
		
	}

	private static void m5() throws Exception{
		
		//예외 미루기
		//- 특정 메서드내에 발생한 예외를 해당 메서드내에서 직접 처리하지 않고, 그 예외 처리에 대한 책임을 이 메서드를 호출한 쪽으로 넘기는 기술 //"본사에 문의하세요!"
		int n = 0;
		System.out.println(100 / n);
		
	}

	private static void m4() {
		
		int n = 10; //사용자 입력
		
		try { //업무영역
			//엑셀 + 파일 열기
			System.out.println(100 / n);
			
			//return; //빈 리턴문(값을 돌려줌X, 메서드 종료O)
			
		} catch (Exception e) {
			System.out.println("예외처리");
		} finally { //클린 코드 영역(자원 해제 코드 주로 작성하게됨)
			//무조건 실행 블럭(성공/실패)
			System.out.println("finally");
			//엑셀 + 파일 닫기 -> 위에 두번 적어야하는걸 여기서 한번만 적으면 끝.
		}
		
		//System.out.println("엑셀 + 파일 닫기");
		
		System.out.println("종료");
		
	}

	private static void m3() {

		//가독성이 좋고, 연관된 코드인 경우 묶는게 좋다.
		try {
			
			int num = 10;
			System.out.println(100/num); //throw new ArithmeticException()
			
			int[] nums = { 10, 20, 30 };
			System.out.println(nums[0]); //throw new ArrayIndexOutOfBoundsException()
			
			Random rnd = null;
			System.out.println(rnd.nextInt()); //throw new NullPointerException()
			
		} catch (ArithmeticException e) { //XXX_Exception끼리 형변환이 되지 않기 때문에 적합한 Exception 인스턴스만을 받는다.
			System.out.println("0으로 나누기 > 김대리 연락");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 오류 > 박과장 연락");
		} catch (NullPointerException e) {
			System.out.println("널 참조 오류 > 최부장 연락");
		} catch (Exception e) { //XXX_Exception들의 부모 //예상되지 못한 에러 발생시 안전장치
			System.out.println("예외 발생");
		}
		
	}

	private static void m2() {
		
		int num = 0;
		try {
			System.out.println(100/num);
		} catch(Exception e) {
			System.out.println("0으로 나누기 > 김대리 연락"); //"이 화면이 계속되면 아래의 연락처로 연락하세요."
		}
		
		int[] nums = { 10, 20, 30 };
		try {
			System.out.println(nums[5]);
		} catch(Exception e) {
			System.out.println("배열 첨자 오류 > 박과장 연락");
		}
		
		Random rnd = null; //new Random();
		try {
			System.out.println(rnd.nextInt());
		} catch(Exception e) {
			System.out.println("널 참조 오류 > 최부장 연락");
		}
		
	}

	private static void m1() {
		
		//요구사항] 숫자를 입력받아 산술 연산을 하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자: ");
		int num = sc.nextInt();
		
		//System.out.println(100 / 0); //java.lang.ArithmeticException: / by zero
		//System.out.println(100 / 0.0); //Infinity
		
		//선조건 > 후처리
		if(num != 0) { //예외 조건
			//비즈니스 코드(업무 코드) -> 원래 하려던 메인행동
			System.out.println(111);
			System.out.printf("100 / %d = %d\r\n", num, 100 / num);
			System.out.println(222);
		} else {
			//예외 처리 코드
			System.out.println("0을 입력하지 마시오.");
		}
		
		
//		if(num == 0) { //예외 조건
//			//예외 처리 코드
//			System.out.println("0을 입력하지 마시오.");
//		} else {
//			//비즈니스 코드(업무 코드) -> 원래 하려던 메인행동
//			System.out.printf("100 / %d = %d\r\n", num, 100 / num);
//		}
		
				
		//try catch문
		//try catch finally문
		//선실행 > (에러 발생) > 후조치
		try {
			//비즈니스 코드(업무 코드)
			System.out.println(111); //무조건 동작되는 코드 -> 주의!
			System.out.printf("100 / %d = %d\r\n", num, 100 / num);
			System.out.println(222);
		} catch(Exception e){
			//예외 처리 코드
			//- Exception e: 예외 발생 상황에 대한 정보 객체
			System.out.println("0을 입력하지 마시오.");
			//System.out.println(e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("종료");
		
		
	}
	
}
