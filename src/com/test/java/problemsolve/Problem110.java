package com.test.java.problemsolve;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem110 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("파일 경로: ");
		
		String path = sc.nextLine();
		
		File file = new File(path);
		
		if(file.exists() && file.isFile()) {
			
			String fileName = file.getName();
			
			String extension = "";
			
			int lastIndex = fileName.lastIndexOf('.');
			if(lastIndex > 0) {
				extension = fileName.substring(lastIndex + 1);
			}
			
			long bytes = file.length();
			String fileSizeLabel = getFileSize(bytes);
			
			System.out.println("파일명 : " + fileName);
			System.out.println("종류 : " + extension + " 파일");
			System.out.println("파일 크기 : " + fileSizeLabel);
		} else {
			System.out.println("해당 경로에 파일이 존재하지 않습니다.");
		}
		
		sc.close();
		
		
		
	}

	private static String getFileSize(long bytes) {
		
		if(bytes < 1024) return bytes + "B";
		
		String[] units = {"B", "KB", "MB", "GB", "TB"};
		double size = bytes;
		int unitIndex = 0;
		
		while(size >= 1024 && unitIndex < units.length - 1) {
			size /= 1024;
			unitIndex++;
		}
		
		return String.format("%.1f%s", size, units[unitIndex]);
	}
	
}

