package com.test.java.problemsolve;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem85 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호: ");
		
		String str = sc.nextLine();
//		
//		String reg = "[0-9]{6}-?[0-9]{7}";
//		
//		Pattern p = Pattern.compile(reg);
//		
//		Matcher m = p.matcher(str);
//		
//		if(m.find()) {
//			System.out.println("올바른 주민등록번호입니다.");
//		} else {
//			System.out.println("올바르지 않은 주민등록번호입니다.");
//		}
		
	    String jumin = str.replace("-", "");
	    
	    if (jumin.length() != 13) {
	        System.out.println("올바르지 않은 주민등록번호입니다. (길이 오류)");
	        return;
	    }
	    
	    int year = Integer.parseInt(jumin.substring(0, 2));
        int month = Integer.parseInt(jumin.substring(2, 4));
        int date = Integer.parseInt(jumin.substring(4, 6));
        int genderChar = jumin.charAt(6) - '0';

        // 성별 자리를 보고 1900년대인지 2000년대인지 결정
        if (genderChar == 1 || genderChar == 2) year += 1900;
        else if (genderChar == 3 || genderChar == 4) year += 2000;
        else {
            System.out.println("올바르지 않은 주민등록번호입니다. (성별/세기 오류)");
            return;
        }

        // 월/일 범위 검사 (간단 버전)
        if (month < 1 || month > 12) {
            System.out.println("올바르지 않은 주민등록번호입니다. (월 오류)");
            return;
        }
        
        // 각 월의 마지막 날짜 (윤년은 생략하거나 추가 로직 가능)
        int[] lastDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 윤년 처리 (4로 나누어 떨어지면 2월은 29일)
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) lastDays[2] = 29;

        if (date < 1 || date > lastDays[month]) {
            System.out.println("올바르지 않은 주민등록번호입니다. (일 오류)");
            return;
        }
	    
	    // 가중치 배열
	    int[] weight = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
	    int sum = 0;

	    // 공식 적용
	    for (int i = 0; i < 12; i++) {
	        sum += (jumin.charAt(i) - '0') * weight[i];
	    }

	    int lastDigit = jumin.charAt(12) - '0';
	    int check = (11 - (sum % 11)) % 10;


	    if (lastDigit == check) {
	        System.out.println("올바른 주민등록번호입니다.");
	    } else {
	        System.out.println("올바르지 않은 주민등록번호입니다.");
	    }
		
	}
	
}
