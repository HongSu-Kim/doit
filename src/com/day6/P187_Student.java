package com.day6;

// static

public class P187_Student {
	private static int serialNum = 1000; // static(Ŭ����) ���� : Ŭ�������� �������� ��� �ϴ� ����, ��� �ν��Ͻ��� ����
	int studentID;
	String studentName;
	int grade;
	String address;

	public P187_Student() {
		serialNum++; // �л��� ������ ������ ����
		studentID = serialNum; // ������ ���� �ν��Ͻ� ������ �ο�
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	public static int getSerialNum() { // static(Ŭ����) �޼ҵ�
		@SuppressWarnings("unused")
		int i = 10; // ���������� ��밡��
		// studentName = "������"; // ���(�ν��Ͻ�) ������ ����Ҽ�����.
		return serialNum; // static ���� ��밡��
	}

	public static void setSerialNum(int serialNum) {
		P187_Student.serialNum = serialNum;
	}

}
