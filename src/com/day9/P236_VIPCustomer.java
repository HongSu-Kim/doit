package com.day9;

public class P236_VIPCustomer extends P234_Customer { // Ŭ���� ���
	// ����Ŭ���� extends ���� Ŭ����
//	private int customerID; // �ߺ�
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;

	private int agentID; // VIP ��� ������ �ʿ�
	double saleRatio;

	public P236_VIPCustomer() { // ����Ʈ ������
		// super(); // ���� Ŭ����(P234_Customer)�� �ڵ����� ȣ��
		setCustomerGrade("VIP");
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	public P236_VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		setCustomerGrade("VIP");
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	// �������̵� : ������
	@Override // �ֳ����̼�, �������̵��� �޼ҵ����� ǥ������
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio); // ������ ����
	}

	public int getAgentID() { // VIP�����׸� �ʿ�
		return agentID;
	}

	// customerName�� private�̱� ������ set()�޼ҵ带 ȣ���Ѵ�.
	// bonusPoint�� default�̱� ������ ��밡��
	public String showCustomerInfo() {
		return getCustomerName() + "���� ����� " + getCustomerGrade() + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}

	public String showVIPInfo() {
		return super.showCustomerInfo() + "��� ������ ���̵�� " + agentID + "�Դϴ�";
	}

}
