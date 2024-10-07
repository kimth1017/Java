package com.test.java.ch04;

public class Ex02ArrayTest {
	public static void main(String[] args) {
		int[][] a = {
				{100,90,75,80},
				{80,95,85,100}
		};
		System.out.print("모든 학생의 국어 성적의 합은: " + (a[0][0] + a[1][0])+"\n");
		
		System.out.println();
		
		String[][] b = {
				{"사과", "배"},
				{"티비", "김치", "감자"}	
		};
		
		System.out.print("둘리가 장바구니에 담고있는 상품은 " + b[0][0] + "와 " + b[0][1] + "입니다." + "\n");
		System.out.print("또치가 장바구니에 담고있는 상품은 " + b[1][0] + ", " + b[1][1] + ", 그리고 " + b[1][2] + "입니다.\n");
	}

}

/*
문제 1.
총 3명의 학생이 있고 각각의 학생들은 국어, 영어, 수학, 과학 점수를 가지고 있습니다.
이를 2차원 배열로 만들고 모든 학생들의 국어 점수를 합하여 출력하세요.

문제 2.
둘리와 또치는 장바구니를 가지고 있습니다.
둘리는 2개의 상품을 담을 수 있는 장바구니이고 또치는 3개의 상품을 담을 수 있는 장바구니입니다.
이를 2차원 배열로 표현하세요.
힌트) 담는 상품은 "티비", "라디오" 처럼 임의의 문자열로 표현하면 됩니다. 배열의 타입에 주의하세요. 
*/