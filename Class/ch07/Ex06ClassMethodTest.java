package com.test.java.ch07;

public class Ex06ClassMethodTest {

	public static void main(String[] args) {
		Book5T b1 = new Book5T();
		b1.bookNo = Book5T.generateBookNo();
		System.out.println(b1.bookNo);
		
		System.out.println();
		
		Book5T b2 = new Book5T();
		b2.bookNo = Book5T.generateBookNo();
		System.out.println(b2.bookNo);
		
		System.out.println();
		
		Book5T b3 = new Book5T();
		b3.price = Book5T.usdPrice(30000);
		System.out.println(b3.price);
		b3.usdPricePrint();
		
	}

}

class Book5T {
	String title;
	int bookNo;
	int price;
	
	static int generateBookNo() {
		return (int)(Math.random()*9000)+1000;
	}
	
	static int genBookNo() {
		return (int)(Math.random()*9000)+1000;
	}
	
	int genBookNo2() {
		bookNo = (int)(Math.random()*9000) + 1000;
		return bookNo;	
	}
	
	static int usdPrice(int price) {
		return price/(int)1000;
	}
	
	void usdPricePrint() {
		System.out.println("$"+price);
	}
	
	/* static int genBookNo() {
		bookNo = (int)(Math.random()*9000)+1000;
		return bookNo;
	}*/
}

/*
문제 1.
	주석처리된 코드의 오류를 수정하세요.

문제 2.
책의 가격을 달러로 변환하여 리턴하는 클래스 메소드를 작성하세요.
1달러=1000원으로 가정합니다. 
*/