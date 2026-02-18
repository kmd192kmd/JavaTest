package com.test.java.problemsolve;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem103 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력: ");
		
		String str = sc.nextLine();
		String[] list = str.split("\\s+");
		
		int countNum = 0;
		int countChar = 0;
		int countMix = 0;
		
		String numRegex = "^\\d+$$";
		String charRegex = "^[가-힣a-zA-Z.]+$";
		String mixRegex = "^(?=.*[0-9])(?=.*[가-힣a-zA-Z.]).+$";
		
		for(String word : list) {
			if(word.matches(numRegex)) {
				countNum++;
			} else if(word.matches(charRegex)) {
				countChar++;
			} else if(word.matches(mixRegex)){
				countMix++;
			}
		}
			
		System.out.printf("[결과]\n"
				+ "숫자: %d개\n"
				+ "문자: %d개\n"
				+ "혼합: %d개", countNum, countChar, countMix);
		
	}
	
}
