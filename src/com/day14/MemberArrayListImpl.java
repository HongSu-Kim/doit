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
			System.out.println("�߸��Է�");
		}

		return input;

	}

	@Override
	public void printHome() throws IOException {

		System.out.print("1.ȸ������ 2,Ż�� 3.ȸ��������� 4.�˻� 5.���� 6.����: ");
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
			System.out.println("�ý����� �����մϴ�.");
			System.exit(0);
		}

	}

	@Override
	public void addMember() throws IOException {

		P407_MemberVO vo = new P407_MemberVO();

		System.out.print("�̸�? ");
		vo.setMemberName(br.readLine());

		lists.add(vo);

	}

	@Override
	public void removeMember() throws IOException {

		System.out.print("���� 1.���̵� 2.�̸� : ");
		int n = input(2);

		Iterator<P407_MemberVO> it = lists.iterator();
		while (it.hasNext()) {
			P407_MemberVO vo = it.next();

			if (n == 1) {
				System.out.print("������ ���̵� : ");
				Integer id = Integer.parseInt(br.readLine());

				if (id.equals(vo.getMemberId())) {
					lists.remove(vo);
					System.out.println("���� �Ϸ�");
					return;
				}
			} else if (n == 2) {
				System.out.print("���� �̸� : ");
				String name = br.readLine();

				if (name.equals(vo.getMemberName())) {
					lists.remove(vo);
					System.out.println("���� �Ϸ�");
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
		System.out.print("�˻� 1.���̵� 2.�̸� : ");
		int n = input(2);
		if (n == 1)
			searchId();
		else if (n == 2)
			searchName();
	}

	private void searchId() throws IOException {

		System.out.print("���̵�? ");
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

		System.out.print("�̸�? ");
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

		System.out.print("���ı��� 1.���̵� 2.�̸� : ");
		int n = input(2);
		System.out.print("���Ĺ�� 1.�������� 2.�������� : ");
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
