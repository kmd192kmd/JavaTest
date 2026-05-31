package com.test.java.problemsolve;

import java.util.Objects;

public class Problem107_2 {

	public static void main(String[] args) {
		
		//배열 생성
		MyHashMap_2 map = new MyHashMap_2();

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

class Node {
	
	String key;
	String value;
	Node next;
	
	Node(String key, String value, Node next){
		this.key = key;
		this.value = value;
		this.next = next;
	}
	
}

class MyHashMap_2 {
	
	private Node[] table;
	private int size = 0;
	private static final int INITIAL_CAPACITY = 10;
	
	public MyHashMap_2() {
		this.table = new Node[INITIAL_CAPACITY];
		this.size = 0;
	}
	
	private int getHash(String key) {
		if(key == null) return 0;
		return Math.abs(key.hashCode() % table.length);
		
	}
	
	private void resize() {
		
		Node[] oldTable = table;
		table = new Node[oldTable.length*2];
		size = 0;
		
		for(Node head : oldTable) {
			Node temp = head;
			while(temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}
		
	}
	
	public String put(String key, String value) {
		
		if(size >= table.length * 0.75) {
			resize();
		}
		
		int index = getHash(key);
		Node head = table[index];
		Node temp = head;
		
		while(temp != null) {
			if(Objects.equals(temp.key, key)) {
				String oldValue = temp.value;
				temp.value = value;
				return oldValue;
			}
			temp = temp.next;
		}
		
		Node newNode = new Node(key, value, head);
		table[index] = newNode;
		size++;
		return null;
		
	}
	
	public String get(String key) {
        int index = getHash(key);
        Node temp = table[index];

        while (temp != null) {
            if (Objects.equals(temp.key, key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }
	
	public String remove(String key) {
		
		int index = getHash(key);
		Node temp = table[index];
		Node prev = null;
		
		while(temp != null) {
			if(Objects.equals(temp.key, key)) {
				if(prev == null) {
					table[index] = temp.next;
				} else {
					prev.next = temp.next;
				}
				size--;
				return temp.value;
			}
			prev = temp;
			temp = temp.next;
		}
		return null;
		
	}
	
	public boolean containsKey(String key) {
		
		int index = getHash(key);
		Node temp = table[index];
		
		while(temp != null) {
			if(Objects.equals(temp.key, key)) return true;
			temp = temp.next;
		}
		return false;
		
	}
	
	public boolean containsValue(String value) {
		
		for (Node head : table) {
			Node temp = head;
			while(temp != null){
				if(Objects.equals(temp.value, value)) return true;
				temp = temp.next;
			}
		}
		return false;
		
	}
	
	public int size() {
        return this.size;
    }

    public void clear() {
        table = new Node[INITIAL_CAPACITY];
        size = 0;
    }
    
    public void trimToSize() {
    	
    	if(size == table.length || size == 0) {
    		if(size == 0 && table.length != INITIAL_CAPACITY) {
    			table = new Node[INITIAL_CAPACITY];
    		}
    		return;
    	}
    	
    	Node[] oldTable = table;
    	table = new Node[size];
    	size = 0;
    	
    	for(Node head : oldTable) {
    		Node temp = head;
    		while(temp != null) {
    			put(temp.key, temp.value);
    			temp = temp.next;
    		}
    	}
    	
    }
	
}
































