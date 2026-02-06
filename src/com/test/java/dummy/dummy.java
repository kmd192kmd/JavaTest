package com.test.java.dummy;

import java.util.Random;

public class dummy {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 프로젝트 진행 > 데이터 필요
		 * - 기초 데이터(강의실..)  + 운영 데이터(개강, 학생..)
		 * - 기초 데이터 > 미리 준비
		 * - 운영 데이터 > 미리 준비
		 * 
		 * - 최소 강의중 강의실 데이터 x 6개 이상 > 25~30명
		 * - 수료반 x 4~5개 > 25~30명
		 * - 학생 수 > 300여명~
		 * 
		 * 
		 * 더미 데이터
		 * 1. 어디서 긁어오기
		 * 		a. 사람
		 * 		b. 프로그램(크롤링)
		 * 2. 제작 프로그램
		 * 		a. 자바
		 * 3. AI
		 * 		a. LLM > 가상 데이터 > 품질 낮음..
		 * 		ex) 학생 100명 > 중복 데이터
		 */
		
		
		//학생 정보 x 100명
		//- tlbStudent 테이블에 추가하기
		//- 학생번호, 이름, 성별, 주소
		
		//- Math.random() > 0.0~0.99
		
	    Random rnd = new Random();
		
//	    System.out.println(rnd.nextDouble()); //Math.random()
//	    System.out.println(rnd.nextInt()); //-21억~21억
//	    
//	    //Integer.parseInt(Math.random() * 10) //0~9
//	    System.out.println(rnd.nextInt(10)); //0~9 정수
//	    
//	    System.out.println(rnd.nextBoolean()); //0, 1 > false, true
		
	    
	    String[] name1 = {"김", "이", "박", "최", "정", "홍", "진", "송", "하", "민" };
	    
	    String[] name2 = {"길", "동", "재", "석", "철", "수", "영", "희", "형", "충", "시", "민" };
	    
	    String[] address1 = {"서울시", "인천시", "수원시", "부산시", "제주시"};
	    String[] address2 = {"강남구", "강서구", "강북구", "강동구", "중구"};
	    String[] address3 = {"역삼동", "대치동", "방배동", "압구정동", "길동"};
	    
	    for(int i=1; i<=100; i++) {
	    	
	    	String gender = "";
	    	
	    	if(rnd.nextBoolean()) {
	    		gender = "m";
	    	} else {
	    		gender = "f";
	    	}
	    	
	    	String name = name1[rnd.nextInt(name1.length)] 
	    				+ name2[rnd.nextInt(name2.length)] 
	    				+ name2[rnd.nextInt(name2.length)];
	    	
	    	String address = address1[rnd.nextInt(address1.length)] 
	    					+ " " + address2[rnd.nextInt(address2.length)] 
	    					+ " " + address3[rnd.nextInt(address3.length)]
	    					+ " " + (rnd.nextInt(200)+1) + "번지";
	    	
	    	String sql = String.format("insert into tblStudent values(%d, '%s', '%s', '%s')", i, name, gender, address);
	    	
	    	System.out.println(sql);
	    	
	    }
	    
	    /*
	     *
	     * 학생 > 300명
	     * - 대부분 데이터 > 검증 필요X
	     * - 일부 데이터(email) > 유효한 데이터
	     * 
	     * 5명 > 실제 이메일 주소로 생성
	     * 
	     * 
	     * 95%(더미) + 5%(테스트)
	     * - 대부분 데이터(분량 용도) > 더미 데이터
	     * - 실제 테스트용(소량 실제) > 실제 데이터
	     */
	    
	}
	
}
