package com.test.java.problemsolve;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem84 {
	public static void main(String[] args) {
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		
		String word = "길동";
		
		Pattern p = Pattern.compile(word);
		
		Matcher m = p.matcher(content);
		
		int num = 0;
		
		while(m.find()) {
			num++;
		}
		
		System.out.printf("\'길동\'을 총 %d회 발견했습니다.", num);
	}
}
