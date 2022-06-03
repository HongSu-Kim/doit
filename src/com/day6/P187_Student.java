package com.day6;

// static

public class P187_Student {
	private static int serialNum = 1000; // static(클래스) 변수 : 클래스에서 공통으로 사용 하는 변수, 모든 인스턴스가 공유
	int studentID;
	String studentName;
	int grade;
	String address;

	public P187_Student() {
		serialNum++; // 학생이 생성될 때마다 증가
		studentID = serialNum; // 증가된 값을 인스턴스 변수에 부여
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	public static int getSerialNum() { // static(클래스) 메소드
		@SuppressWarnings("unused")
		int i = 10; // 지역변수는 사용가능
		// studentName = "이지원"; // 멤버(인스턴스) 변수는 사용할수없다.
		return serialNum; // static 변수 사용가능
	}

	public static void setSerialNum(int serialNum) {
		P187_Student.serialNum = serialNum;
	}

}
