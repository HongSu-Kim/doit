package com.day9;

public class P239_CustomerTest {

	public static void main(String[] args) {

		P234_Customer customerLee = new P234_Customer();

		customerLee.setCustomerID(10010); // customerID�� private�̱� ������ set()�޼ҵ带 ȣ���Ѵ�.
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000; // bonusPoint�� default�̱� ������ ��밡��

		System.out.println(customerLee.showCustomerInfo());

//		P236_VIPCustomer customerKim = new P236_VIPCustomer();
		P234_Customer customerKim = new P236_VIPCustomer();
		// [����Ŭ���� ������ = new ����Ŭ����]�� ���� ���·ε� �����Ҽ��ִ�.
		// �� ��� ����Ŭ������ ��������� �޼ҵ常 ȣ�� �����ϴ�.
		// �������̵��� ��� �������̵��� ����,�޼ҵ带 ȣ���Ѵ�.
		
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;

		System.out.println(customerKim.showCustomerInfo());

	}

}
