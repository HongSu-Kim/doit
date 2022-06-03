package com.day6;

public class P187_Student {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;

	public P187_Student() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	public static int getSerialNum() {
//		int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		P187_Student.serialNum = serialNum;
	}
	
}
