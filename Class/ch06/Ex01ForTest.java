package com.test.java.ch06;

public class Ex01ForTest {
	public static void main(String[] args) {
		
		//문제 1
		for (int i = 1; i <=9; i++) {
			int j = 2*i;
			System.out.printf("2x%d=%d, ", i, j);
		}
		System.out.println();
		
		//문제2
		int[] a= {80, 55, 95};
		for (int i = 0; i <= 2; i++) {
			System.out.printf("%d번 학생의 중간고사 점수는 %d점 입니다.%n",i, a[i]);
		}
		System.out.println();
		
		//문제3
		int[] b = {80, 55, 95};
		for (int i = 0; i <= 2; i++) {
			if (b[i] >= 60)
				System.out.printf("%d번 학생의 중간고사 점수는 %d점 입니다.%n", i, b[i]);
			else
				System.out.printf("%d번 학생은 재시험입니다.%n", i); 
		}
	}

}

/*
문제 1.
구구단 중 2단만 출력하세요.
예) 
2x1=2 2x2=4 ... 2x9=18

문제 2.
학생 3명의 중간고사 점수가 저장된 배열을 만들고 임의의 점수를 저장한 뒤
for 문을 사용하여 출력하세요.

문제 3.
중간고사 점수가 저장된 배열의 점수를 출력하되 점수가 60점 이상일 경우에만 출력하고 60점 미만일 경우 "재시험"을 출력하는 코드를 작성하세요. 
*/