package com.test.java.ch01;

public class Ex03VariableTest {
	public static void main(String[] args) {
		System.out.println("현재 잔액은 "+2000+"원 입니다.");
		
		System.out.println();
		
		System.out.println("TV 1대의 가격은 "+300+"원 입니다.");
		System.out.println("TV 2대를 구매했습니다.");
		System.out.println("현재 잔액은 "+(2000-300-300)+"원 입니다.");
		
		System.out.println();
		
		System.out.println("월급 "+300+"원이 입금되었습니다.");
		System.out.println("현재 잔액은 "+(2000-300-300+300)+"원 입니다.");
	
	}
}

/* 

문제 1. 2000원의 잔액에서 300원 짜리 TV 2대를 구매하고 300원의 월급이 입금되는 코드를 작성하세요.
 
*/ 