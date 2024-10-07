package com.test.java.ch03;

public class Ex04RelationalOperatorsTest {
	public static void main(String[] args) {
		int tvPrice = 300;
		int balance = 1000;
		boolean purchase = tvPrice <= balance;
		
		System.out.printf("현재 잔액운 (%d)원으로 (%d원)의 TV의 구매가 (%b)합니다,", balance, tvPrice, purchase);
		
		
	}

}

/*
문제 1.
TV의 금액은 300원입니다.
잔액이 1000원일 때 TV의 구매 가능 여부를 조건식을 이용하여 출력하세요. 
*/