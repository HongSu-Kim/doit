package com.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberArrayListImpl implements MemberArraryList {

	private List<P407_MemberVO> lists = new ArrayList<>();

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public int input(int n) throws IOException {

		int input = 0;
		try {
			input = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
		}

		if (input < 1 || input > n) {
			System.out.println("잘못입력");
			printHome();
			return -1;
		}

		return input;

	}

	@Override
	public void printHome() throws IOException {

		System.out.print("1.회원가입 2,탈퇴 3.회원정보출력 4.검색 5.정렬 : ");
		int n = input(3);

		switch (n) {
		case 1:
			addMember();
			break;
		case 2:
			removeMember();
			break;
		case 3:
			printMemberImfo();
			break;
		case 4:
			search();
			break;
		case 5:
			sort();
			break;
		}

	}

	@Override
	public void addMember() throws IOException {

		P407_MemberVO vo = new P407_MemberVO();

		System.out.print("이름? ");
		vo.setMemberName(br.readLine());

		lists.add(vo);

		printHome();

	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void removeMember() throws IOException {

		System.out.print("삭제 : 1.아이디 2.이름 : ");
		int n = input(2);

		Iterator<P407_MemberVO> it = lists.iterator();
		while (it.hasNext()) {
			P407_MemberVO vo = it.next();

			if (n == 1) {
				System.out.print("삭제할 아이디 : ");
				Integer id = Integer.parseInt(br.readLine());

				if (id.equals(vo.getMemberId())) {
					lists.remove(id);
					System.out.println("삭제 완료");
				}
			} else {
				System.out.print("삭제 이름 : ");
				String name = br.readLine();

				if (name.equals(vo.getMemberName())) {
					lists.remove(name);
					System.out.println("삭제 완료");
				}
			}
		}

		printHome();

	}

	@Override
	public void printMemberImfo() throws IOException {

		Iterator<P407_MemberVO> it = lists.iterator();

		while (it.hasNext()) {
			P407_MemberVO ob = it.next();
			System.out.println(ob.toString());
		}

		printHome();

	}

	@Override
	public void search() throws IOException {
		System.out.print("1.아이디검색 2.이름검색 : ");
		int n = input(2);
		if (n == 1)
			searchId();
		else
			searchName();
	}

	private void searchId() throws IOException {
		System.out.print("아이디? ");
		int id = Integer.parseInt(br.readLine());
		
	}

	private void searchName() {
		
		
	}


	@Override
	public void sort() {
	}

}
