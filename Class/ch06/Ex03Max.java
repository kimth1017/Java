package com.test.java.ch06;

public class Ex03Max {
	public static void main(String[] args) {
		int[] a = {10, 28, 18, 86, 5};
		int max = a[0];
		for (int i = 1; i<a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("최댓값은 "+max+"입니다.");
	}

}
