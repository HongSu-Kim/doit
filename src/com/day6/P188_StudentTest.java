package com.day6;

public class P188_StudentTest {

	public static void main(String[] args) {

		P187_Student studentLee = new P187_Student();
		studentLee.setStudentName("������"); 
		//System.out.println(P187_Student.serialNum); // ���������ڰ� private�̱� ������ get() �޼ҵ带 ���� �ҷ��;��Ѵ�.
		System.out.println(P187_Student.getSerialNum()); // static ������ Ŭ���� �̸����� ���� �����Ѵ�.
		System.out.println(studentLee.studentName + " �й� : " + studentLee.studentID);

		P187_Student studentSon = new P187_Student();
		studentSon.setStudentName("�ռ���");
		System.out.println(P187_Student.getSerialNum());
		System.out.println(studentSon.studentName + " �й� : " + studentSon.studentID);

	}

}
