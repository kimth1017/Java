package com.test.java.ch07;

import java.util.Scanner;

public class Ex02ClassTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("도서관리 프로그램");
		
		Book1[] books = new Book1[10];
		
		int bookCount = 0;
		
		boolean run = true;
		
		while (true) {
			String title = "";
			String author = "";
			int price = 0;
			//Book1 book = null;
					
			System.out.println("------------------");
			System.out.println("메뉴를 선택하세요. <1: 책등록>, <2: 책목록>, <0: 종료>");
			System.out.println(">>");
			int menu = scanner.nextInt();
			scanner.nextLine();
			
			switch(menu) {
				case 1:
					System.out.println("책을 등록하세요.");
					System.out.print("제목:");
					title = scanner.nextLine();
					System.out.print("저자:");
					author = scanner.nextLine();
					System.out.print("가격:");
					price = scanner.nextInt();
					System.out.printf("제목: %s, 저자: %s, 가격: %d%n%n", title, author, price);

/*					book = new Book1();
					book.title = title;
					book.author = author;
					book.price = price;
					books[bookCount] = book;*/
					
					books[bookCount]=new Book1();
					books[bookCount].title=title;
					books[bookCount].author=author;
					books[bookCount].price=price;
					bookCount++;
					break;
					
				case 2:
					System.out.println("책의 목록을 확인합니다.");
					for (int i = 0; i < bookCount; i++) {
						System.out.printf("%d. 제목: %s, 저자: %s, 가격: %d%n%n", i+1, books[i].title, books[i].author, books[i].price);
					}
					break;
					
				case 0:
					run = false;
					break;
					
			}
			
			if (!run)
				break;
		}
		System.out.println("프로그램이 종료됩니다.");
	}

}

class Book1 {
	String title;
	String author;
	int price;
}

/*
문제 1.
클래스를 이용하여 도서관리 프로그램 등록과 목록 기능을 개발하세요. 
*/
