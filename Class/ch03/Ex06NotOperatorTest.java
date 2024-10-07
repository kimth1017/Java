package com.test.java.ch03;

public class Ex06NotOperatorTest {
	public static void main(String[] args) {
		boolean tvPower = false;
		
		String TV = tvPower==false ? "현재 TV의 전원이 꺼져 있습니다." : "현재 TV 전원이 켜져 있습니다";
		System.out.println(TV);
		
		

		
		/*boolean tvPower = false;
		System.out.printf("TV의 전원이 %b되어 있습니다.%n", tvPower);
		System.out.printf("TV의 전원이 %b되어 있습니다.%n", !tvPower);*/
		
		
	}

}

/*
문제 1.
티비의 전원이 꺼져 있습니다.
부정 연산자를 사용하여 티비의 전원 변수의 값을 반대로 바꿔 저장한 뒤 출력하세요.  
*/