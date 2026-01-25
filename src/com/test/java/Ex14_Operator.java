package com.test.java;

public class Ex14_Operator {

	public static void main(String[] args) {
		
		//Ex14_Operator.java
		/*
		
			논리 연산자
			- &&(and), ||(or), !(not)
			- 2항 연산자(&&,||)
			- 1항 연산자(!)
			- 피연산자의 자료형은 boolean이다.
			- 연산의 결과는 boolean이다.
			
			논리곱(x) -> 교집합
			A && B = ?
			
			T && T = T
			T && F = F
			F && T = F
			F && F = F 
			
			논리합(+)	-> 합집합	
			A || B = ?
			
			T || T = T
			T || F = T
			F || T = T
			F || F = F 
			
			
			!A = ?
			
			!T = F 
			!F = T
			
			
			
			베타적 논리합(xor, exclusive or)
			A ^ B = ?
			
			T ^ T = F
			T ^ F = T
			F ^ T = T
			F ^ F = F
			
			~(tild), ^(xor, caret), |(pipe, vertical b, 
			/(slash), \(back slash)
			;, :, ,(period), .(dot)
			(), [], {}, <>

		*/
		
		boolean f1 = true;
		boolean f2 = false;
		boolean f3 = true;
		
		System.out.println(f1 && f2 && f3); //1 + 2 + 3
		System.out.println(f1 || f2 || f3);
		System.out.println(f1 && f2 || f3);
		System.out.println(!f2);
		System.out.println(f1 ^ f2);
		System.out.println(f1 ^ f3);
		
		
		//요구사항] 나이 입력 > 18세 이상 + 60세 미만
		int age = 100;
		
		//The operator < is undefined for the argument type(s) boolean, int
		// true < 10
		//System.out.println(18 <= age < 60);
		
		//연산자 우선 순위
		//- 산술 연산자(1) > 비교 연산자(2) > 논리 연산자(3)
		System.out.println(18 <= age && age < 60);
		
		System.out.println((18 <= age) && (age < 60));
		
		
		
		/*
		
			대입 연산자, 할당 연산자
			- =
			- +=, -=, *=, /=, %= (복합 대입 연산자)
			- LValue(변수) = RValue(변수,상수)
			- LValue와 RValue의 자료형이 동일해야 한다. > 형변환
			- 대입 연산자는 모든 연산자들 중 우선 순위가 가장 낮다.
			- 대입 연산자는 연산 방향이 오른쪽 > 왼쪽 순이다.
		
		*/
		int sum = 1 + 2 + 3;
		
		int a1 = 100;
		int a2;
		int a3;
		
//		a2 = a1;
//		a3 = a1;
		
		a3 = a2 = a1;
		
		
		//복합 대입 연산자
		int n = 10;
		
		//n에 1을 추가하시오. 
		// > n의 값에 1을 더해서 n에 다시 넣어라
		// > 누적(******************)
		n = n + 1;
		System.out.println(n); //11
		
		n += 1;
		System.out.println(n); //12
		
		n += 5;
		System.out.println(n); //17
		
		n = n - 2;
		System.out.println(n); //15
		
		n -= 2;
		System.out.println(n); //13
		
		n = n * 3;
		System.out.println(n); //39
		
		n *= 3;
		System.out.println(n);
		
		n = n / 7;
		System.out.println(n);
		
		n /= 4;
		System.out.println(n);
		
		n = n % 3;
		System.out.println(n);
		
		n %= 3;
		System.out.println(n);
		System.out.println();
		
		//n = n + 10;
		n += 10;
		System.out.println(n);
		//n = 10 + n;
		n += 10; //O
		System.out.println(n);
		n = n - 10;
		System.out.println(n);
		n -= 10;
		System.out.println(n);
		n = 10 - n;
		System.out.println(n);
		n -= 10;
		System.out.println(n);
		
		
		/*
		
			증감 연산자
			- ++(증가), --(감소)
			- 1항 연산자
			- 피연산자는 숫자형을 가진다.
			- 누적 연산을 한다.
			- 기존의 값에 1을 더하거나, 1을 뺀다.
			
			*** 증감 연산자는 피연산자의 위치를 바꿀 수 있다.
			- 연산자 우선 순위가 바뀐다.
			1. ++n: 전위배치,전치 > 연산자 우선 순위가 가장 높다.
			2. n++: 후위배치,후치 > 연산자 우선 순위가 가장 낮다.
			
			*** 증감 연산은 되도록 같은 문장에 다른 연산자와 같이 사용하지 말자!!
		
		*/
		
		System.out.println();
		
		n = 10;
		
		n = n + 1;
		n += 1;
		++n;
		n++;
		
		System.out.println(n); //14
		
		n = n - 1;
		n -= 1;
		--n;
		n--;
		
		System.out.println(n); //10
		
		System.out.println();
		
		
		
		
		
		n = 10;
		int result = 0;
		
		//result = 10 + ++n;
		
		//++n;
		n++;
		result = 10 + n;
		
		System.out.println("result: " + result);
		
		
		
		
		
		
		n = 10;
		result = 0;
		
		//result = 10 + n++;
		
		result = 10 + n;
		//n++;
		++n;
		
		System.out.println("result: " + result);
		System.out.println("n: " + n);
		
		
		int o = 10;
		
		System.out.println(--o-o--);
		System.out.println();
		
		
		/*
		
			조건 연산자
			- ?:
			- 3항 연산자
			- A ? B : C
			- A: boolean > 조건으로 사용
			- B,C: 값(상수,변수) > 연산의 결과값으로 사용
			- A가 참이면 B를 반환, A가 거짓이면 C를 반환
		
		*/
		n = -10;
		
		System.out.println(n > 0 ? "양수" : "양수아님");
		
		
		//나이 입력 > 18세 이상 ~ 60세 미만
		age = 20;
		
		System.out.println((age >= 18 && age < 60) ? "합격" : "불합격"); //조건문 대체
		
		//반환값 B,C는 항상 동일한 자료형으로..
		//String message = (age >= 18 && age < 60) ? "합격" : 100;
		
		
		//연산자 우선순위
		// () > 증감 > 산술 > 비교 > 논리 > 대입
		
		//연산자 연산방향
		//- 왼쪽 > 오른쪽: 대부분
		//- 오른쪽 > 왼쪽: 대입, 증감 
		
		
	}
	
}















