package com.day4;

public class P153_PersonTest {

	public static void main(String[] args) {

		// P153_Person person1 = new P153_Person(); // P153_Person() : ������, �ʱ�ȭ�� ��

		P153_Person person1 = new P153_Person(); // ����Ʈ �����ڷ�Ŭ������ ���� ��
		person1.name = "������"; // �ν��Ͻ� ���� ���� ���� �ʱ�ȭ
		person1.heigth = 180f;
		person1.weigth = 85.5f;

		@SuppressWarnings("unused")
		P153_Person person2 = new P153_Person("�̼���", 175, 75); // Ŭ���� ������ ���ÿ� �ν��Ͻ� ���� �ʱ�ȭ

	}

}
