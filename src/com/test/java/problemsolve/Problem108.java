package com.test.java.problemsolve;

import java.util.Objects;

public class Problem108 {

	public static void main(String[] args) {
		
		//배열 생성
		MySet list = new MySet();

		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");

		//개수
		System.out.println(list.size());

		//삭제
		list.remove("아무개");

		//개수
		System.out.println(list.size());

		//탐색 + 읽기
		while (list.hasNext()) {
		      System.out.println(list.next());
		}

		//초기화
		list.clear();
		System.out.println(list.size());
		
	}
	
}

class MySetNode{
	
	private String value;
	private MySetNode next;
	
	public MySetNode(String value, MySetNode next) {
		this.value = value;
		this.next = next;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public MySetNode getNext() {
		return next;
	}

	public void setNext(MySetNode next) {
		this.next = next;
	}
	
	
	
}

class MySet{
	
	private MySetNode[] set;
	private static final int INITIAL_CAPACITY = 10;
	private int size = 0;
	private MySetNode currentNode;
	private int currentIndex = 0;
	
	public MySet() {
		this.set = new MySetNode[INITIAL_CAPACITY];
		this.size = 0;
		this.currentNode = null;
		this.currentIndex = 0;
	}

	void resize() {
		
		MySetNode[] oldSet = set;
		set = new MySetNode[oldSet.length*2];
		size = 0;
		
		for(MySetNode head : oldSet) {
			MySetNode temp = head;
			while(temp != null) {
				add(temp.getValue());
				temp = temp.getNext();
			}
		}
		
	}
	
	int getHash(String value) {
		
		if(value == null) return 0;
		return Math.abs(value.hashCode() % set.length);
		
	}
	
	boolean contains(String value) {
		
		int index = getHash(value);
		MySetNode temp = set[index];
		while(temp != null) {
			if(Objects.equals(temp.getValue(), value)) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
		
		
	}
	
	boolean add(String value) {
		
		if(contains(value)) {
			return false;
		}
		
		if(size >= set.length * 0.75) {
			resize();
		}
		
		int index = getHash(value);
		MySetNode newNode = new MySetNode(value, set[index]);
		set[index] = newNode;
		size++;
		return true;
		
		
	}
	
	int size(){
		
		return size;
		
	}
	
	boolean remove(String value) {
		
		int index = getHash(value);
		MySetNode temp = set[index];
		MySetNode prev = null;
		
		while(temp != null) {
			
			if(Objects.equals(temp.getValue(), value)) {
				if(prev == null) {
					set[index] = temp.getNext();
				} else {
					prev.setNext(temp.getNext());;
				}
				size--;
				return true;
			}
			
			prev = temp;
			temp = temp.getNext();
			
		}
		return false;
		
	}
	
	void clear() {
		
		set = new MySetNode[INITIAL_CAPACITY];
		size = 0;
		currentIndex = 0;
		currentNode = null;
		
	}
	
//	boolean hasNext() {
//		
//		if(currentNode != null && currentNode.getNext() != null) {
//			currentNode = currentNode.getNext();
//			return true;
//		}
//		
//		while(currentIndex < set.length) {
//			if(set[currentIndex] != null) {
//				currentNode = set[currentIndex];
//				currentIndex++;
//				return true;
//			}
//			currentIndex++;
//		}
//		
//		currentIndex = 0;
//		currentNode = null;
//		return false;
//		
//	}
//	
//	String next() {
//		
//		return currentNode.getValue();
//		
//	}
	
	boolean hasNext() {
		
		if(currentNode != null) return true;
		
		int tempIndex = currentIndex;
		while(tempIndex < set.length) {
			if(set[tempIndex] != null) {
				return true;
			}
			tempIndex++;
		}
		
		currentIndex = 0;
		return false;
		
	}
	
	String next() {
		
		if(currentNode == null) {
			while(currentIndex < set.length && set[currentIndex] == null) {
				currentIndex++;
			}
			
			if(currentIndex >= set.length) {
				return null;
			}
			
			currentNode = set[currentIndex];
			currentIndex++;
		}
		
		String value = currentNode.getValue();
		
		if(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		} else {
			currentNode = null;
		}
		
		return value;
		
	}
	
}
