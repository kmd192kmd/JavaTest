package com.test.java.problemsolve;

import java.io.File;

public class Problem115 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 디렉토리 문제\\파일 제거";
		
		File file = new File(path);
		int count = 0;
		
		if(file.exists() && file.isDirectory()) {
			File[] list = file.listFiles();
			
			for(File f : list) {
				if(f.isFile() && f.length() == 0) {
//					if(f.delete()) {
//						count++;
//					} else {
//						System.out.println(f.getName() + " 삭제 실패");
//					}
					System.out.println(f.getName());
					count++;
				}
			}
			
		}
		
		System.out.printf("총 %d개의 파일을 삭제했습니다.", count);
		
	}
	
}
