package com.test.java.problemsolve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Stack;

public class Problem125 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 입출력 문제\\괄호.java";
		
		Stack<Character> stack = new Stack<Character>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			int c;
			
			while((c = br.read()) != -1) {
				
				char ch = (char)c;
				
				if(ch == '(' || ch == '{') {
					stack.push(ch);
				} else if (ch == ')' || ch == '}') {
					if(stack.isEmpty()) {
						System.out.println("올바르지 않은 소스입니다.");
						return;
					}
					
					char open = stack.pop();
					
					if((ch == ')' && open != '(') || (ch == '}' && open != '{')) {
						System.out.println("올바르지 않은 소스입니다.");
						return;
					}
				}
				
			}
			
			if(stack.isEmpty()) {
				System.out.println("올바른 소스입니다.");
			} else {
				System.out.println("올바르지 않은 소스입니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}


