package com.day10;

public abstract class PlayerLevel {

	// 추상 메소드로 만들어서 각 레벨마다 다른 작업을 하게 구현한다.
	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void swhoLevelMessage();

	// 템플릿 메소드
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
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
	}

	@Override
	public void turn() {
	}

	@Override
	public void swhoLevelMessage() {
		System.out.println("***** 초보자 레벨입니다. *****");
	}

}

class AdvanceLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프 합니다.");
	}

	@Override
	public void turn() {
	}

	@Override
	public void swhoLevelMessage() {
		System.out.println("***** 중급자 레벨입니다. *****");
	}

}

class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다.");
	}

	@Override
	public void swhoLevelMessage() {
		System.out.println("***** 고급자 레벨입니다. *****");
	}

}
