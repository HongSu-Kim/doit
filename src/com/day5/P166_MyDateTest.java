package com.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P166_MyDateTest {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		P166_MyDate date = new P166_MyDate();
		int day, month, year, setDate;

		System.out.print("��¥�� �Է����ּ���(yyyy mm dd) : ");
		year = Integer.parseInt(br.readLine());
		month = Integer.parseInt(br.readLine());
		day = Integer.parseInt(br.readLine());
		setDate = date.setDate(day, month, year);

		if (setDate == 0) {
			System.out.printf("��¥�� %d�� %d�� %d�� �Դϴ�.", year, month, day);
		}

	}

}
