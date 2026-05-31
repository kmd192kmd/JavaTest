package com.test.java.problemsolve;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem118 {

	static ArrayList<File> arrList = new ArrayList<File>();
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 디렉토리 문제\\크기 정렬";
		
		File dir = new File(path);
		
		if(dir.exists() && dir.isDirectory()) {
			recurse(dir);
		}
		
//		sort(arrList);
		
		arrList.sort((f1, f2) -> Long.compare(f2.length(), f1.length()));
		
		print(arrList);
		
	}

	private static void print(ArrayList<File> arrList) {
		
		System.out.printf("%-25s\t%-10s\t%s\n", "[파일명]", "[크기]", "[파일경로]");
		
		for(File f : arrList) {
			System.out.printf("%-25s\t%-7d KB\t%s\n"
					, f.getName()
					, f.length()/1024
					, f.getParentFile().getName());
		}
		
	}

	private static void sort(ArrayList<File> arrList) {
		
		File max = null;
		
		for(int i=0; i<arrList.size()-1; i++) {
			for(int j=0; j<arrList.size()-1-i; j++) {
				if(arrList.get(j).length() < arrList.get(j+1).length()) {
					File temp = arrList.get(j);
					arrList.set(j, arrList.get(j+1));
					arrList.set(j+1, temp);
				}
			}
		}
		
	}

	private static void recurse(File dir) {
		
		File[] list = dir.listFiles();
		
		if(list == null) return;
		
		for(File f : list) {
			if(f.isDirectory()) {
				recurse(f);
			} else {
				arrList.add(f);
			}
		}
		
		
		
	}
	
}
