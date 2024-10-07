package com.test.java.ch07;


public class Ex07FinalvariableTest {
	public static void main(String[] args) {
		
		Book6T b1 = new Book6T();
		b1.title = "파이썬 기초문법";
		b1.author = "엘컴퓨터학원";
		b1.price = 30000;
		
		Book6T b2 = new Book6T();
		b2.title = "리눅스 명령어 모음집";
		b2.author = "엘코딩연구소";
		b2.price = 20000;
		
		System.out.printf("제목: %s%n저자: %s%n가격: %.0f%n서점: %s%n%n", b1.title, b1.author, (b1.price*Book6T.TAX_RATE), Book6T.BOOKSTORE_NAME);
		System.out.printf("제목: %s%n저자: %s%n가격: %.0f%n서점: %s%n%n", b2.title, b2.author, (b2.price*Book6T.TAX_RATE), Book6T.BOOKSTORE_NAME);
	}

}

class Book6T {
	final static String BOOKSTORE_NAME = "엘컴퓨터서점";
	final static float TAX_RATE = 1.3f;
	String title;
	String author;
	int price;
}

/*
문제 1.
책의 세율을 final로 설정한뒤 세율이 적용된 책의 가격을 출력하는 코드를 작성하세요. 
*/