package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P097_IfExample2 {

	public static void main(String[] args) throws IOException {

		int age;
		int charge;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("����? ");
		age = Integer.parseInt(br.readLine());

		if (age < 8) {
			charge = 1000;
			System.out.println("������ �Ƶ��Դϴ�.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("��,����л��Դϴ�.");
		} else {
			charge = 3000;
			System.out.println("�����Դϴ�.");
		}

		System.out.println("����� " + charge + "���Դϴ�.");

	}

}
