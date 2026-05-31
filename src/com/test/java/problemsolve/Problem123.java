package com.test.java.problemsolve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Problem123 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 입출력 문제\\단일검색.dat";	
		
		try (Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			System.out.println("이름: ");
			
			String name = sc.nextLine();
			
			String str = "";
			
			boolean isFound = false;
			
			while((str = br.readLine()) != null) {
				
				String[] list = str.split(",");
				
				if(list[1].equals(name)) {
					
					System.out.println("["+ list[1] +"]");
					System.out.println("번호: " + list[0]);
					System.out.println("주소: " + list[2]);
					System.out.println("전화:" + list[3]);
					System.out.println();
					
					isFound = true;
					
				}
				
			}
			
			if(!isFound) {
				System.out.println("검색결과 없음");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
