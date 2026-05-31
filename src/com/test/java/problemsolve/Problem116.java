package com.test.java.problemsolve;

import java.io.File;
import java.util.ArrayList;

public class Problem116 {

	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 디렉토리 문제\\동일 파일\\MusicA";
		
		String path2 = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 디렉토리 문제\\동일 파일\\MusicB";
		
		File file1 = new File(path1);
		
		File file2 = new File(path2);
		
		File[] list1 = null;
		File[] list2 = null;
		
		ArrayList<File> commonList = new ArrayList<File>();
		
		if(file1.exists() && file1.isDirectory()) {
			list1 = file1.listFiles();
			if(list1 == null) return;
		} else {
			System.out.println("An error occured in path1");
			return;
		}
		
		if(file2.exists() && file2.isDirectory()) {
			list2 = file2.listFiles();
			if(list2 == null) return;
		} else {
			System.out.println("An error occured in path2");
			return;
		}
		
		for(int i=0; i<list1.length; i++) {
			for(int j=0; j<list2.length; j++) {
				if(list1[i].getName().equalsIgnoreCase(list2[j].getName())) {
					commonList.add(list1[i]);
					break;
				}
			}
		}
		
		for(int i=0; i<commonList.size(); i++) {
			System.out.println(commonList.get(i).getName());
		}
		
		
	}
	
}
