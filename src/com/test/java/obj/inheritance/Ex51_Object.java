package com.test.java.obj.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex51_Object {
	
	public static void main(String[] args) {
		
		//Object 클래스
		//- 모든 클래스의 부모 클래스이다.
		
		m1();
		
	}

	private static void m1() {
		
		AA a1 = new AA();
		AA a2 = new BB();
		AA a3 = new CC();
		
		Object o1 = new AA();
		Object o2 = new BB();
		Object o3 = new CC();
		
		Object o4 = new Scanner(System.in);
		Object o5 = new BufferedReader(new InputStreamReader(System.in));
		Object o6 = new Lee();
		Object o7 = new Park();
		
		Object o8 = "홍길동"; //new String("홍길동")
		Object o9 = new int[3];
		
		if(o8 instanceof String) {
			System.out.println(o8);
		}
		
		
		System.out.println("입력: ");
		String input = ((Scanner)o4).nextLine();
		System.out.println(input);
		
		//System.out.println("입력: ");
		//String input2 = ((Scanner)o5).nextLine(); //ClassCastException //형제끼리는 형변환을 못한다. //o5가 뭐인지 검증을 해야하는 문제. -> 런타임오류 많이 발생
		//System.out.println(input2);
		
		
		//조심해야 할것!! > 절대 금지!! > 꼭 써야겠다면 instanceof를 통해 검증하는 과정을 넣자. 
		//집어넣기는 좋지만... 안의 내용을 취급하는데 있어서 조심해야한다.
		Object[] list = new Object[5]; //배열을 쓰는 이유 > loop를 돌릴 수 있다.(for문)
		
		list[0] = "홍길동";
		list[1] = 20;
		list[2] = true;
		list[3] = "서울시";
		list[4] = 170;
		
		//컴파일러는 20 + 1 이 아니고 Object + 1로 본다. // 모든 참조 주소는 산술 연산의 대상이 될 수 없다.
		System.out.println((int)list[1] + 1);
		
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]); //조작 >
		}
		
	}
}

class AA{
	
}

class BB extends AA{

}

class CC extends BB{
	
}