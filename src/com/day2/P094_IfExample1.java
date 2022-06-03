package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P094_IfExample1 {

	public static void main(String[] args) throws IOException {

		int age;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("나이? ");
		age = Integer.parseInt(br.readLine());

		if (age >= 8) {
			System.out.println("학교 O");
		} else {
			System.out.println("학교 X");
		}

	}

}
