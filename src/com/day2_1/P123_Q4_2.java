package com.day2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P123_Q4_2 {

	public static void main(String[] args) throws IOException {

		// ����
		int lineCount = 0, spaceCount, starCount;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.print("������ �Է��ؼ�����. ");
			try {
				lineCount = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
			}
		} while (lineCount <= 0);
		
		spaceCount = lineCount - 1;
		starCount = 1;

		// ����, ���
		for (int i = 0; i < lineCount; i++) {

			for (int j = 0; j < spaceCount; j++) {

				System.out.print(" ");

			}

			for (int j = 0; j < starCount; j++) {

				System.out.print("*");

			}

			spaceCount -= 1;
			starCount += 2;
			System.out.println();

		}

	}

}
