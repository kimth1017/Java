package com.test.java.ch07;

public class Ex03MethodTest {
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.i = 30;
		cal.j = 20;
		
		cal.calAdd();
		
		cal.calSub();
		
		cal.calMul();
		
		cal.calDiv();
		
	}

}

class Calculator {
	int i;
	int j;
	
	void calAdd() {
		System.out.println("--------------------");
		System.out.println(i + " + " + j);
		System.out.println("= " + (i+j));
		System.out.println("--------------------");
	}
	
	void calSub() {
		System.out.println("--------------------");
		System.out.println(i + " - " + j);
		System.out.println("= " + (i-j));
		System.out.println("--------------------");
	}
	
	void calMul() {
		System.out.println("--------------------");
		System.out.println(i + " * " + j);
		System.out.println("= " + (i*j));
		System.out.println("--------------------");
	}
	
	void calDiv() {
		System.out.println("--------------------");
		System.out.println(i + " / " + j);
		System.out.println("= " + (i/(float)j));
		System.out.println("--------------------");
	}
}

/*
문제 1.
계산기 클래스를 만들고 더하기, 빼기, 곱하기, 나누기 메소드를 작성한 뒤 메소드를 이용하여 결과를 출력하세요.  
*/