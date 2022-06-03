package com.day4;

public class P161_StudentTest {

	public static void main(String[] args) {

		P161_Student student1 = new P161_Student();
//		student1.studentName = "이상원"; // studentName의 접근제어자가 privete이기 때문에 불러올수 없어서 오류가 난다.
		student1.setStudentName("이상원"); // setStudentName() 메소드를 이용하면 private 변수에 접근할수있다.

		System.out.println(student1.getStudentName());

	}

}
