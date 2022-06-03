package com.day2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P123_Q5_2 {

	public static void main(String[] args) throws IOException {

		// ����
		int lineCount = 0, spaceCount, starCount;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �Է�

		do { // �ѹ��� ������ ����
			System.out.print("Ȧ���� �Է����ּ���. ");
			try {
				lineCount = Integer.parseInt(br.readLine()); // ������ �߻��Ҽ��ִ� �ڵ�
			} catch (NumberFormatException e) { // ���� ����
				// ������ �߻������� ������ �ڵ�
			}
		} while (lineCount % 2 == 0 || lineCount <= 0); // ������ ������ ��� ����
		
		spaceCount = lineCount / 2;
		starCount = 1;

		// ����, ���
		for (int i = 0; i < lineCount; i++) {

			for (int j = 0; j < spaceCount; j++) {

				System.out.print(" ");

			}

			for (int j = 0; j < starCount; j++) {

				System.out.print("*");

			}

			if (i < lineCount / 2) {
				spaceCount -= 1;
				starCount += 2;
			} else {
				spaceCount += 1;
				starCount -= 2;
			}

			System.out.println();

		}

	}

}
