package com.day14;

import java.io.IOException;

public interface MemberArraryList {

	public int input(int n) throws IOException; // input�� Ȯ��

	public void printHome() throws IOException; // home ���

	public void addMember() throws IOException; // ȸ������

	public void removeMember() throws IOException; // Ż��

	public void printMemberImfo() throws IOException; // ȸ���������

	public void search() throws IOException; // �˻�

	public void sort(); // ����

}
