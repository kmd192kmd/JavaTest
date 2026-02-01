package com.test.java.problemsolve;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem56 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		int A = sc.nextInt();
		
		System.out.println("두번째 숫자: ");
		int B = sc.nextInt();
		
		divisor(A);
		divisor(B);
		commonDivisor(A, B);
		
		sc.close();
	}

	private static void commonDivisor(int a, int b) {
		
//		System.out.print(a + "와 " + b + "의 공약수: ");
//		
//		ArrayList<Integer> arr1 = new ArrayList<Integer>();
//		for(int i=1; i<=a; i++){
//			if(a % i == 0) {
//				arr1.add(i);
//			}
//		}
//		
//		ArrayList<Integer> arr2 = new ArrayList<Integer>();
//		for(int i=1; i<=b; i++){
//			if(b % i == 0) {
//				arr2.add(i);
//			}
//		}
//		
//		for(int i=0; i<arr1.size(); i++) {
//			for(int j=0; j<arr2.size(); j++) {
//				if(arr1.get(i) == arr2.get(j)) {
//					System.out.print(arr1.get(i) + ",");
//				}
//			}
//		}
		
		System.out.print(a + "와 " + b + "의 공약수: ");
        ArrayList<Integer> common = new ArrayList<>();
        
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                common.add(i);
            }
        }
        System.out.println(common.toString().replace("[", "").replace("]", ""));
		
	}

	private static void divisor(int a) {
		
		System.out.print(a + "의 약수: ");
		
		for(int i=1; i<=a; i++){
				if(a % i == 0) {
					System.out.print(i + ",");
				}
			}
		System.out.println();
	}
		

}
