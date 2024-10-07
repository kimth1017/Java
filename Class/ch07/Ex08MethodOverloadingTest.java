package com.test.java.ch07;

public class Ex08MethodOverloadingTest {
	
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setInfo("소나타");
		System.out.println(car1.getInfo());
		
		car1.setInfo("소나타", 250);
		System.out.println(car1.getInfo());
		
		car1.setInfo("소나타", 300, "현대자동차");
		System.out.println(car1.getInfo());
		
		System.out.println(car1.setInfo());
		System.out.println(car1.getInfo());
	}

}
class Car{
	String name;
	int speed;
	String company;
	
	void setInfo(String name) {
		this.name = name;
	}
	
	void setInfo(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
	
	void setInfo(String name, int speed, String company) {
		this.name = name;
		this.speed = speed;
		this.company = company;
	}
	
	String setInfo() {
		this.name = "";
		this.speed = 0;
		this.company = "";
		
		return "자동차의 정보가 초기화 되었습니다.";
	}
	
	String getInfo() {
		return "자동차 이름: " + name + "\n최대 속도: " + speed +"km/h \n자동차 회사: " + company + "\n";
	}
	
}
/*
문제 1.
자동차 정보 자동차이름(문자열), 최대속도(정수), 자동차회사(문자열) 를 저장하는 클래스를 만들고
각각의 속성을 설정하는 메소드를 작성 후 출력하세요.

문제 2.
속성을 설정하는 메소드를 오버로딩을 사용하여 작성 후 출력하세요. 
*/