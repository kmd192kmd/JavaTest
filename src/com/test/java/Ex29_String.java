package com.test.java;

import java.util.Scanner;

public class Ex29_String {

		public static void main(String [] args) {
			
			/*
			 * 
			 */
			
			//m1();
			//m2();
			//m3();
			//m4();
			//m5();
			//m6();
			//m7();
			//m8();
			//m9();
			//m10();
			//m11();
			//m12();
			m13();
			
		}
		
		private static void m13() {
			
			//문자열 분리
			//- String[] split(String delimiter)
			
			String txt = ",홍길동,아무개,강아지,고양이,병아리,";
			
			//정규 표헌식(Regular Expression)(Regex) 에서 |은 다른 역할이 있어서 ,와 다른 결과가 나온다.
			String[] list = txt.split(","); //구분자는 사라진다. 맨앞은 세지만 맨뒤는 세지않는다.
			
			for(int i=0; i<list.length; i++) {
				System.out.println(i + ":" + list[i]);
			
			}
			
			System.out.println();
			
			
			txt = "강아지,홍길동,아무개,강아지,고양이,병아리,강아지";
			
			list = txt.split("강아지");
				
			for(int i=0; i<list.length; i++) {
					System.out.println(i + ":" + list[i]);
				
				
			}
			
		}

		private static void m12() {
			
			//문자열 치환
			//- String replace(char old, char new)
			//- String replace(String old, String new)
			String txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 홍길동";
			
			System.out.println(txt.replace("홍길동", "아무개")); //전부 찾아서 바꾼다.
			System.out.println(txt.replace("테스트", "아무개"));
			System.out.println(txt.replace("홍길동", "안녕"));
			System.out.println(txt.replace("홍길동", "김"));
			System.out.println(txt.replace("홍길동", ""));
			
			
			//마스킹
			String content = "게시판입니다. 안녕~ 바보";
			String stop = "바보";
			
			//System.out.println(content.indexOf(stop) > -1);
			//System.out.println(content.contains(stop));
			System.out.println(content.replace(stop, "**"));
			
			txt = "	     하나     둘     셋     ";
			//System.out.println(txt.trim());
			System.out.println(txt.replace(" ", "")); //스페이스 말고 탭같은 것을 삭제못함
			
			content = "오늘은 메서드 수업을 진행합니다. 시작~";
			String word = "메서드수업";
			
			if(content.replace(" " , "").contains(word)) { //공백을 미리 삭제하고 찾는 것이 정확도는 떨어질 수 있으나 검색율은 올라간다.
				System.out.println("결과O");
			} else {
				System.out.println("결과");
			}
			
		}

		private static void m11() {
			
			//문자열 검색
			//- indexOf()
			//- lastIndexOf()
			//- startsWith()
			//- endsWith()
			//- boolean contains(String s)
			
			String txt = "안녕하세요. 홍길동입니다.";
			
			System.out.println(txt.indexOf("홍길동") > -1);
			System.out.println(txt.contains("홍길동"));
			
		}

		private static void m10() {
			
			//문자 추출
			//- char charAt(int index)
			
			//문자열 추출
			//- String substring(int beginIndex, int endIndex)
			//- beginIndex: inclusive(포함)
			//- endIndex: exclusive(미포함)
			
			String txt = "가나다라마바사아자차카타파하";
			
			System.out.println(txt.substring(4, 7)); //마지막 index 미포함
			System.out.println(txt.substring(4)); //끝까지 나옴
			System.out.println(txt.substring(5, 6)); //"바"(String)
			System.out.println(txt.charAt(5)); //'바'(char) > 보통 문자코드 값을 추출하기 위해서이다.
			System.out.println();
			
			String jumin = "990108-12345678";
			
			//성별?
			System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
			System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자");
			
			//몇년생?
			System.out.println(jumin.charAt(0) + jumin.charAt(1)); //문자코드 값끼리 더하게 된다.
			System.out.println("" + jumin.charAt(0) + jumin.charAt(1)); //이렇게 하면 되긴 하지만, 2글자 이상 추출할땐 charAt은 지양하자.
			System.out.println(jumin.substring(0, 2));
			
			//몇월생?
			System.out.println(jumin.substring(2, 4));
			
			//몇일생?
			System.out.println(jumin.substring(4, 6));
			
			
			//파일경로
			String path = "C:\\code\\java\\JavaTest\\Ex29_String.java";
			
			//1. 파일명 추출 > Ex29_String.java
			int index = path.lastIndexOf("\\");
			String filename = path.substring(index + 1);
			System.out.println("파일명: " + filename);
			
			//2. 파일명 추출 > 확장자 없는 순수 파일명 > Ex29_String
			index = filename.lastIndexOf(".");
			String filenameWithoutExtension = filename.substring(0, index);
			System.out.println("순수 파일명: " + filenameWithoutExtension);
			
			//3. 확장자 추출 > .java
			String extension = filename.substring(index);
			System.out.println("확장자: " + extension);
			
		}

