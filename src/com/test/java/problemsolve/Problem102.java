package com.test.java.problemsolve;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Problem102 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 5개 입력: ");
		
		String input = sc.nextLine();
		String[] temp = input.split(" ");
		
		int positiveNum = 0;
		int negativeNum = 0;
		int zeroNum = 0;
		
		for(String s : temp) {
			if(s.isEmpty()) continue;
			
			int num = Integer.parseInt(s);
			if(num > 0) {
				positiveNum++;
			} else if(num < 0) {
				negativeNum++;
			} else {
				zeroNum++;
			}
		}
		
	
		System.out.printf("[결과]\n"
				+ "양수: %d개\n"
				+ "음수: %d개\n"
				+ "0: %d개\n", positiveNum, negativeNum, zeroNum);
		
		int count = temp.length;
		if(count < 5) {
			System.out.printf("숫자가 %d개 부족합니다.\n", 5 - count);
		} else if(count > 5) {
			System.out.printf("숫자가 %d개 많습니다.\n", count - 5);
		}
		
		sc.close();
	}

}
