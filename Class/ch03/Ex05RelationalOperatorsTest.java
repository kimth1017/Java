package com.test.java.ch03;

public class Ex05RelationalOperatorsTest {
	public static void main(String[] args) {
		int tvPrice = 500;
		System.out.printf("(%d < 300 || %d > 500) && %d > 600 : (%b)%n", tvPrice, tvPrice, tvPrice, tvPrice < 300 || tvPrice > 500 && tvPrice > 600);
		
	}

}

/*
문제 1.
TV의 가격이 300원 보다 작거나 500원 보다 크고 600원 보다 작은 경우 true를 반환하는 코드를 작성하고 결과를 출력하세요. 
*/