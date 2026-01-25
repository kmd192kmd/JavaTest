package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("페달 밟은 횟수: ");
		int pedal = sc.nextInt();
		double inch_circumference  = 26 * Math.PI;
		double meter_circumference = inch_circumference * 0.0254;
		double distance = meter_circumference * pedal;
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.\n", pedal, distance);
		
		sc.close();
		
	}
	
}
