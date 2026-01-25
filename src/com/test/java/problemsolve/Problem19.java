package com.test.java.problemsolve;

import java.util.Calendar;

public class Problem19 {

	public static void main(String[] args) {
		
		nowTime();
		
	}

	private static void nowTime() {
		
		Calendar nowTime = Calendar.getInstance();
		
		int hour = nowTime.get(nowTime.HOUR_OF_DAY);
		int minute = nowTime.get(nowTime.MINUTE);
		int second = nowTime.get(nowTime.SECOND);
		int am_pm = nowTime.get(nowTime.AM_PM);
		String am_pm_str;
		if(am_pm == 0) {
			am_pm_str = "오전";
		} else {
			am_pm_str = "오후";
		}
		
		System.out.printf("현재 시간: %d시 %d분 %d초", hour, minute, second);
		System.out.println();
		System.out.printf("현재 시간: %s %d시 %d분 %d초", am_pm_str, hour, minute, second);
		
	}
	
}
