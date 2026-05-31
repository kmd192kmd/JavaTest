package com.test.java.problemsolve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem124 {

	public static void main(String[] args) {
		
		String order = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 입출력 문제\\검색_주문.dat";
		String member = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 입출력 문제\\검색_회원.dat"; 
		
		try (Scanner sc = new Scanner(System.in);
				BufferedReader br1 = new BufferedReader(new FileReader(order));
				BufferedReader br2 = new BufferedReader(new FileReader(member))){
			
			System.out.println("이름: ");
			
			String name = sc.nextLine();
			
			String address = "";
			
			String count = "";
			
			String num = "";
			
			String merchandise = "";
			
			String str = "";
			
			boolean hasOrders = false;
			
			ArrayList<String[]> arrList = new ArrayList<String[]>();
			
			while((str = br2.readLine()) != null) {
				String[] list = str.split(",");
				if(list[1].equals(name)) {
					num = list[0];
					address = list[2];
					arrList.add(new String[] {list[0], list[2]});
				}
			}
			
			if(arrList.size() == 0) {
				System.out.println("검색 결과 없음");
				return;
			}
			
			System.out.println("====구매내역====");
			// 각 항목에 고정 폭을 지정 (숫자는 데이터 길이에 맞춰 조절하세요)
			// %-8s: 8칸 왼쪽 정렬, %-10s: 10칸 왼쪽 정렬 등
			System.out.printf("%4s\t%-6s\t%-10s\t%-5s\t%-10s\n", 
			                  "[번호]", "[이름]", "[상품명]", "[개수]", "[배송지]");
			
			while((str = br1.readLine()) != null) {
				String[] list = str.split(",");
				
				for(String[] list2 : arrList) {
					
					if(list[3].equals(list2[0])) {
						merchandise = list[1];
						count = list[2];
						
						System.out.printf("%4s\t%-6s\t%-10s\t%-5s\t%-10s\n", 
				                  list2[0], name, merchandise, count, list2[1]);
						hasOrders = true;
					}
				}
			}
			
			if(!hasOrders) {
				System.out.println("주문 내역 없음");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
