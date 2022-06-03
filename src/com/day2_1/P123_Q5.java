package com.day2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P123_Q5 {

	public static void main(String[] args) throws IOException {

		int num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num - i - 1; j++) {

				System.out.print(" ");

			}

			for (int j = 0; j < i * 2 + 1; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

		for (int i = num - 1; i > 0; i--) {

			for (int j = i; j < num; j++) {

				System.out.print(" ");

			}

			for (int j = 0; j < i * 2 - 1; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

}
