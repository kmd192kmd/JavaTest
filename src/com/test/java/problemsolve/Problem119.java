package com.test.java.problemsolve;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class Problem119 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 디렉토리 문제\\직원";
		
		File dir = new File(path);
		
		if(dir.exists() && dir.isDirectory()) {
			
			File[] list = dir.listFiles();
			
			// ... 상단 생략 ...

			// 중복 체크용 이름 저장소 (String만 담음)
			ArrayList<String> checkNames = new ArrayList<>();
			ArrayList<String> checkYears = new ArrayList<>();

			for (File f : list) {
			    if (f.isFile()) {
			        String name = f.getName().substring(0, 3);
			        String year = f.getName().substring(4, 8);

			        // 이름 중복 체크
			        if (!checkNames.contains(name)) {
			            checkNames.add(name);
			        }
			        
			        // 연도 중복 체크
			        if (!checkYears.contains(year)) {
			            checkYears.add(year);
			        }
			    }
			}

			// 폴더 생성 루프
			for (File f : list) {
			    if (f.isFile() && f.getName().length() >= 8) {
			        String name = f.getName().substring(0, 3);
			        String year = f.getName().substring(4, 8);

			        // "직원/홍길동/2023" 경로 객체 생성
			        File finalDir = new File(path + "\\" + name + "\\" + year);

			        // mkdirs()는 상위 폴더(이름)가 없으면 그것까지 포함해서 연도 폴더를 만듭니다.
			        if (!finalDir.exists()) {
			            finalDir.mkdirs(); 
			            System.out.println(name + "/" + year + " 폴더 생성");
			        }
			        
			    }
			}
			
			for (File f : list) {
			    if (f.isFile() && f.getName().length() >= 8) {
			        String fileName = f.getName();
			        String name = fileName.substring(0, 3);
			        String year = fileName.substring(4, 8);

			        // 이동할 목적지 경로 (직원/이름/연도/파일명)
			        File destFile = new File(path + "\\" + name + "\\" + year + "\\" + fileName);

			        try {
			            // 파일을 목적지로 이동 (이미 파일이 있다면 덮어쓰기)
			            Files.move(f.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
			            System.out.println(fileName + " -> " + name + "/" + year + " 이동 완료");
			        } catch (IOException e) {
			            System.out.println("이동 실패: " + fileName + " (" + e.getMessage() + ")");
			        }
			    }
			}
			
//			ArrayList<File> arrList = new ArrayList<File>();
//			ArrayList<File> arrList2 = new ArrayList<File>();
//			
//			arrList.add(list[0]);
//			arrList2.add(list[0]);
//			
//			boolean isSame = false;
//			
//			for(int i=0; i<list.length; i++) {
//				
//				isSame = false;
//				for(int j=0; j<arrList.size(); j++) {
//					if(list[i].getName().substring(0, 3).equals(arrList.get(j).getName().substring(0, 3))) {
//						isSame = true;
//						break;
//					}
//				}
//				if(!isSame) {
//					arrList.add(list[i]);
//				}
//			}
//			
//			for(File f : list) {
//				
//				String name = f.getName().substring(4, 8);
//				
//				if(!arrList2.contains(name)) {
//					arrList2.add(f);
//				}
//			}
//			
//			for(File f : arrList) {
//				
//				path = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터"
//						+ "\\파일입출력\\파일 디렉토리 문제\\직원\\" + f.getName().substring(0, 3);
//				
//				dir = new File(path);
//				
//				if(!dir.exists()) {
//					if(dir.mkdir()) {
//						System.out.println("폴더를 생성했습니다.");
//					} else {
//						System.out.println("폴더 생성에 실패했습니다.");
//					}
//				} else {
//					System.out.println("이미 폴더가 존재합니다.");
//				}
//				
//			}
//			
//			for(File f : arrList2) {
//				
//				path = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터"
//						+ "\\파일입출력\\파일 디렉토리 문제\\직원\\" + f.getName().substring(4, 8);
//				
//				dir = new File(path);
//				
//				if(!dir.exists()) {
//					if(dir.mkdir()) {
//						System.out.println("폴더를 생성했습니다.");
//					} else {
//						System.out.println("폴더 생성에 실패했습니다.");
//					}
//				} else {
//					System.out.println("이미 폴더가 존재합니다.");
//				}
//				
//			}
//			
//			for (File f : list) {
//			    if (f.isFile() && f.getName().length() >= 8) {
//			        String name = f.getName().substring(0, 3);
//			        String year = f.getName().substring(4, 8);
//			        
//			        File destFile = new File(path + "\\" + name + "\\" + year + "\\" + f.getName());
//			        
//			        if (f.renameTo(destFile)) {
//			            System.out.println(f.getName() + " 이동 성공");
//			        } else {
//			            System.out.println(f.getName() + " 이동 실패");
//			        }
//			    }
//			}
//			
		}
		
	}
	
}
