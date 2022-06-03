package com.day3;

public class P144_Student {
	int studentID;
	String studentName;
	int grade;
	String address;

	public String getStudentName() {
		return studentName;
	}

	public static void main(String[] args) {

		P144_Student student1 = new P144_Student();
		student1.studentName = "¾È¿¬¼ö";
		
		System.out.println(student1.studentName);
		System.out.println(student1.getStudentName());
		System.out.println(student1);
	}

}
