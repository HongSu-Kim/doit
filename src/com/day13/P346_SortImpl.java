package com.day13;

class SortImpl implements P346_Sort {

	StringBuilder sb = new StringBuilder();
	String sortType;

	public void print() {
		System.out.println(sb);
		sb.delete(0, sb.length());
	}

	@Override
	public void write() {
		sb.append("정렬 방식을 선택하세요\n");
		sb.append("B : bubbleSort\n");
		sb.append("H : HeapSort\n");
		sb.append("Q : QuickSort");
		print();
	}

	@Override
	public void description() {
		sb.append("정렬순서를 선택하세요\n");
		sb.append("A : ascendning\n");
		sb.append("D : descending");
		print();
	}

	@Override
	public void ascendning(int[] arr) {
	}

	@Override
	public void descending(int[] arr) {
	}

	@Override
	public void err() {
		sb.append("지원되지 않는 기능입니다.");
		print();
		System.exit(0);
	}

}

class QuickSort extends SortImpl {

	String sortType = "QuickSort";

	@Override
	public void description() {
		sb.append("숫자를 정렬하는 알고리즘 " + sortType + "입니다\n");
		super.description();
	}

	@Override
	public void ascendning(int[] arr) {
		sb.append(sortType + " ascendning");
		print();
	}

	@Override
	public void descending(int[] arr) {
		sb.append(sortType + " descending");
		print();
	}

}

class HeapSort extends SortImpl {

	String sortType = "HeapSort";

	@Override
	public void description() {
		sb.append("숫자를 정렬하는 알고리즘 " + sortType + "입니다\n");
		super.description();
	}

	@Override
	public void ascendning(int[] arr) {
		sb.append(sortType + " ascendning");
		print();
	}

	@Override
	public void descending(int[] arr) {
		sb.append(sortType + " descending");
		print();
	}

}

class BubbleSort extends SortImpl {

	String sortType = "BubbleSort";

	@Override
	public void description() {
		sb.append("숫자를 정렬하는 알고리즘 " + sortType + "입니다\n");
		super.description();
	}

	@Override
	public void ascendning(int[] arr) {
		sb.append(sortType + " ascendning");
		print();
	}

	@Override
	public void descending(int[] arr) {
		sb.append(sortType + " descending");
		print();
	}

}
