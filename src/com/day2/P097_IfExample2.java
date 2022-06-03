package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P097_IfExample2 {

	public static void main(String[] args) throws IOException {

		int age;
		int charge;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("나이? ");
		age = Integer.parseInt(br.readLine());

		if (age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("중,고등학생입니다.");
		} else {
			charge = 3000;
			System.out.println("성인입니다.");
		}

		System.out.println("요금은 " + charge + "원입니다.");

	}

}
