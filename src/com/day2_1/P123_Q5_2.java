package com.day2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P123_Q5_2 {

	public static void main(String[] args) throws IOException {

		// 선언
		int lineCount = 0, spaceCount, starCount;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력

		do { // 한번은 무조건 실행
			System.out.print("홀수를 입력해주세요. ");
			try {
				lineCount = Integer.parseInt(br.readLine()); // 오류가 발생할수있는 코드
			} catch (NumberFormatException e) { // 오류 종류
				// 오류가 발생했을때 실행할 코드
			}
		} while (lineCount % 2 == 0 || lineCount <= 0); // 조건이 맞으면 계속 실행
		
		spaceCount = lineCount / 2;
		starCount = 1;

		// 연산, 출력
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
