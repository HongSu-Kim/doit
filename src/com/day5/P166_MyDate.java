package com.day5;

@SuppressWarnings("unused")
public class P166_MyDate {
	private int day;
	private int month;
	private int year;
	int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int setDate(int day, int month, int year) {

		int i = 0;
		if (year < 0) {
			System.out.println("year 오류");
			i = 1;
		} else {
			this.year = year;
		}

		if (month < 1 || month > 12) {
			System.out.println("month 오류");
			i = 1;
		} else {
			this.month = month;
		}

		if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
			m[2] = 29;
		}
		if (day < 1 || day > m[month - 1]) {
			System.out.println("day 오류");
			i = 1;
		} else {
			this.day = day;
		}

		return i;
	}

	public int setYear(int year) {
		int i = 0;
		if (year < 0) {
			System.out.println("year 오류");
			i = 1;
		} else {
			this.year = year;
		}
		return i;

	}

	public int setMonth(int month) {
		int i = 0;
		if (month < 1 || month > 12) {
			System.out.println("month 오류");
			i = 1;
		} else {
			this.month = month;
		}
		return i;
	}

	public int setDay(int day, int month, int year) {
		int i = 0;
		if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
			m[2] = 29;
		}
		if (day < 1 || day > m[month - 1]) {
			System.out.println("day 오류");
			i = 1;
		} else {
			this.day = day;
		}
		return i;
	}

	public char setWeek(int day, int month, int year) {
		int i = 0;
		char ch[] = { '일', '월', '화', '수', '목', '금', '토' };
		i += (year - 1) * 365;
		i += (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400; // 전년도 까지의 합
		for (int j = 0; j < month - 1; j++) { // 전월 까지의 합
			i += m[j];
		}
		i += day;
		return ch[i % 7];
	}

}
