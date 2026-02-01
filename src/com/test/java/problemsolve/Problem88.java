package com.test.java.problemsolve;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem88 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력: ");
		String str = sc.nextLine();
		
		String ban = "바보, 멍청이";
		
		String[] list = ban.split(",");
		
		int count = 0;
		
		String mask;
		
		for(int i=0; i<list.length; i++) {
			
			String regex = "";
            for (int j = 0; j < list[i].length(); j++) {
                regex += list[i].charAt(j);
            }
			
			Pattern p = Pattern.compile(regex);
			
			Matcher m = p.matcher(str);
			
			mask = "";
			
			for(int j=0; j<list[i].trim().length(); j++) {
				mask = "*" + mask;
			}
			
			while(m.find()) {
				str = str.replaceFirst(list[i].trim(), mask);
				count++;
			}
			
		}
		System.out.println(str);
		System.out.printf("금지어를 %d회 마스킹했습니다.", count);	
		
	}
}

