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
			System.out.print("년도를 입력해주세요 : ");
			year = Integer.parseInt(br.readLine());
			y = date.setYear(year);
		} while (y == 1);
		
		do {
			System.out.print("월을 입력해주세요 : ");
			month = Integer.parseInt(br.readLine());
			m = date.setMonth(month);
		} while (m == 1);
		
		do {
			System.out.print("일을 입력해주세요 : ");
			day = Integer.parseInt(br.readLine());
			d = date.setDay(day, month, year);
		} while (d == 1);
		
		week = date.setWeek(day, month, year);
		
		System.out.printf("날짜는 %d년 %d월 %d일 %c요일 입니다.", year, month, day, week);

	}

}
