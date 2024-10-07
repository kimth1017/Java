package com.test.java.ch01;

public class Ex04VariableTest {

	public static void main(String [] args) {
		int Balance = 5000;
		System.out.println("현재 잔액은 "+Balance+"원 입니다.");
		
		System.out.println();
		
		int tvPrice=500;
		int comPrice=300;
		System.out.println("TV의 가격은 "+tvPrice+"원 입니다.");
		System.out.println("TV를 구매했습니다.");
		System.out.println("컴퓨터의 가격은 "+comPrice+"원 입니다.");
		System.out.println("컴퓨터를 구매했습니다.");
		Balance=Balance-tvPrice-comPrice;
		System.out.println("현재 잔액은 "+Balance+"원 입니다.");
		
		System.out.println();
		
		int Salary=500;
		System.out.println("월급 "+Balance+"원이 입금되었습니다.");
		Balance=Balance+Salary;
		System.out.println("현재 잔액은 "+Balance+"원 입니다.");
		
	}
}

/* 

문제 1. 5000원의 잔액에서 TV(500원)와 컴퓨터(300원)를 구매 후 500원의 월급이 입금되는 코드를 작성하세요. 
 
*/ 