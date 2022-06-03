package com.day4;

public class P153_PersonTest {

	public static void main(String[] args) {

		// P153_Person person1 = new P153_Person(); // P153_Person() : 생성자, 초기화를 함

		P153_Person person1 = new P153_Person(); // 디폴트 생성자로클래스를 생성 후
		person1.name = "김유신"; // 인스턴스 변수 값을 따로 초기화
		person1.heigth = 180f;
		person1.weigth = 85.5f;

		@SuppressWarnings("unused")
		P153_Person person2 = new P153_Person("이순신", 175, 75); // 클래스 생성과 동시에 인스턴스 변수 초기화

	}

}
