package com.day2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P123_Q4 {

	public static void main(String[] args) throws IOException {

		int num;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num - i; j++) {

				System.out.print(" ");

			}

			for (int j = 0; j < i * 2 + 1; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

}
