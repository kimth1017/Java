package com.test.java.ch03;

import java.util.Scanner;

public class Ex01ArithmeticOperatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tvPrice;
		int tvQuantity;
				
		System.out.printf("TV의 가격을 입력하세요: %n");
		tvPrice = scan.nextInt();
		System.out.printf("TV의 수량을 입력하세요: %n	");
		tvQuantity = scan.nextInt();
		System.out.printf("총 금액은 %d원 입니다.%n",tvPrice*tvQuantity);
		
		
		
		//int tvPrice = 300;
		//int tvQuantity = 10;
		//int sum = tvPrice*tvQuantity;
		//System.out.printf("%d*%d = %d%n", tvPrice, tvQuantity, sum);
		
	}

}
/*
문제 1.
TV의 수량과 금액을 입력 받고 총액을 출력하세요. 
 */