package com.test.java.problemsolve;

import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		int A = sc.nextInt();
		
		System.out.println("두번째 숫자: ");
		int B = sc.nextInt();
		sc.next();
		int big;
		int small;
		
		if(A>B) {
			big = A;
			small = B;
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", big, small, big-small);
		} else if(A<B) {
			big = B;
			small = A;
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", big, small, big-small);
			return;
		} else {
			System.out.println("두 숫자는 동일합니다.");
		}
		 
		sc.close();
		
	}
	
}
