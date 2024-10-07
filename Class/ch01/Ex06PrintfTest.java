package com.test.java.ch01;

public class Ex06PrintfTest {
	public static void main(String[] args) {
		int stock=10;
		System.out.printf("슈퍼에는 %d개의 사탕이 있습니다%n%n", stock);
		
		int personA=3;
		int personB=2;
		int personC=2;
		stock=stock-personA-personB+personC;
		System.out.printf("철수는 %d개의 사탕을 구매했습니다.%n", personA);
		System.out.printf("영희는 %d개의 사탕을 구매했습니다.%n", personB);
		System.out.printf("둘리는 %d개의 사탕을 환불했습니다.%n", personC);
		
		System.out.printf("%n현재 슈퍼에 남아있는 사탕의 개수는 %d개 입니다.", stock);
		
		

		
	}
}

/* 

문제 1. 슈퍼에는 10개의 사탕이 있습니다. 
철수는 3개의 사탕을 사고 영희는 2개의 사탕을 샀습니다.
둘리는 예전에 사두었던 사탕 2개를 환불했습니다.
슈퍼에 남아 있는 사탕의 재고는 7개입니다.
위 내용을 코드로 작성하세요. 

*/ 