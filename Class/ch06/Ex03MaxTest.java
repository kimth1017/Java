package com.test.java.ch06;

public class Ex03MaxTest {
	public static void main(String[] args) {
		int[] a = {45, 87, 80, 50, 85, 30};
		int max = a[0];
		int min = a[0];
		for (int i = 1; i<a.length; i++) {
			if (max < a[i])
				max = a[i];
			else if (min > a[i])
				min = a[i];
			}
			System.out.println("최댓값은 "+max+"이고, 최솟값은 "+min+"입니다.");
		}
	}


/*
문제 1.
학생 5명의 점수를 저장하는 배열을 작성 한 뒤 
최저점수와 최고점수를 찾아 출력하세요. 
*/