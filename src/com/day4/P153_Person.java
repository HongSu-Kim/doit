package com.day4;

public class P153_Person {
	String name;
	float heigth;
	float weigth;

	public P153_Person() { // ����Ʈ ������ : �����ڰ� �������� �ڵ�����
	}

	public P153_Person(String pname) { // name ������ ������ �Է� ���־���Ѵ�.

		name = pname;

	}

	public P153_Person(String pname, float pheigth, float pweigth) { // 3���� ������ �Է����־���Ѵ�.

		name = pname;
		heigth = pheigth;
		weigth = pweigth;

	}
}
