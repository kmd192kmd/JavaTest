package com.test.java;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;

public class Ex73_DateTime {

	public static void main(String[] args) {
		
		/*
		 * 자바 날짜/시간
		 * 1. Date
		 * 2. Calendar
		 * 3. java.time 패키지(JDK 1.8)
		 * 		- LocalDate(날짜)
		 * 		- LocalTime(시간)
		 * 		- LocalDateTime(날짜/시간)
		 * 		- Period(년월일 시간)
		 * 		- Duration(시분초 시간)
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		m7();
		
		
	}//main
	
	
	
	private static void m7() {
		
		//- 시간 - 시간 = 시간
		
		//수업 시작한 지 몇 시간째?
		LocalTime start = LocalTime.of(9, 0, 0);
		LocalTime now = LocalTime.now();
		
		Duration duration = Duration.between(start, now);
		
		System.out.println("수업 경과");
		System.out.println("시간: " + duration.toHours());
		System.out.println("분: " + duration.toMinutes() % 60);
		System.out.println(duration.toSeconds());
		System.out.println(duration.toMillis());
		//System.out.println(duration.getSeconds());
		//System.out.println(duration.getNano());
		
	}



	private static void m6() {
		
		//날짜간의 간격
		//- 시각 - 시각 = 시간
		//- Date, Calendar > getTimeMillis() 차이
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.of(2026, 6, 17);
		
		Period remainDays = Period.between(start, end);
		
		System.out.println(remainDays); //P4M29D
		
		System.out.printf("%d년 %d월 %d일\n"
							, remainDays.getYears()
							, remainDays.getMonths()
							, remainDays.getDays());
		
	}



	private static void m5() {
		
		//시각 비교
		//- Date, Calendar > getTimeMillis() 우위 비교
		
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.of(2026, 1, 10);
		
		System.out.println(d1.isBefore(d2)); //d1 < d2
		System.out.println(d1.isAfter(d2)); // d1 > d2
		System.out.println(d1.isEqual(d2)); // 같은 날짜
		
	}



	private static void m4() {
	
		//연산
		//- Date, Calendar > 가변(Mutable)
		//- java.time > 불변(Immutable)-읽기전용
		
		LocalDate today = LocalDate.now();
		
		LocalDate future =  today.plusDays(100);
		
		LocalDate oneYear = today.plusYears(1);
		
		System.out.println(today);
		System.out.println(future);
		System.out.println(oneYear);
		
		//메서드 체이닝
		LocalDate someday = today.plusYears(1).minusMonths(2).plusDays(5);
		System.out.println(someday);
		
	}



	private static void m3() {
		
		//특정 항목 추출
		//- get(1)
		//- get(Calendar.YEAR)
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now);
		System.out.println(now.getYear());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfWeek().getValue()); //월(1) ~ 토(7)
		
		//국제표준(ISO-8601)
		//- 한주 > 월요일부터 시작
		
		//미국
		//- 한주 > 일요일부터 시작 > LocalDateTime에선 국제표준을 썼다.
		
		
	}



	private static void m2() {
			
		//시각 생성
		//1. 현재 시각 만들기
		LocalDate d1 = LocalDate.now(); //현재 날짜만
		LocalTime t1 = LocalTime.now(); //현재 시간만
		LocalDateTime dt1 = LocalDateTime.now(); //현재 날짜+시간
		
		System.out.println(d1); //toString 오버라이딩되어 있음
		//System.out.printf("%tF\n", d1);
		System.out.println(t1);
		System.out.println(dt1); //2026-01-19T11:50:28.799290300 //국제 표준 표기법
		System.out.printf("%tF %tT\n", dt1, dt1);
		
		//2. 특정 시각 만들기
		LocalDate d2 = LocalDate.of(2026, 12, 25);
		LocalTime t2 = LocalTime.of(12, 3);
		LocalTime t3 = LocalTime.of(12, 3, 10);
		LocalDateTime dt2 = LocalDateTime.of(2026, 12, 25, 12, 3, 10);
		
		System.out.println(d2);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(dt2);
		
	}



	private static void m1() {
		
		// 기존 Date, Calendar 결함 > 변경이 가능하다. > 가변(Mutable) 객체입니다.
		Calendar now = Calendar.getInstance();
		
		System.out.printf("%tF\n", now);
		
		now.add(Calendar.YEAR, 10);
		
		System.out.printf("%tF\n", now);
		
		//년,일은 1부터 시작하는지? > 년,일 > 서수(Index)
		//월이 왜 0부터 시작하는지? > 월 > 서수(X), 열거형(O) //January, February...
		
		System.out.println(now.get(Calendar.MONTH));
		
		
		
	}
	
}
