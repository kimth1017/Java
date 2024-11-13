package com.test.java.ch03;

public class Ex08AssignmentOperatorTest {
	public static void main(String[] args) {
		int balance = 500;
		System.out.printf("현재 둘리의 잔고는 %d원 입니다.%n",balance);
		
		balance -= 100;
		System.out.printf("100원짜리 사탕을 구매한 뒤, 둘리의 잔고는 %d원 입니다.%n", balance);
		
	}

}

/*
문제 1.
둘리의 통장에 잔고는 500원입니다.
둘리가 100원 짜리 사탕을 구매한 뒤 잔고를 할당 연산자를 사용하여 작성하고 잔고를 출력하세요. 
*/