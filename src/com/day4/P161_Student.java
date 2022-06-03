package com.day4;

public class P161_Student {
	int studentID;
	private String studentName; // 접근제어자를 private으로 설정하면 다른 class, package에서 접근할 수 없다.
	P161_Subject korean;
	P161_Subject math;

	// public get() : private 변수에 접근해서 값을 가져오는 메소드
	public String getStudentName() {
		return studentName;
	}

	// public set() : private 변수에 접근해서 값을 지정하는 메소드
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
