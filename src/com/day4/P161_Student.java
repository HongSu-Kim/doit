package com.day4;

public class P161_Student {
	int studentID;
	private String studentName; // ���������ڸ� private���� �����ϸ� �ٸ� class, package���� ������ �� ����.
	P161_Subject korean;
	P161_Subject math;

	// public get() : private ������ �����ؼ� ���� �������� �޼ҵ�
	public String getStudentName() {
		return studentName;
	}

	// public set() : private ������ �����ؼ� ���� �����ϴ� �޼ҵ�
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
