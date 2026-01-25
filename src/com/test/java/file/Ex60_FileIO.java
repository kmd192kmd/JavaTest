package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Ex60_FileIO {

	public static void main(String[] args) {
		
		/*
		 * 파일 입출력
		 * - 자바 프로그램 > (데이터) > 보조 기억장치(HDD,SSD): 쓰기(출력,저장)
		 * - 자바 프로그램 < (데이터) < 보조 기억장치(HDD,SSD): 읽기(입력,로드)
		 * 
		 * 저장 장치
		 * - 데이터 1,0으로 저장
		 * - 데이터의 자료형 없음
		 * 
		 * 인코딩, Encoding
		 * - 문자 코드(응용 프로그램 데이터)을 부호화(0,1)
		 * - 자바 프로그램 (String, "홍길동") > 텍스트 파일(1011101101010101010101)
		 * 
		 * 디코딩, Decoding
		 * - 부호 데이터를 문자 코드로 변환 시키는 작업
		 * - 텍스트 파일(1011101101010101010101) > 자바 프로그램 (String, "홍길동")
		 * 
		 * 문자셋, 코드셋, 코드페이지, 인코딩(디코딩) 방식
		 * - 데이터를 변환하는 규칙
		 * - 한글 관련..
		 * 
		 * 1. ANSI
		 * 2. UTF
		 *     - UTF-8
		 *     - UTF-16
		 * 3. ISO-8859-1
		 * 4. EUC-KR
		 * 5. MS949(CP949)
		 * 
		 * 
		 * ANSI(ISO-8859-1, EUC-KR, MS949) -> 한국어를 쓰는 입장에서는 같다고 할 수 있음.
		 * - 영어(숫자, 특수문자, 서유럽 문자 - 아스키코드): 1byte
		 * - 한글(한자, 일본어 등): 2byte
		 * 
		 * UTF-8 > 표준
		 * - 영어(숫자, 특수문자, 서유럽 문자 - 아스키코드): 1byte
		 * - 한글(한자, 일본어 등): 3byte > 읽어오는 byte 숫자가 다르면 글자가 깨진다. ex)1011 1100 1010 0111 -> 101111 001010 0111
		 * 
		 * UTF-16
		 * - 영어(숫자, 특수문자, 서유럽 문자 - 아스키코드): 2byte > 영어권에서는 안좋아한다.
		 * - 한글(한자, 일본어 등): 2byte
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		m9();
		
	}

	private static void m9() {

		//성적표 출력
		//- 성적 > 파일(score.dat) > 데이터 저장 구조(스키마)
		//- 이름, 국어, 영어, 수학 > 총점, 평균
		//- 홍길동,100,90,80 > CSV(comma seperated value)
		
		System.out.println("=============================================");
		System.out.println("                   성적표");
		System.out.println("=============================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		try {
			
			//자원 경로
			//1. 절대 경로
			//	- 드라이브명으로 시작
			//2. 상대 경로
			//	- 현재 폴더(나)로 시작
			//	- .\\나머지 경로
			
			//String path = "C:\\Users\\user\\Downloads\\JavaTest\\JavaTest(1.11)\\data\\score.dat";
			
			//File dir = new File("."); //현재 폴더 참조
			//System.out.println(dir.getAbsolutePath());
			
			String path = ".\\data\\score.dat";
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				//홍길동,100,90,80
				//System.out.println(line);
				
				String[] temp = line.split(",");
				
				String name = temp[0];
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				int total = kor + eng + math;
				double avg = total / 3.0;
				
				System.out.printf("%4s\t%4d\t%4d\t%4d\t%4d\t%4.1f\n"
						, name
						, kor
						, eng
						, math
						, total
						, avg);
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Ex60_FileIO.m9() 예외 발생");
			e.printStackTrace();
		}
		
	}

	private static void m8() {
		
		//읽기 전용 메모장(자바 소스 전용)
		try {
			
			//파일명 입력 > 스트림 > 읽기 + 출력
			Scanner sc = new Scanner(System.in);
			System.out.println("파일명: ");
			String fileName = sc.nextLine();
			
			String path = "C:\\Users\\user\\Downloads\\JavaTest\\JavaTest(1.11)\\src\\com\\test\\java\\";
			
			BufferedReader reader = new BufferedReader(new FileReader(path + fileName));
			
			String line = null;
			int number = 1; //줄번호
			
			while((line = reader.readLine()) != null) {
				System.out.printf("%3d: %s\n", number, line);
				number++;
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Ex60_FileIO.m8() 예외 발생");
			e.printStackTrace();
		}
		
	}

	private static void m7() {
		
		//텍스트 파일 읽기 > BufferedReader
		//텍스트 파일 쓰기 > BufferedWriter or FileWriter(BufferedWriter가 file I/O에 대해서는 그렇게 강력하지 않음.)
		
		//try-with-resources
		//- JDK 7 ~ 
		//- 자원을 자동으로 반납해주는 try문(자동으로 close() 호출)
		try(BufferedReader reader = new BufferedReader(new FileReader("C:\\code\\java\\file\\user.txt")); 
				BufferedReader reader2 = new BufferedReader(new FileReader("C:\\code\\java\\file\\user.txt"));
				BufferedReader reader3 = new BufferedReader(new FileReader("C:\\code\\java\\file\\user.txt"))) {
			
//			String line = reader.readLine();
//			System.out.println(line);
//			
//			line = reader.readLine();
//			System.out.println(line);
//			
//			line = reader.readLine();
//			System.out.println(line);
//			
//			line = reader.readLine();
//			System.out.println(line);
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			
			//reader.close();
			
		} catch (Exception e) {
			System.out.println("Ex60_FileIO.m7() 예외 발생");
			e.printStackTrace();
		}
		
	}

	private static void m6() {
		
		//FileOutputStream > FileWriter > BufferedWriter
		//FileInputStream > FileReader > BufferedReader
		
		//클래스 사용자 입장
		//1. InputStreamReader > 키보드 입력 도구 > 메서드A()
		//2. FileReader        > 텍스트 입력 도구 > 메서드B()
		
		//1. BufferedReader(InputStreamReader) > nextLine()
		//2. BufferedReader(FileReader) > nextLine()
		//※ 추상화 하였다. -> 상황에 따라 좋은 것이지, 항상 좋은 것은 아니다.
		
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader reader2 = new BufferedReader(new FileReader("text.txt"));
		
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\code\\java\\file\\user.txt"));
			
			writer.write("홍길동");
			writer.write("\r\n");
			writer.write("아무개");
			writer.newLine();
			writer.write("고양이");
			
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex60_FileIO.m6() 예외 발생");
			e.printStackTrace();
		}
		
	}

	private static void m5() {

		try {
			
			//파일 읽기
			//- FileInputStream > FileReader
			//1. 문자 단위 읽기(2byte) > 한글 가능
			//2. 문자열 지원(X) > 한 문자씩 읽기
			
			FileReader reader = new FileReader("C:\\code\\java\\file\\클래스.txt");
			
			int code = -1;
			
			//code = reader.read();
			//System.out.println((char)code);
			
			while((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Ex60_FileIO.m5() 예외 발생");
			e.printStackTrace();
		}
		
	}

	private static void m4() {
		
		try {
			
			//쓰기 전용 메모장
			Scanner sc = new Scanner(System.in);
			
			//파일명 입력 > 스트림 객체 > 파일 쓰기
			System.out.println("파일명: ");
			String fileName = sc.nextLine();
			
			FileWriter writer = new FileWriter("C:\\code\\java\\file\\" + fileName);
			
			while(true) {
				System.out.println("> ");
				String line = sc.nextLine();
				
				if(line.equals("wq")) { //write & quit -> 저장 & 나가기
					break;
				}
				
				writer.write(line);
				writer.write("\r\n");
			}
			
			writer.close();
			System.out.println("저장되었습니다.");
			
		} catch (Exception e) {
			System.out.println("Ex60_FileIO.m4() 예외 발생");
			e.printStackTrace();
		}
		
	}

	private static void m3() {
		
		try {
			
			//파일 쓰기
			//- FileOutputStream > FileWriter
			//1. 문자 단위 쓰기 지원(2byte) > 한글 가능
			//2. 문자열 쓰기 지원
			
			FileWriter writer = new FileWriter("C:\\code\\java\\file\\list.txt");
			
			writer.write(65);
			writer.write('가');
			writer.write("홍길동입니다.");
			
			writer.close();
			
			System.out.println("종료");
			
			
		} catch (Exception e) {
			System.out.println("Ex60_FileIO.m3() 예외 발생");
			e.printStackTrace();
		}
		
	}

	private static void m2() {

		//파일 읽기
		//- 읽기 스트림 객체
		
		try {
			
			//- FileOutputStream
			//- FileInputStream
			
			FileInputStream stream = new FileInputStream("C:\\code\\java\\file\\number.txt");
			
			//int code = System.in.read();
			
//			int code = stream.read();
//			System.out.print((char)code);
//			
//			code = stream.read();
//			System.out.print((char)code);
//			
//			code = stream.read();
//			System.out.print((char)code);
//			
//			code = stream.read();
//			System.out.print((char)code);
//			
//			code = stream.read();
//			System.out.print((char)code);
//			
//			code = stream.read();
//			System.out.print((char)code);
//			
//			code = stream.read();
//			System.out.print((char)code);
			
			
			//기억해두자!!! 자주 써먹을 수 있다.
			int code = -1;
			
			while((code = stream.read()) != -1) {
				System.out.println((char)code);
			}
			
			stream.close(); //꼭 닫아주어야 한다.
			
			
		} catch (Exception e) {
			System.out.println("Ex60_FileIO.m2() 예외 발생");
			e.printStackTrace();
		}
	
	}

	private static void m1() {
		
		//파일 쓰기
		//- 쓰기 스크림 객체
		
		//쓰기 모드
		//1. Create Mode(default)
		//- 파일이 없으면 > 새로 생성
		//- 파일이 있으면 > 덮어쓰기
		//2. Append Mode
		//- 파일이 없으면 > 새로 생성
		//- 파일이 있으면 > 이어쓰기
		
		try {
	
			File file = new File("C:\\code\\java\\file\\number.txt");
			
			//스트림 객체 생성(열기)
			//- FileOutputStream
			FileOutputStream stream = new FileOutputStream(file, true);
			
			//쓰기
			//stream.write(65); //문자 코드값으로 저장
			//stream.write(66);
			//stream.write(67);
			//stream.write((int)'D');
			//stream.write('E');
			//stream.write('F');
			//stream.write('가'); //1byte로 끊어서 읽기 때문에 깨진다.
			//stream.write('나');
			//stream.write('다');
			
			String txt = "Hello~";
			
			System.out.println(Arrays.toString(txt.getBytes()));
			
			stream.write(txt.getBytes());
			
			//스트림 닫기
			stream.close();
			
			
		} catch (Exception e) { //코드 조각 등록!!
			System.out.println("Ex60_FileIO.m1() 예외 발생");
			e.printStackTrace();
		}
	}
	
}
