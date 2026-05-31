package com.test.java.problemsolve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;

public class Problem122 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 입출력 문제\\성적.dat";
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			ArrayList<String> passedPerson = new ArrayList<String>();
			ArrayList<String> failedPerson = new ArrayList<String>();
			
			String str = "";
			while((str = br.readLine()) != null) {
				
				boolean isPassed = true;
				int sum = 0;
				
				String[] list = str.split(",");
				
				for(int i=1; i<=3; i++) {
					
					int score = Integer.parseInt(list[i]);
					
					if(score < 40) {
						isPassed = false;
					}
					sum += score;
				}
				
				double avg = sum / 3.0;
				
				if(isPassed && avg >= 60) {
					passedPerson.add(list[0]);
				} else {
					failedPerson.add(list[0]);
				}
				
			}
			
			System.out.println("[합격자]");
			for(int i=0; i<passedPerson.size(); i++) {
				System.out.println(passedPerson.get(i));
			}
			
			System.out.println();
			System.out.println("[불합격자]");
			for(int i=0; i<failedPerson.size(); i++) {
				System.out.println(failedPerson.get(i));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
