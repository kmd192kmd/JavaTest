package com.test.java.problemsolve;

import java.util.Objects;

public class Problem107 {
	
	public static void main(String[] args) {
		
		//배열 생성
		MyHashMap map = new MyHashMap();

		//추가
		map.put("국어", "합격");
		map.put("영어", "불합격");
		map.put("수학", "보류");

		//읽기
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));

		//개수
		System.out.println(map.size());

		//수정
		map.put("영어", "합격");
		System.out.println(map.get("영어"));

		//삭제
		map.remove("영어");
		System.out.println(map.get("영어"));

		//검색(key)
		if (map.containsKey("국어")) {
		      System.out.println("국어 점수 있음");
		} else {
		      System.out.println("국어 점수 없음");
		}

		//검색(value)
		if (map.containsValue("합격")) {
		      System.out.println("합격 과목 있음");
		} else {
		      System.out.println("합격 과목 없음");
		}

		//초기화
		map.clear();
		System.out.println(map.size());
		
	}
	
}

class MyHashMap{
	
	private String[] keyList = new String[10];
	private String[] valueList = new String[10];
	private int size = 0;
	
	void resize() {
		
		String[] temp = new String[keyList.length*2];
		for(int i=0; i<size; i++) {
			temp[i] = keyList[i];
		}
		keyList = temp;
		
		String[] temp2 = new String[valueList.length*2];
		for(int i=0; i<size; i++) {
			temp2[i] = valueList[i];
		}
		valueList = temp2;
	}
	
	String put(String key, String value) {
		
		if(size == keyList.length) {
			resize();
		}
		
		if(containsKey(key)) {
			
			String beforeValue = null;
			
			for(int i=0; i<size; i++) {
				if(Objects.equals(keyList[i], key)) {
					beforeValue = valueList[i];
					valueList[i] = value;
					return beforeValue;
				}
			}
			
		} else {
			keyList[size] = key;
			valueList[size] = value;
			size++;
			return null;
		}
		
		return "error has occured!";
		
	}
	
	String get(String key) {
		
		int index = -1;
		
		for(int i=0; i<size; i++) {
			if(Objects.equals(keyList[i], key)) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			return null;
		} else {
			return valueList[index];
		}
		
	}
	
	int size() {
		
		return size;
		
	}
	
	String remove(String key) {
		
		int index = -1;
		
		for(int i=0; i<size; i++) {
			if(Objects.equals(keyList[i], key)) {
				index = i;
				break;
			}
		}
		
		if(index == -1) return null; 
		
		String value = valueList[index];
		
		for(int i=index; i<size-1; i++) {
			keyList[i] = keyList[i+1];
		}
		keyList[size-1] = null;
		
		for(int i=index; i<size-1; i++) {
			valueList[i] = valueList[i+1];
		}
		valueList[size-1] = null;
		
		size--;
		
		return value;
		
		
	}
	
	boolean containsKey(String key) {
		
		for(int i=0; i<size; i++) {
			if(Objects.equals(keyList[i], key)) {
				return true;
			}
		}
		
		return false;
		
	}
	
	boolean containsValue(String value) {
		

		for(int i=0; i<size; i++) {
			if(Objects.equals(valueList[i], value)) {
				return true;
			}
		}
		
		return false;
		
	}
	
	void clear() {
		
		for(int i=0; i<size; i++) {
			keyList[i] = null;
			valueList[i] = null;
		}
		
		size = 0;
		
	}
	
	void trimToSize() {
		
		if(size != keyList.length) {
			String[] temp = new String[size];
			for(int i=0; i<size; i++) {
				temp[i] = keyList[i];
			}
			keyList = temp;
			
			String[] temp2 = new String[size];
			for(int i=0; i<size; i++) {
				temp2[i] = valueList[i];
			}
			valueList = temp2;
			
		}
		
	}
	
}
