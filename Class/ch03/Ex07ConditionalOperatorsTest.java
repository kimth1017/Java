package com.test.java.ch03;

import java.util.Scanner;

public class Ex07ConditionalOperatorsTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = s.nextInt();
		
//		int number = 31;
		System.out.printf("%s%n", number > 0 ? "양수" : number < 0 ?  "음수" : 0);
	}

}

/*
문제 1.
삼항연산자를 사용하여 사용자로 부터 입력 받은 값이 음수인지 양수인지 0인지를 출력하는 코드를 작성하세요. 
*/ 