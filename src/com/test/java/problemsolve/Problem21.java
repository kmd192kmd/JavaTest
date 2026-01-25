package com.test.java.problemsolve;

import java.util.Calendar;
import java.util.Scanner;

public class Problem21 {

	public static void main(String[] args) {
		
		int birthYear;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도: ");
		birthYear = sc.nextInt();
		
		Calendar now = Calendar.getInstance();
		age = now.get(Calendar.YEAR) - birthYear + 1;
		
		System.out.printf("나이: %d세", age);
		
		
	}
	
}
