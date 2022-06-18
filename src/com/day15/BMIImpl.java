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
			System.out.println("잘못입력");
		}

		return input;

	}

	@Override
	public void printHome() throws IOException {
		System.out.print("1.입력 2.출력 3.삭제 4.수정 5.검색 6.종료: ");
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
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
	}

	@Override
	public void bmi() {

//		pro.get(i).bmi = pro.get(i).weight / (pro.get(i).height * pro.get(i).height);
//
//		if (pro.get(i).bmi < 18.5)
//			pro.get(i).result = "저체중";
//		else if (pro.get(i).bmi < 23.0)
//			pro.get(i).result = "정상";
//		else if (pro.get(i).bmi < 25)
//			pro.get(i).result = "과체중";
//		else
//			pro.get(i).result = "비만";

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
