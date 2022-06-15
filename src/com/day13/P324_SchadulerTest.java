package com.day13;

import java.io.IOException;

public class P324_SchadulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("��ȭ ��� ����� �����ϼ���");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ�");
		System.out.println("L : �����ְų� ��Ⱑ �������� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ�");

		int ch = System.in.read();
		P322_Scheduler scheduler; // P322_SchedulerŸ���� ���� scheduler�� ����(null���� ����)

		if (ch == 'R' || ch == 'r')
			scheduler = new RoundRobin(); // scheduler�� RoundRobinŸ���� ���� ����, upcast
		else if (ch == 'L' || ch == 'l')
			scheduler = new LeastJob();
		else if (ch == 'P' || ch == 'p')
			scheduler = new PriorityAlloction();
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}

		scheduler.getNextCall(); // interface�� implements�ϸ鼭 override�� �޼ҵ带 ����Ѵ�.
		scheduler.sendCallToAgent();

	}

}
