package com.test.java.ch01;

public class Ex04Variable {
	public static void main(String[] args) {
		int Balance=1000;
		System.out.println("현재 잔액은 "+Balance+"원 입니다.");
		System.out.println();
		
		int tvPrice=300;
		System.out.println("TV의 가격은 "+tvPrice+"원 입니다.");
		System.out.println("TV를 구매했습니다.");
		
		Balance=Balance-tvPrice;
		System.out.println("현재 잔액은 "+Balance+"원 입니다.");
		
		System.out.println();
		
		int Salary=500;
		System.out.println("월급 "+Salary+"원이 입금되었습니다.");
		
		Balance=Balance+Salary;
		System.out.println("현재 잔액은 "+Balance+"원 입니다.");
		
	}
}
