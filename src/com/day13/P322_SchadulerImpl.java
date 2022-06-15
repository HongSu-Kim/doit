package com.day13;

class RoundRobin implements P322_Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
	}

}

class LeastJob implements P322_Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��� ������ ���ų� ��Ⱑ ���� ���� �������� �Ҵ��մϴ�.");
	}

}

class PriorityAlloction implements P322_Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� skill���� ���� �������� �켱������ ����մϴ�.");
	}

}
