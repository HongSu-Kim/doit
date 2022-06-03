package com.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P166_MyDateTest2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		P166_MyDate date = new P166_MyDate();
		int day, month, year, d, m, y;
		char week; 

		do {
			System.out.print("�⵵�� �Է����ּ��� : ");
			year = Integer.parseInt(br.readLine());
			y = date.setYear(year);
		} while (y == 1);
		
		do {
			System.out.print("���� �Է����ּ��� : ");
			month = Integer.parseInt(br.readLine());
			m = date.setMonth(month);
		} while (m == 1);
		
		do {
			System.out.print("���� �Է����ּ��� : ");
			day = Integer.parseInt(br.readLine());
			d = date.setDay(day, month, year);
		} while (d == 1);
		
		week = date.setWeek(day, month, year);
		
		System.out.printf("��¥�� %d�� %d�� %d�� %c���� �Դϴ�.", year, month, day, week);

	}

}
