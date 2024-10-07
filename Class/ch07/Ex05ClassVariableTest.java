package com.test.java.ch07;

public class Ex05ClassVariableTest {
	
	public static void main(String[] args) {
		Book4T.category = "문화";
		
		Book4T book = new Book4T();
		book.title = "제목1";
		book.price = 10000;
		book.printInfo();
		
		System.out.println();
		
		Book4T.category = "도서";
		book.printInfo();
	}

}
class Book4T{
	String title;
	int price;
	static String category;
	
	void printInfo() {
		String message = "책 제목: " + title + ", 가격: " + price + ", 카테고리: " + category;
		System.out.println(message);
	}
	
}

/*
문제 1.
책 클래스에 카테고리를 저장할 수 있는 속성(변수)을 추가하세요.
카테고리를 "문화" 에서 "도서"로 변경해 주세요.
카테고리 변경 시 모든 인스턴스에 동일하게 적용되도록 코딩 후 적용된 결과를 출력하세요. 
*/