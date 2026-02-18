package com.test.java.problemsolve;

import java.util.ArrayList;

public class Problem104 {
	
	public static void main(String[] args) {
	
		//배열 생성
		MyArrayList list = new MyArrayList();

		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");

		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		//개수
		System.out.println(list.size());

		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}

		//수정
		list.set(0, "우하하");
		System.out.println(list.get(0));

		//삭제
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}

		//삽입
		list.add(1, "호호호");
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}

		//검색
		if (list.indexOf("홍길동") > -1) {
		      System.out.println("홍길동 있음");
		} else {
		      System.out.println("홍길동 없음");
		}

		//초기화
		list.clear();
		System.out.println(list.size());
		
	}
	
}

class MyArrayList{
	
	private String[] list = new String[10];
	private int size = 0;
	
	boolean add(String value) {
		
		if(size == list.length){
		
			String[] temp = new String[list.length*2];
			for(int i=0; i<list.length; i++) {
				temp[i] = list[i];
			}
			list = temp;
		}
		list[size] = value;
		size++;
		return true;
		
	}
	
	String get(int index) {
		
		if(index >= list.length) {
			return "index out of bound!";
		}
		
		return list[index];
		
	}
	
	int size() {
		
		return size;
		
	}
	
	String set(int index, String value) {
		
		if(index < 0 || index >= size) {
			return "index out of bound!";
		}
		
		String beforeValue = list[index];
		
		list[index] = value;
		
		return beforeValue;
		
	}
	
	String remove(int index) {
		
		if(index < 0 || index >= size) {
			return "index out of bound!";
		}
		
		String beforeValue = list[index];
		
		for(int i=index; i<size-1; i++) {
			list[i] = list[i+1];
		}
		list[list.length-1] = null;
		size--;
		
		return beforeValue;
		
	}
	
	boolean add(int index, String value) {
		
		if(index < 0 || index > size) {
			System.out.println("index out of bound!");
			return false;
		}
		
		if(size == list.length){
			
			String[] temp = new String[list.length*2];
			for(int i=0; i<list.length; i++) {
				temp[i] = list[i];
			}
			list = temp;
		}
		
		for(int i=size-1; i>=index; i--) {
			list[i+1] = list[i];
		}
		
		list[index] = value;
		size++;
		
		return true;
		
	}
	
	int indexOf(String value) {
		
		for(int i=0; i<size; i++) {
			if(list[i] != null && list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	int lastIndexOf(String value) {
		
		
		for(int i=size-1; i>=0; i--) {
			if(list[i] != null && list[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	void clear() {
		
		list = new String[10];
		size = 0;
		
	}
	
	void trimToSize() {
		
		if(size == list.length) {
			System.out.println("trim이 필요하지 않습니다.");
			return;
		}
		
		String[] temp = new String[size];
		
		for(int i=0; i<size; i++) {
			temp[i] = list[i];
		}
		list = temp;
		System.out.println("trim 완료");
		
	}
	
}