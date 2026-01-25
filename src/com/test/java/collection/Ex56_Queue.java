package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex56_Queue {
	
	public static void main(String[] args) {
		
		/*
		 * ADT, Abstract Data Type(추상적 자료형)
		 * - 배열 + 사용법을 용도에 맞게 구현
		 * - Stack
		 * - Queue
		 * 
		 * 
		 * Stack
		 * - 후입선출
		 * - LIFO > Last Input First Output
		 * ex) 메모리구조
		 * ex) 되돌리기(Ctrl+Z), 다시하기(Ctrl+Y) > Stack 두개를 이용하여 만들었다!
		 * ex) 브라우저 > 뒤로가기, 앞으로가기
		 * 
		 * Queue
		 * - 선입선출
		 * - FIFO > First Input First Output
		 * ex) 줄서기
		 */
		
		//m1(); //Stack
		m2(); //Queue
		
	}

	private static void m2() {
		
		//Queue
		Queue<String> queue = new LinkedList<String>(); //인터페이스로 개발되었다.
		
		//1. 요소 추가하기
		//- boolean add(T value)
		queue.add("빨강"); //다른 언어는 enqueue() 많이 씀.
		queue.add("노랑"); 
		queue.add("파랑");
		
		//2. 요소 개수
		System.out.println(queue.size());
		
		//3. 요소 읽기
//		System.out.println(queue.poll()); //dequeue()
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll());
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll());
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll()); //null 반환
		
//		while (queue.size() > 0) {
//			System.out.println(queue.poll());
//		}
		
		//4. 요소 읽기
		System.out.println(queue.peek()); //맨 앞에 훔쳐보기
		
	}

	private static void m1() {
		
		//Stack
		Stack<String> stack = new Stack<String>();
		
		//1. 요소 추가하기
		//- T push(T value)
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		//2. 요소 개수
		System.out.println(stack.size()); //메서드 size()안의 코드와 내용은 각자 다르겠지만 결과적으로 사용법은 같다.(Interface, 추상클래스 <-> final static)
		
		//3. 요소 읽기
		//- T pop
//		System.out.println(stack.pop());
//		System.out.println(stack.size()); //줄어들었다! -> 꺼내서 읽고 사라지게 설계되었음.
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
		
		//System.out.println(stack.pop()); //EmptyStackException
		//System.out.println(stack.size());
		
//		int size = stack.size();
//		
//		for(int i=0; i<size; i++) { //stack.size()을 여기에 바로 쓰면 고정값이 아니다!
//			System.out.println(stack.pop());
//			System.out.println(stack.size());
//		}
		
		
//		while(stack.size() > 0) { //stack 루프돌릴땐 while이 적합하다.
//			System.out.println(stack.pop());
//			System.out.println(stack.size());
//		}
		
		//4. 빈배열
		System.out.println(stack.isEmpty());
		
		//5. 요소 읽기
		System.out.println(stack.peek()); //맨 위에 훔쳐보기
		
		
	}

}
