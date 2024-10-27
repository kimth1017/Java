package com.test.java.ch07;

import java.util.Arrays;

public class Ex04MethodTest {
	
	public static void main(String[] args) {
		BookTest book1 = new BookTest();
		book1.setPrice(50000);
		book1.printPrice();
		
		BookTest book2 = new BookTest();
		book2.setPrice(100000);
		book2.printPrice();
		
		String[] author = {"저자1", "저자2", "저자3"};
		book2.setAuthor(author);
		book2.printAuthor();
	}
	
}
	
class BookTest{
	int price;
	String[] author = new String[3];
	
	void setPrice(int price) {
		if (price >= 10000 && price < 80000) {
			this.price = price;
		}
		else {
			System.out.println("설정 가능하지 않은 가격입니다.");
		}
	}

	void printPrice() {
		System.out.println("책의 가격: " + price + "원");
	}
	
	void setAuthor(String[] author) {
		for (int i = 0; i < 3; i ++) {
			this.author[i]=author[i];
			
		}
	}
	
	void printAuthor() {
		System.out.println(Arrays.toString(author));
	}

}	

/*
문제 1.
BookTest 클래스를 작성하세요.
가격을 저장하는 인스턴스 변수를 선언하세요.
책의 가격을 설정하는 메소드를 작성하세요.
책의 가격은 10000원 이상 80000원 미만으로만 설정가능해야 하며 그 외의 금액은 "설정 가능하지 않은 가격입니다." 를 출력하세요.

문제 2.
BookTest 클래스의 인스턴스를 두 개 생성하여 메소드를 사용하여 각각 금액을 설정하고 설정된 금액을 출력하세요.
