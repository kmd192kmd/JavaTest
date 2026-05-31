package com.test.java.problemsolve;

import java.io.File;

public class Problem114 {
	
	public static void main(String[] args) {
	
		String path = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 디렉토리 문제\\음악 파일\\Music";
		
		File file = new File(path);
		
		if(file.exists() && file.isDirectory()) {
			File[] list = file.listFiles();
			for(int i=0; i<list.length; i++) {
				if(list[i].isFile()) {
					String name = list[i].getName();
					String num = String.format("%03d", i+1);
					String newName = "[" + num + "]" + name;
					File newFile = new File(file, newName);
					if(list[i].renameTo(newFile)) {
						System.out.println("변경 성공: " + newName);
					} else {
						System.out.println("변경 실패: " + name);
					}
				}
			}
		}
		
	}
	
}
