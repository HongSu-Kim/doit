package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P100_IfExample3 {

	public static void main(String[] args) throws IOException {

		// 선언
		int score;
		char grade;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력
		System.out.print("성적? ");
		score = Integer.parseInt(br.readLine());

		// 연산
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		// 출력
		System.out.println("성적은 " + grade + "입니다.");

	}

}
