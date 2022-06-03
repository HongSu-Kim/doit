package com.day2_1;

public class P116_NestedLoop {

	public static void main(String[] args) {

		int dan, times;

		for (dan = 2; dan <= 9; dan++) {

			if (dan % 2 == 1)
				continue;

			for (times = 1; times <= 9; times++) {

				System.out.println(dan + "X" + times + "=" + dan * times);

			}

			System.out.println();

		}

	}

}
