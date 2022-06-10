package com.day10;

public abstract class PlayerLevel {

	// �߻� �޼ҵ�� ���� �� �������� �ٸ� �۾��� �ϰ� �����Ѵ�.
	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void swhoLevelMessage();

	// ���ø� �޼ҵ�
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++)
			jump();
		turn();
	}

}

class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
	}

	@Override
	public void turn() {
	}

	@Override
	public void swhoLevelMessage() {
		System.out.println("***** �ʺ��� �����Դϴ�. *****");
	}

}

class AdvanceLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� �մϴ�.");
	}

	@Override
	public void turn() {
	}

	@Override
	public void swhoLevelMessage() {
		System.out.println("***** �߱��� �����Դϴ�. *****");
	}

}

class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�� ���� ���ϴ�.");
	}

	@Override
	public void swhoLevelMessage() {
		System.out.println("***** ����� �����Դϴ�. *****");
	}

}
