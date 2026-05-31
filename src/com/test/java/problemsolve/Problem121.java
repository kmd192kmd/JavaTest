package com.test.java.problemsolve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Problem121 {

	public static void main(String[] args) {
		
		String inputFileName = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\"
				+ "문제109~126와 데이터\\파일입출력\\파일 입출력 문제\\숫자.dat";
		
		String outputFileName = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\"
				+ "문제109~126와 데이터\\파일입출력\\파일 입출력 문제\\숫자_변환.dat";
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputFileName));
			BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))){
			
			int data;
			
			HashMap<Character, String> map = new HashMap<Character, String>();
			String[] korNum = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
			
			for(int i=0; i<korNum.length; i++) {
				map.put((char)(i + '0'), korNum[i]);
			}
			
			while((data = br.read()) != -1) {
				
				char ch = (char)data;
				
				if(map.containsKey(ch)) {
					bw.write(map.get(ch));
				} else {
					bw.write(ch);
				}
				
			}
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
		} catch (FileNotFoundException e) {
			System.out.println("원본 파일(숫자.dat)을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일 처리 중 오류 발생: " + e.getMessage());
		}
		
		
	}
		
		
}

