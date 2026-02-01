package com.test.java.problemsolve;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem86 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자: ");
		String input = sc.nextLine();
		String result = "";
		int count = 0;
		
		for(int i=input.length()-1; i>=0; i--) {
			result = input.charAt(i) + result;
			count++;
			
			if(count%3 == 0 && i>0) {
				result = "," + result;
			}
		}
		System.out.println("결과: " + result);
		
//		StringBuilder sb = new StringBuilder(input);
//		        
//		        // 뒤에서부터 3번째 자리마다 콤마 추가
//		        // i > 0 조건을 통해 맨 앞에는 콤마가 붙지 않게 함
//		        for (int i = input.length() - 3; i > 0; i -= 3) {
//		            sb.insert(i, ",");
//		        }
//		
//		        System.out.println("결과: " + sb.toString());
	}
}
