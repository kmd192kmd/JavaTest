package com.test.java.problemsolve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem120 {

	public static void main(String[] args) {
		
//		String path = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터"
//				+ "\\문제109~126와 데이터\\파일입출력\\파일 입출력 문제\\이름수정.dat";
//		
//		File file = new File(path);
//		
//		if(!file.exists() && file.isFile()) return;
		
		String inputFileName = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\"
				+ "문제109~126와 데이터\\파일입출력\\파일 입출력 문제\\이름수정.dat";
		
		String outputFileName = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\"
				+ "문제109~126와 데이터\\파일입출력\\파일 입출력 문제\\이름수정_변환.dat";
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputFileName));
			BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))){
			
			String line;
			while((line = br.readLine()) != null) {
				String modifiedLine = line.replace("유재석", "메뚜기");
				bw.write(modifiedLine);
				bw.newLine();
			}
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
		} catch (IOException e) {
			System.out.println("파일 처리 중 오류 발생: " + e.getMessage());
		}
		
		
	}
	
}
