package com.test.java.ch01;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int month;
		int date;
		String countryIn;
		String countryOut;
		String flight;
		
		System.out.printf("탑승월을 입력하세요: %n");
		month=scan.nextInt();
		System.out.printf("탑승일을 입력하세요: %n");
		date=scan.nextInt();
		System.out.printf("출발지를 입력하세요: %n");
		countryIn=scan.next();
		System.out.printf("도착지를 입력하세요: %n");
		countryOut=scan.next();
		System.out.printf("항공사를 입력하세요: %n");
		flight=scan.next();
		
		System.out.printf("%d월 %d일에 %s을 출발하여 %s에 도착하는 %s 항공권의 예매가 완료되었습니다.%n", month, date, countryIn, countryOut, flight);
		
		
	}

}
