package com.test.java.problemsolve;

import java.util.LinkedList;
import java.util.Queue;

public class Problem105 {
	
	public static void main(String[] args) {
		
		//배열 생성
		MyQueue queue = new MyQueue();
		
		System.out.println(queue.poll());
		
		//추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");

		//읽기
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		//개수
		System.out.println(queue.size());

		//확인
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.size());

		//크기 조절
		queue.trimToSize();

		//초기화
		queue.clear();
		System.out.println(queue.size());
		
	}
	
}

class MyQueue{
	
	private String[] list = new String[10];
	private int size = 0;
	private int front = 0;
	private int rear = 0;
	
	void resize() {
		
		String[] temp = new String[list.length*2];
		for(int i=0; i<size; i++) {
			temp[i] = list[(front + i) % list.length];
		}
		list = temp;
		front = 0;
		rear = size;
		
	}
	
	boolean add(String value) {
		
		if(size == list.length) {
			resize();
		}
		list[rear] = value;
		rear = (rear + 1) % list.length;
		size++;
		return true;
		
		
	}
	
	String poll() {
		
		if(size == 0) {
			return null;
		}
		
		String value = list[front];
		list[front] = null;
	
		front = (front + 1) % list.length;
		size--;
		
		return value;
		
	}
	
	int size() {
		
		return size;
		
	}
	
	String peek() {
		
		if(size == 0) {
			return null;
		}
		
		return list[front];
		
	}
	
	void clear() {
		
		list = new String[10];
		size = 0;
		front = 0;
		rear = 0;
		
	}
	
	void trimToSize() {
		
		if(size == list.length) {
			return;
		}
		
		int newLen = (size == 0) ? 10 : size;
		String[] temp = new String[newLen];
		
		for(int i=0; i<size; i++) {
			temp[i] = list[(front + i) % list.length];
		}
		list = temp;
		front = 0;
		rear = (size == 0) ? 0 : size;
		
	}
	
	
}
