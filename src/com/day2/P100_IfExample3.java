package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P100_IfExample3 {

	public static void main(String[] args) throws IOException {

		// ����
		int score;
		char grade;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �Է�
		System.out.print("����? ");
		score = Integer.parseInt(br.readLine());

		// ����
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

		// ���
		System.out.println("������ " + grade + "�Դϴ�.");

	}

}
