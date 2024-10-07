package com.test.java.ch05;

public class Ex05SwitchTest {
	public static void main(String[] args) {
		int month = 13;
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
			System.out.println("여름");
			break;
		case 7:
			System.out.println("여름");
			break;
		case 8:
			System.out.println("여름");
			break;
		case 9:
			System.out.println("가을");
			break;
		case 10:
			System.out.println("가을");
			break;	
		case 11:
			System.out.println("가을");
			break;
		case 12:
			System.out.println("겨울");
			break;
		case 1:
			System.out.println("겨울");
			break;
		case 2:
			System.out.println("겨울");
			break;
		default: 
			System.out.println("잘 못 입력하셨습니다");
		}
	}

}

/*
문제 1.
입력 받은 숫자가 3~5이면 "봄", 6~8이면 "여름", 9~11이면 "가을" 12,1,2 를 입력하면 "겨울"을 출력하고 
그 외의 숫자를 입력하면 "잘 못 입력하였습니다"를 출력하는 코드를 switch문으로 작성하세요. 
*/