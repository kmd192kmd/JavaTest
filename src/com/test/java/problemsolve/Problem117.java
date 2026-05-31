package com.test.java.problemsolve;

import java.io.File;

public class Problem117 {
	
	static int countFile = 0;
	static int countDir = 0;

	public static void main(String[] args) {
		
		String path = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 디렉토리 문제\\폴더 삭제\\delete";
	
		File dir = new File(path);
		
		if(dir.exists() && dir.isDirectory()) {
			recursion(dir);
		}
		
		if(dir.delete()){
			System.out.println("폴더를 삭제했습니다.");
			System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개입니다.", countDir, countFile);
		} else {
			System.out.println("An error occurred at delete Current Dir");
		}
		
	}

	private static void recursion(File dir) {
		
		File[] list = dir.listFiles();
		
		if(list == null) return;
		
		for(File f : list) {
			if(f.isFile()) {
				if(f.delete()) {
					countFile++;
				} else {
					System.out.println("파일 삭제 실패: " + f.getName());
				}
			} else if(f.isDirectory()) {
				recursion(f);
				if(f.delete()) {
					countDir++;
				} else {
					System.out.println("폴더 삭제 실패: " + f.getName());
				}
			}
		}
		
		
	}
	
}
