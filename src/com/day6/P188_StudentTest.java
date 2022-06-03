package com.day6;

public class P188_StudentTest {

	public static void main(String[] args) {

		P187_Student studentLee = new P187_Student();
		studentLee.setStudentName("이지원");
		System.out.println(P187_Student.getSerialNum());
		System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID);

		P187_Student studentSon = new P187_Student();
		studentSon.setStudentName("손수경");
		System.out.println(P187_Student.getSerialNum());
		System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);

	}

}
