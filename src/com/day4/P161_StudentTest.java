package com.day4;

public class P161_StudentTest {

	public static void main(String[] args) {

		P161_Student student1 = new P161_Student();
//		student1.studentName = "�̻��"; // studentName�� ���������ڰ� privete�̱� ������ �ҷ��ü� ��� ������ ����.
		student1.setStudentName("�̻��"); // setStudentName() �޼ҵ带 �̿��ϸ� private ������ �����Ҽ��ִ�.

		System.out.println(student1.getStudentName());

	}

}
