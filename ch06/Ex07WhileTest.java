package com.test.java.ch06;

import java.util.Scanner;

public class Ex07WhileTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 1000;
		int code = 0;
		
		while (balance >= 200) {
			System.out.println("음료수를 선택해 주세요. \n 1.콜라(500원) 2.사이다(300원) 3.환타(200원)");
			code = scanner.nextInt();
			
			if (code == 1) {
				balance -= 500;
				System.out.println("콜라를 선택했습니다. 현재 잔액은 " + balance + "원 입니다.");
			}else if (code == 2) {
				balance -= 300;
				System.out.println("사이다를 선택했습니다. 현재 잔액은 " + balance + "원 입니다.");
			}else if (code == 3) {
				balance -= 200;
				System.out.println("환타를 선택했습니다. 현재 잔액은 " + balance + "원 입니다.");
			}else {
				System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
		
		
	}

}

/*
문제 1.
while문을 사용해 자판기를 만드세요.
1: 콜라 (500원), 2: 사이다(300원), 3: 환타(200원)
잔액은 1000원으로 설정하고 잔액이 부족하면 음료수를 살 수 없어야 합니다.  
*/