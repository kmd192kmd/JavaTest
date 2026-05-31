package com.test.java.problemsolve;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Problem109 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int countNFE = 0;
		int countNegative = 0;
		int countOutofRange = 0;
		int countNone = 0;
		
		while(true) {
		
		System.out.println("숫자 입력(1~100): ");
		String inputStr = sc.nextLine();
		
		try {
			
			if(inputStr.trim().isEmpty()) {
				countNone++;
				throw new NumberFormatException();
			}
			
			int input = Integer.parseInt(inputStr.trim());
			
			if(input == 0) break;
			
			if(input < 0) {
				countNegative++;
				throw new NegativeNumberException();
			}
			
			if(input > 100) {
				countOutofRange++;
				throw new OutofRangeException();
			}
			
			list.add(input);
			
		} catch (NumberFormatException e) {
			if(!inputStr.trim().isEmpty()) {
				countNFE++;
			}
		} catch (NegativeNumberException e) {
			
		} catch (OutofRangeException e) {
			
		};
		
		}
		
		exit(list, countNFE, countNegative, countOutofRange, countNone);
		
		
	}

	private static void exit(ArrayList<Integer> list, int a, int b, int c, int d) {
		
		System.out.println("[연산결과]");
		
		if(list.size() > 0) {
			int sum = 0;
			for(int i=0; i<list.size(); i++) {
				sum += list.get(i);
				System.out.print(list.get(i) + (i == list.size() - 1 ? "" : " + "));
			}
			System.out.print(" = " + sum);
			System.out.println();
		} else {
			System.out.println("연산 결과가 없습니다.");
		}
		
		System.out.println("[예외처리결과]");
		System.out.println("숫자아님: " + a + "회");
		System.out.println("음수입력: " + b + "회");
		System.out.println("범위초과: " + c + "회");
		System.out.println("입력안함: " + d + "회");
	}
}

class NegativeNumberException extends Exception {}
class OutofRangeException extends Exception {}
