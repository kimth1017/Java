package com.test.java.ch05;

public class Ex02IfElse {
	public static void main(String[] args) {
		int level = 3;
		String name = "익명";
		
		if (level >= 9) {
			name = "관리자";
		} else {
			name = "방문자";
		}
		
		System.out.printf("현재 회원님의 레벨은 %d이고, %s입니다.%n", level, name);
		
		System.out.println();
		
		
		level = 11;
		if (level >= 9)
			name = "관리자";
		else
			name = "방문자";
		
		System.out.printf("현재 회원님의 레벨은 %d이고, %s입니다.%n", level, name);
	}

}
