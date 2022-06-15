package com.day13;

import java.io.IOException;

public class P346_SortTest {

	public static void main(String[] args) throws IOException {

		int[] arr = new int[10];
		int ch;
		
		P346_Sort sort = new SortImpl(); // P346_Sort자료형의 변수sort를 만들어서 SortImpl자료형의 값을 생성해서 대입(upcast)

		sort.write(); // 오버라이딩된 메소드print() 실행
		ch = System.in.read();
		System.in.skip(2);
		if (ch == 'B' || ch == 'b')
			sort = new BubbleSort(); // sort(자료형 : P346_Sort)에 BubbleSort자료형의 값을 생성해서 대입(upcast)
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
