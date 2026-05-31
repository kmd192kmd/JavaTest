package com.test.java.problemsolve;

public class Problem106 {

	public static void main(String[] args) {
		
		//배열 생성
		MyStack stack = new MyStack();

		//추가
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");

		//읽기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		//개수
		System.out.println(stack.size());

		//확인
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());

		//크기 조절
		stack.trimToSize();

		//초기화
		stack.clear();
		System.out.println(stack.size());
		
	}
	
}

class MyStack {
	
	private String[] list = new String[10];
	private int size = 0;
	
	private void resize() {
		
		String[] temp = new String[list.length*2];
		for(int i=0; i<size; i++) {
			temp[i] = list[i];
		}
		list = temp;
		
	}
	
	boolean push(String value) {
		
		if(size == list.length) {
			resize();
		}
		
		list[size] = value;
		size++;
		return true;
		
	}
	
	String pop() {
		
		if(size == 0) {
			return null;
		}
		
		String pop = list[size-1];
		
		list[size-1] = null;
		
		size--;
		
		return pop;
		
	}
	
	int size() {
		
		return size;
		
	}
	
	String peek() {
		
		return (size == 0) ? null : list[size-1];
		
	}
	
	void clear() {
		
		for(int i=0; i<size; i++) {
			list[i] = null;
		}
		size = 0;
		
	}
	
	void trimToSize() {
		
		if(size != list.length) {
			String[] temp = new String[size];
			for(int i=0; i<size; i++) {
				temp[i] = list[i];
			}
			list = temp;
		}
	}
	
}
