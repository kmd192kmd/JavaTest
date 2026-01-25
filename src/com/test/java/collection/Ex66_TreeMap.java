package com.test.java.collection;

import java.util.TreeMap;

public class Ex66_TreeMap {

	public static void main(String[] args) {
		
		//TreeMap = Tree(이진 탐색 구조) + Map(키, 값)
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("red", "사과");
		map.put("orange", "귤");
		map.put("yellow", "바나나");		
		map.put("green", "아보카도");		
		map.put("blue", "블루베리");
		
		System.out.println(map); //Tree > 자동 정렬(key)
		
		System.out.println(map.get("yellow"));
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println(map.headMap("m"));
		System.out.println(map.tailMap("m"));
		System.out.println(map.subMap("c", "m"));
	}
	
}