		private static void m9() {
			
			//패턴 검색
			// - boolean startsWith(String word)
			// - boolean endsWith(String word)
		
			String name = "홍길동";
			
			//이 사람이 '홍'씨? > 네/아니오
			System.out.println(name.charAt(0) == '홍');
			System.out.println(name.indexOf('홍') == 0);
			System.out.println(name.startsWith("홍"));
			System.out.println();
			
			//'동'으로 끝나나요?
			System.out.println(name.charAt(name.length()-1) == '동');
			System.out.println(name.indexOf('동') == name.length()-1);
			System.out.println(name.endsWith("동"));
			System.out.println();
			
			
			//파일 업로드 > 반드시 *.java 만 가능
			
			String filename = "Ex02_DataType.java";
			
			System.out.println(filename.lastIndexOf(".java") == filename.length()-5);
			
			System.out.println(filename.toLowerCase().endsWith(".java"));
			
		}

		private static void m8() {
			
			//대소문자 변환
			//- String toUpperCase()
			//- String toLowerCase()
			
			String word = "Java"; //사용자 입력이라고 가정
			System.out.println(word);
			System.out.println(word.toUpperCase());
			System.out.println(word.toLowerCase());
			
			System.out.println("java".equals("Java"));
			
			//대소문자 구분
			//- 구분O: 정확도 높음, 검색율 낮음
			//- 구분X:
			String content = "오늘 수업은 java입니다.";
			
			//System.out.println(word.toUpperCase());
			//System.out.println(content.toUpperCase()); //대소문자를 통일시켜 구분을 없앴다.
			
			//content = content.toUpperCase();
			
			//메서드 체이닝
			//- 변수.메서드().메서드()
			
			if(content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
				System.out.println("O");
			} else {
				System.out.println("X");
			}
			
			
			if(content.indexOf(word) > -1) {
				System.out.println("O");
			} else {
				System.out.println("X");
			}
			
		}

		private static void m7() {
			
			//게시판 글쓰기 > 금지어!!
			
			String stop = "바보"; //금지어
			String content = "안녕하세요. 저는 자바를 배우는 학생입니다."; //글내용
			
			System.out.println(content.indexOf(stop));
			
			if (content.indexOf(stop) > -1) {
				System.out.println("금지어 발견!!");
			} else {
				System.out.println("글쓰기 완료~");
			}
			
			content = "안녕하세요. 저는 자바를 배우는 학생입니다.";
			String[] stopWords = { "바보" , "멍청이" , "메롱" };
			
			for (int i=0; i<stopWords.length; i++) {
				
				if(content.indexOf(stopWords[i]) > -1) {
					System.out.println("금지어 발견!!");
					break;
				}
				
			}
			
			
			String jumin = "990108-12345678";
			
			System.out.println(jumin.charAt(6) == '-');
			System.out.println(jumin.indexOf('-') == 6);
			
		}

		private static void m6() {
			
			//검색 
			//- int indexOf(char c)
			//- int indexOf(string s) // ctrl + f 검색기능을 indexOf을 이용하여 구현했다.
			//- int indexOf(char c, int beginIndex)
			//- int indexOf(string s, int beginIndex)
			
			String txt = "안녕하세요. 홍길동입니다.";
			int index = -1;
			
			index = txt.indexOf('요');
			System.out.println(index);
			
			index = txt.indexOf('홍');
			System.out.println(index);
			
			index = txt.indexOf('김');
			System.out.println(index);
			System.out.println();
			
			txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히계세요. 홍길동입니다.";
			
			index = txt.indexOf("홍길동"); //7
			System.out.println(index);
			
			index = txt.indexOf("홍길동"); //7
			System.out.println(index);
					
			index = txt.indexOf("홍길동" , 8); //22
			System.out.println(index);
			
			index = txt.indexOf("홍길동" , index+3); //22 //두번째 변수는 시작점을 정한다.
			System.out.println(index);
			
			index = txt.indexOf("홍길동" , index+3); //38
			System.out.println(index);
			
			System.out.println();
			
			//마지막 홍길동 찾기
			index = txt.lastIndexOf("홍길동"); //거꾸로 검색한다.
			System.out.println(index);
			
			index = txt.lastIndexOf("홍길동" , index-1);
			System.out.println(index);
			
		}

