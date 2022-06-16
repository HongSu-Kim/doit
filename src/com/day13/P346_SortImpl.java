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
		sb.append("���� ����� �����ϼ���\n");
		sb.append("B : bubbleSort\n");
		sb.append("H : HeapSort\n");
		sb.append("Q : QuickSort");
		print();
	}

	@Override
	public void description() {
		sb.append("���ļ����� �����ϼ���\n");
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
		sb.append("�������� �ʴ� ����Դϴ�.");
		print();
		System.exit(0);
	}

}

class QuickSort extends SortImpl {

	String sortType = "QuickSort";

	@Override
	public void description() {
		sb.append("���ڸ� �����ϴ� �˰��� " + sortType + "�Դϴ�\n");
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
		sb.append("���ڸ� �����ϴ� �˰��� " + sortType + "�Դϴ�\n");
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
		sb.append("���ڸ� �����ϴ� �˰��� " + sortType + "�Դϴ�\n");
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
