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

			sum += ++num; // ����(++) �� sum�� �����Ѵ�.
			// sum += num++; ���� �� �����Ѵ�.
			// num = 1; (num <= max) �� �������־�� �Ѵ�.

		}

		System.out.println("1���� " + max + "������ ���� " + sum + "�Դϴ�.");

	}

}
