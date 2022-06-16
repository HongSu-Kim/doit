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
			System.out.println("�߸��Է�");
			printHome();
			return -1;
		}

		return input;

	}

	@Override
	public void printHome() throws IOException {

		System.out.print("1.ȸ������ 2,Ż�� 3.ȸ��������� 4.�˻� 5.���� : ");
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

		System.out.print("�̸�? ");
		vo.setMemberName(br.readLine());

		lists.add(vo);

		printHome();

	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void removeMember() throws IOException {

		System.out.print("���� : 1.���̵� 2.�̸� : ");
		int n = input(2);

		Iterator<P407_MemberVO> it = lists.iterator();
		while (it.hasNext()) {
			P407_MemberVO vo = it.next();

			if (n == 1) {
				System.out.print("������ ���̵� : ");
				Integer id = Integer.parseInt(br.readLine());

				if (id.equals(vo.getMemberId())) {
					lists.remove(id);
					System.out.println("���� �Ϸ�");
				}
			} else {
				System.out.print("���� �̸� : ");
				String name = br.readLine();

				if (name.equals(vo.getMemberName())) {
					lists.remove(name);
					System.out.println("���� �Ϸ�");
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
		System.out.print("1.���̵�˻� 2.�̸��˻� : ");
		int n = input(2);
		if (n == 1)
			searchId();
		else
			searchName();
	}

	private void searchId() throws IOException {
		System.out.print("���̵�? ");
		int id = Integer.parseInt(br.readLine());
		
	}

	private void searchName() {
		
		
	}


	@Override
	public void sort() {
	}

}
