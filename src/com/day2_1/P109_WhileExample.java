package com.day2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P109_WhileExample {

	public static void main(String[] args) throws IOException {

		int num = 0, sum = 0, max;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		max = Integer.parseInt(br.readLine());

		while (num < max) {

			sum += ++num; // 증가(++) 후 sum에 대입한다.
			// sum += num++; 대입 후 증가한다.
			// num = 1; (num <= max) 로 변경해주어야 한다.

		}

		System.out.println("1부터 " + max + "까지의 합은 " + sum + "입니다.");

	}

}
