package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P102_SwitchCase {

	public static void main(String[] args) throws IOException {

		int ranking;
		char medalColor;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("등수? ");
		ranking = Integer.parseInt(br.readLine());

		switch (ranking) {
		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = 'X';
		}
		System.out.println(ranking + "등 매달색은 " + medalColor + "입니다.");

	}

}
