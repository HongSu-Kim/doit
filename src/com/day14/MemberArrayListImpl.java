package com.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		}

		return input;

	}

	@Override
	public void printHome() throws IOException {

		System.out.print("1.회원가입 2,탈퇴 3.회원정보출력 4.검색 5.정렬 6.종료: ");
		int n = input(6);

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
		default:
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}

	}

	@Override
	public void addMember() throws IOException {

		P407_MemberVO vo = new P407_MemberVO();

		System.out.print("이름? ");
		vo.setMemberName(br.readLine());

		lists.add(vo);

	}

	@Override
	public void removeMember() throws IOException {

		System.out.print("삭제 1.아이디 2.이름 : ");
		int n = input(2);

		Iterator<P407_MemberVO> it = lists.iterator();
		while (it.hasNext()) {
			P407_MemberVO vo = it.next();

			if (n == 1) {
				System.out.print("삭제할 아이디 : ");
				Integer id = Integer.parseInt(br.readLine());

				if (id.equals(vo.getMemberId())) {
					lists.remove(vo);
					System.out.println("삭제 완료");
					return;
				}
			} else if (n == 2) {
				System.out.print("삭제 이름 : ");
				String name = br.readLine();

				if (name.equals(vo.getMemberName())) {
					lists.remove(vo);
					System.out.println("삭제 완료");
					return;
				}

			} else {
				return;
			}
		}

	}

	@Override
	public void printMemberImfo() {

		Iterator<P407_MemberVO> it = lists.iterator();
		while (it.hasNext()) {

			P407_MemberVO vo = it.next();
			System.out.println(vo.toString());

		}

	}

	@Override
	public void search() throws IOException {
		System.out.print("검색 1.아이디 2.이름 : ");
		int n = input(2);
		if (n == 1)
			searchId();
		else if (n == 2)
			searchName();
	}

	private void searchId() throws IOException {

		System.out.print("아이디? ");
		Integer id = Integer.parseInt(br.readLine());

		Iterator<P407_MemberVO> it = lists.iterator();
		while (it.hasNext()) {

			P407_MemberVO vo = it.next();
			if (id.equals(vo.getMemberId())) {
				System.out.println(vo.toString());
				return;
			}

		}

	}

	private void searchName() throws IOException {

		System.out.print("이름? ");
		String name = br.readLine();

		Iterator<P407_MemberVO> it = lists.iterator();
		while (it.hasNext()) {
			P407_MemberVO vo = it.next();
			if (name.equals(vo.getMemberName())) {
				System.out.println(vo.toString());
				return;
			}

		}

	}

	@Override
	public void sort() throws IOException {

		System.out.print("정렬기준 1.아이디 2.이름 : ");
		int n = input(2);
		System.out.print("정렬방법 1.오름차순 2.내림차순 : ");
		int m = input(2);

		if (n == 1) {
			if (m == 1)
				ascendningSortId();
			else if (m == 2)
				descendingSortId();
		} else if (n == 2) {
			if (m == 1)
				ascendningSortName();
			else if (m == 2)
				descendingSortName();
		}
		
		printMemberImfo();

	}

	private void ascendningSortId() {

		Comparator<P407_MemberVO> comp = new Comparator<P407_MemberVO>() {
			@Override
			public int compare(P407_MemberVO vo1, P407_MemberVO vo2) {
				return vo1.getMemberId() > vo2.getMemberId() ? 1 : -1;
			}
		};

		Collections.sort(lists, comp);

	}

	private void descendingSortId() {

		Comparator<P407_MemberVO> comp = new Comparator<P407_MemberVO>() {
			@Override
			public int compare(P407_MemberVO vo1, P407_MemberVO vo2) {
				return vo1.getMemberId() < vo2.getMemberId() ? 1 : -1;
			}
		};

		Collections.sort(lists, comp);

	}

	private void ascendningSortName() {

		Comparator<P407_MemberVO> comp = new Comparator<P407_MemberVO>() {
			@Override
			public int compare(P407_MemberVO vo1, P407_MemberVO vo2) {
				return vo1.getMemberName().compareTo(vo2.getMemberName()) > 0 ? 1 : -1;
			}
		};

		Collections.sort(lists, comp);

	}

	private void descendingSortName() {

		Comparator<P407_MemberVO> comp = new Comparator<P407_MemberVO>() {
			@Override
			public int compare(P407_MemberVO vo1, P407_MemberVO vo2) {
				return vo1.getMemberName().compareTo(vo2.getMemberName()) < 0 ? 1 : -1;
			}
		};

		Collections.sort(lists, comp);

	}
}
