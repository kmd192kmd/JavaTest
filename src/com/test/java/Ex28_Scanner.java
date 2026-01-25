package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex28_Scanner {
	
	public static void main(String[] arg) {
		
		//키보드 입력
		//1. System.in.read()
		//2. BufferedReader 클래스
		//3. Scanner 클래스
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}

	private static void m4() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름: ");
		//입력버퍼 > 엔터를 만나기 전까지 가져와라. 이후 엔터를 처리한다.
		String name = scan.nextLine(); //홍길동
		System.out.println(name);
		
		System.out.println("나이: ");
		//입력버퍼 > 숫자만 가져오고 엔터는 방치
		int age = scan.nextInt();
		System.out.println(age);
		
		//엔터가 남아있다. > 우리가 직접 버린다!! (버퍼를 비운다)
		//scan.nextLine();
		scan.skip("\r\n"); //정석이긴 한데 왠지 위에껄 더 많이 쓴다.
		
		System.out.println("주소: ");
		String address = scan.nextLine(); // \r\n이 남아있기 때문에 > ""
		System.out.println(address);
		
	}

	private static void m3() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이: ");
		int age = scan.nextInt();
		System.out.println(age);
		
		System.out.println("몸무게: ");
		double weight = scan.nextDouble();
		System.out.println(weight);
		
		System.out.println("키: ");
		int height = scan.nextInt();
		System.out.println(height);
		
	}

	private static void m2() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = scan.nextLine();
		System.out.println(name);
		
		System.out.println("주소: ");
		String address = scan.nextLine();
		System.out.println(address);
		
		System.out.println("전화: ");
		String tel = scan.nextLine();
		System.out.println(tel);
		
	}

	private static void m1() {
		
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("문자열: ");
//		String line = scan.nextLine();
//		System.out.println(line);
		
		
		//자료형별로 입력받는 전용 메서드를 제공
		
		System.out.println("숫자: ");
		//int num = Integer.parseInt(reader.readLine());
		int num = scan.nextInt();
		System.out.println(num * num);
		
	}
	
}