		private static void m5() {
			
			//공백(스페이스, 엔터, 탭) 제거
			//- String trim()
			//- 문자열의 시작과 끝에 존재하는 공백 문자를 제거한다.
			//- 사용자 실수 or 불필요한 공백 제거 역할
			
			String txt = "     하나     둘     셋     ";
			
			System.out.printf("[%s]\n" , txt);
			System.out.printf("[%s]\n" , txt.trim());
			
		}

		private static void m4() {
			
			char c1 = 'A'; //문자코드
			System.out.println((int)c1);
			System.out.println((char)65);
			
			//*** 절대 값형과 참조형간의 형변환은 지원 안함
			//String s1 = "A";
			//System.out.println((int)s1);
			
			System.out.println(Integer.parseInt("100")); //"100" > 100 //하나하나 뽑아서 바꾸는 것(파싱)이므로 내부적인 과정이 형변환은 아니긴 하다..
			
			//영단어 입력(소문자)
			Scanner scan = new Scanner(System.in);
			
			System.out.println("단어(소문자): ");
			String word = scan.nextLine();
			
			//java, JAVA, Java, javA..
			
			//영소문자: a(97) ~ z(122) > *** 알파벳 문자코드 시작과 끝 정도는 외워두자!
			
			//Java
			//- J > 74
			//- a >
			//- v
			//- a
			
			boolean flag = true;
			
			for(int i=0; i<word.length(); i++) {
				char c = word.charAt(i);
				//System.out.println((int)c);
				
//				if((int)c >= 97 && (int)c <= 122) {
//					//System.out.println("소문자");
//				} else {
//					//System.out.println("잘못된 문자");
//					flag = false;
//					break;
//				}
				
				
				//***** 유효성 검사는 잘못된 것을 찾는다!!
				if((int)c < 97 || (int)c > 122) {
				//if((int)c < (int)'a' || (int)c > (int)'z') {
				//char 비교 > 문자 코드값 비교
//				if((c < 'a' || c > 'z') 
//						&& (c < 'A' || c > 'Z')
//						&& (c < '0' || c > '9')
//						&& (c != '_')) {
				//if(c < '가' || c > '힣') { //*** 한글은 가 ~ 힣
					flag = false;
					break;
				}
				
			}
			
			System.out.println(flag);
			if(flag) {
				System.out.println("올바른 단어");
			} else {
				System.out.println("잘못된 단어");
			}
			
			
		}

		private static void m3() {
			
			//주민등록번호 입력
			//ex) 990108-1234567
			
			String jumin = "990108-1234567";
			
			if(jumin.charAt(6) == '-') {
				System.out.println("올바른 주민번호");
			} else {
				System.out.println("잘못된 주민번호");
			}
			
		}

		private static void m2() {
			
			//문자열 추출
			//- char charAt(int index)
			//- 문자열에서 원하는 위치의 문자 1개를 추출
			//- Zero-based Index
			
			String txt = "안녕하세요. 홍길동입니다.";
			
			char c = txt.charAt(3);
			System.out.println(c); //세
			
			c = txt.charAt(10);
			System.out.println(c); //입
			
			//java.lang.StringIndexOutOfBoundsException
			//c = txt.charAt(15);
			//System.out.println(c);
			
			//마지막 문자
			c = txt.charAt(txt.length()-1);
			System.out.println(c);
			
		}

		private static void m1() {
			
			//문자열 생성
			//1. 리터럴
			//2. 객체 생성
			
			//String 자료형 = 클래스
			//f3으로 확인해보면 클래스임을 알 수 있다.
			String s1 = "홍길동"; //문자열 리터럴
			String s2 = new String("홍길동"); //이게 정석적인 방법
			
			System.out.println(s1);
			System.out.println(s2);
			
			
			//문자열 길이
			//- int length()
			//- 글자수
			//- 문자열 == char[]
			
			//배열 길이
			//- arr.length
			
			String txt = "홍길동";
			System.out.println(txt.length());
			System.out.println("자바java".length()); //영어1 한글2로 메모리 차지크기로 나타내는 언어도 있음.
			System.out.println("".length());
			
			//유효성 검사
			//- 회원 가입 > 이름 입력
			//- 2~5자 이내로 작성하세요.
			//- 성 + 5글자 정도로 많이 씀
			
			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();
			
			System.out.println(name.length());
			
			if(name.length() >= 2 && name.length() <= 5) {
				System.out.println("올바른 이름");
			} else {
				System.out.println("이름을 2~5자 이내로 입력하세요.");
			}
			
		}
	
}
