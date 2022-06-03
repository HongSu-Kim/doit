package com.day4;

public class P153_Person {
	String name;
	float heigth;
	float weigth;

	public P153_Person() { // 디폴트 생성자 : 생성자가 없을때는 자동생성
	}

	public P153_Person(String pname) { // name 변수를 무조건 입력 해주어야한다.

		name = pname;

	}

	public P153_Person(String pname, float pheigth, float pweigth) { // 3가지 변수를 입력해주어야한다.

		name = pname;
		heigth = pheigth;
		weigth = pweigth;

	}
}
