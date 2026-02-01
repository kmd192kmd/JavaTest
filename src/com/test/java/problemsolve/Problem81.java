package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem81 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이메일: ");
		String str = sc.nextLine();
		
//		int at = -1; 
//		
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == '@') {
//				at = i;
//			}
//		};
//		
//		System.out.println("아이디: " + str.substring(0, at));
//		System.out.println("도메인: " + str.substring(at + 1));
		
//		String[] parts = str.split("@");
//
//		if (parts.length == 2) {
//		    System.out.println("아이디: " + parts[0]);
//		    System.out.println("도메인: " + parts[1]);
//		}
		
		int at = str.lastIndexOf("@");

		if (at != -1) {
		    System.out.println("아이디: " + str.substring(0, at));
		    System.out.println("도메인: " + str.substring(at + 1));
		}
		
	}
}
