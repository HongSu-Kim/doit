package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P137_FunctionTest {

	public static void main(String[] args) throws IOException {

		int num1, num2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫번째 숫자를 입력해주세요.");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두번째 숫자를 입력해주세요.");
		num2 = Integer.parseInt(br.readLine());

		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");

	}

	public static int add(int n1, int n2) {

		int result = n1 + n2;
		return result;

	}

}
