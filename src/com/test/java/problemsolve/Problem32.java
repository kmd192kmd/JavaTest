package com.test.java.problemsolve;

import java.util.Calendar;
import java.util.Scanner;

public class Problem32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inHour;
		int inMinute;
		int outHour;
		int outMinute;
		double useTime;
		
		System.out.println("[들어온 시간]\n"
				+ "시: ");
		inHour = sc.nextInt();
		
		System.out.println("분: ");
		inMinute = sc.nextInt();
		
		System.out.println("[나간 시간]\n"
				+ "시: ");
		outHour = sc.nextInt();
		
		System.out.println("분: ");
		outMinute = sc.nextInt();
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c1.set(Calendar.HOUR_OF_DAY, inHour);
		c1.set(Calendar.MINUTE, inMinute);
		c1.set(Calendar.SECOND, 0);
		c1.set(Calendar.MILLISECOND, 0);
		
		c2.set(Calendar.HOUR_OF_DAY, outHour);
		c2.set(Calendar.MINUTE, outMinute);
		c2.set(Calendar.SECOND, 0);
		c2.set(Calendar.MILLISECOND, 0);
		
		useTime = (c2.getTimeInMillis() - c1.getTimeInMillis())/1000/60;
		
		if(useTime <= 30 ) {
			System.out.println("주차 요금은 무료입니다.");
		} else {
			System.out.printf("주차 요금은 %,d원입니다.", (int)(Math.ceil((useTime-30) / 10.0)*2000));
		}
		
		sc.close();
		
	}
	
}
