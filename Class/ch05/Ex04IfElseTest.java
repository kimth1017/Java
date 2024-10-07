package com.test.java.ch05;

public class Ex04IfElseTest {
	public static void main(String[] args) {
		int month = 8;
		
		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			if (month == 8) {
				System.out.println("여름 휴가철");
			} else {
				System.out.println("여름");
			}
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울");
		} else {
			System.out.println("잘 못 입력하셨습니다.");
		}
		
		
	}

}

/*
문제 1.
사용자가 입력한 숫자에 맞는 계절을 출력하되 8월을 입력하면 "휴가철"도 같이 출력되게 작성하세요.
힌트) 중첩 if문을 사용하세요.  
*/