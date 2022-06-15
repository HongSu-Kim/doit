package com.day13;

import java.io.IOException;

public class P346_SortTest {

	public static void main(String[] args) throws IOException {

		int[] arr = new int[10];
		int ch;
		
		P346_Sort sort = new SortImpl(); // P346_Sort�ڷ����� ����sort�� ���� SortImpl�ڷ����� ���� �����ؼ� ����(upcast)

		sort.write(); // �������̵��� �޼ҵ�print() ����
		ch = System.in.read();
		System.in.skip(2);
		if (ch == 'B' || ch == 'b')
			sort = new BubbleSort(); // sort(�ڷ��� : P346_Sort)�� BubbleSort�ڷ����� ���� �����ؼ� ����(upcast)
		else if (ch == 'H' || ch == 'h')
			sort = new HeapSort();
		else if (ch == 'Q' || ch == 'q')
			sort = new QuickSort();
		else {
			sort.err();
		}

		sort.description();
		ch = System.in.read();
		if (ch == 'A' || ch == 'a')
			sort.ascendning(arr);
		else if (ch == 'D' || ch == 'd')
			sort.descending(arr);
		else {
			sort.err();
		}

	}

}
