package com.test.java.problemsolve;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Problem112 {
	
	public static void main(String[] args) {
		
//		System.out.println("파일 이동을 실행합니다.");
//		
//		String path = "C:\\Users\\a\\Desktop\\coding\\기타\\test2.txt";
//		String path2 = "C:\\Users\\a\\Desktop\\coding\\기타\\test";
//		String path3 = "C:\\Users\\a\\Desktop\\coding\\기타\\test\\test2.txt";
//		
//		File dir = new File(path);
//		File dir2 = new File(path2);
//		File dir3 = new File(path3);
//		
//		if(dir.exists() && dir.isFile() && dir2.exists() && dir2.isDirectory()) {
//			
//			File[] list = dir2.listFiles();
//			
//			for(File f : list) {
//				if(f.isFile()) {
//					if(dir.getName().equals(f.getName())){
//						Scanner sc = new Scanner(System.in);
//						System.out.println("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
//						String choice = sc.nextLine();
//						if(choice.equalsIgnoreCase("y")) {
//							if(dir3.delete()) {
//								dir.renameTo(dir3);
//								System.out.println("y. 파일을 덮어썼습니다.");
//								sc.close();
//								return;
//							} else {
//								System.out.println("파일 이동에 실패했습니다.");
//								return;
//							}
//							
//						} else if(choice.equalsIgnoreCase("n")) {
//							System.out.println("n. 작업을 취소합니다.");
//							sc.close();
//							return;
//						}
//						
//					}
//				}
//			}
//			
//			dir.renameTo(dir3);
//			System.out.println("파일 이동이 완료되었습니다.");
//		} else {
//			System.out.println("유효하지 않은 경로입니다.");
//		}
		
		System.out.println("파일 이동을 실행합니다.");

        File sourceFile = new File("C:\\Users\\a\\Desktop\\coding\\기타\\test2.txt");
        File targetDir = new File("C:\\Users\\a\\Desktop\\coding\\기타\\test");
        File targetFile = new File(targetDir, sourceFile.getName());

        if (sourceFile.exists() && sourceFile.isFile() && targetDir.exists() && targetDir.isDirectory()) {
            
            // 목적지에 파일이 이미 있는지 확인
            if (targetFile.exists()) {
                Scanner sc = new Scanner(System.in);
                System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n): ");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("y")) {
                    try {
                        // nio.file.Files를 사용하여 강제 덮어쓰기 이동
                        Files.move(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("파일을 성공적으로 덮어썼습니다.");
                    } catch (Exception e) {
                        System.out.println("파일 이동 중 오류 발생: " + e.getMessage());
                    }
                } else {
                    System.out.println("작업을 취소합니다.");
                }
                sc.close();
            } else {
                // 파일이 없는 경우 일반 이동
                if (sourceFile.renameTo(targetFile)) {
                    System.out.println("파일 이동이 완료되었습니다.");
                } else {
                    System.out.println("파일 이동에 실패했습니다.");
                }
            }
        } else {
            System.out.println("유효하지 않은 경로이거나 파일이 존재하지 않습니다.");
        }
    }
}
