package com.test.java.problemsolve;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem111 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("폴더: ");
//		
//		String path = sc.nextLine();
//		
//		System.out.println("확장자: ");
//		
//		String extension = sc.nextLine();
//		
//		sc.close();
//		
//		File file = new File(path);
//		
//		ArrayList<String> nameList = new ArrayList<String>();
//		ArrayList<String> exeList = new ArrayList<String>();
//		
//		if(file.exists()) {
//			
//			File[] list = file.listFiles();
//			
//			for(File f : list) {
//				if(f.isFile()) {
//					nameList.add(f.getName());
//				}
//			}
//			
//		}
//		
//		for(int i=0; i<nameList.size(); i++) {
//			exeList.add(nameList.get(i).toLowerCase().substring(nameList.get(i).lastIndexOf('.')+1));
//		}
//		
//		for(int i=0; i<exeList.size(); i++) {
//			if(exeList.get(i).equals(extension.toLowerCase())) {
//				System.out.println(nameList.get(i));
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("폴더: ");
		String path = sc.nextLine();
		
		System.out.println("확장자: ");
		String ext = sc.next().toLowerCase();
		
		File dir = new File(path);
		
		if(dir.exists() && dir.isDirectory()) {
			File[] list = dir.listFiles();
			
			if(list != null) {
				for(File file : list) {
					if(file.isFile()) {
						String fileName = file.getName();
						if(fileName.toLowerCase().endsWith("." + ext)) {
							System.out.println(fileName);
						}
					}
				}
			}
		} else {
			System.out.println("유효하지 않은 폴더 경로입니다.");
		}
		
		sc.close();
		
	}
	
}
