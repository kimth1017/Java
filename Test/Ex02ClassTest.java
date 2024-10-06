package com.test.java.ch07;

import java.util.Scanner;

public class Ex02ClassTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("도서관리 프로그램");
		
		Book2[] books = new Book2[10];
		
		int bookCount = 0;
		
		boolean run = true;
		
		while (true) {
			String title = "";
			String author = "";
			int price = 0;
			
			System.out.println("---------------------");
			System.out.println("메뉴를 선택하세요. \n<1:책등록 2:책목록, 0:종료>");
			System.out.println(">>");
			int menu = scanner.nextInt();
			scanner.nextLine();
			
			switch(menu) {
				case 1:
					System.out.println("책을 등록하세요.");
					System.out.println("제목:");
					title = scanner.nextLine();
					System.out.println("저자:");
					author = scanner.nextLine();
					System.out.println("가격:");
					price = scanner.nextInt();
					System.out.printf("<%d> 제목: %s, 저자: %s, 가격: %d%n%n", bookCount+1, title, author, price);
					
					books[bookCount] = new Book2();
					books[bookCount].title = title;
					books[bookCount].author = author;
					books[bookCount].price = price;
					bookCount++;
					break;
					
				case 2:
					System.out.println("책의 목록을 확인합니다.");
					for (int i = 0; i < bookCount; i++) {
						System.out.printf("<%d> 제목: %s, 저자: %s, 가격: %d%n%n",i+1,books[i].title,books[i].author,books[i].price);
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
class Book2{
	String title;
	String author;
	int price;
}

/*
문제 1.
클래스를 이용하여 도서관리 프로그램 등록과 목록 기능을 개발하세요. 
*/
