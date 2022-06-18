package com.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BMIImpl implements BMI {

	private Map<Integer, ProfileVO> hMap = new HashMap<>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int input(int n) throws IOException {

		int input = 0;
		try {
			input = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
		}

		if (input < 1 || input > n) {
			System.out.println("�߸��Է�");
		}

		return input;

	}

	@Override
	public void printHome() throws IOException {
		System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.�˻� 6.����: ");
		int n = input(6);

		switch (n) {
		case 1:
			add();
			break;
		case 2:
			printProfile();
			break;
		case 3:
			delete();
			break;
		case 4:
			update();
			break;
		case 5:
			findName();
			break;
		default:
			System.out.println("�ý����� �����մϴ�.");
			System.exit(0);
		}
	}

	@Override
	public void bmi() {

//		pro.get(i).bmi = pro.get(i).weight / (pro.get(i).height * pro.get(i).height);
//
//		if (pro.get(i).bmi < 18.5)
//			pro.get(i).result = "��ü��";
//		else if (pro.get(i).bmi < 23.0)
//			pro.get(i).result = "����";
//		else if (pro.get(i).bmi < 25)
//			pro.get(i).result = "��ü��";
//		else
//			pro.get(i).result = "��";

	}

	@Override
	public void add() {
	}

	@Override
	public void printProfile() {
	}

	@Override
	public void delete() {
	}

	@Override
	public void update() {
	}

	@Override
	public void findName() {
	}

}
