package com.day10;

public class Player {

	private PlayerLevel level;

	public Player() { // ������ 
		level = new BeginnerLevel(); // upcasting // Player ������ beginnerLevel�� �ȴ�.
		level.swhoLevelMessage(); // ���� ������ �����
	}
	
//	public PlayerLevel getLevel() {
//		return level;
//	}

	public void upgradLevel(PlayerLevel level) { // �ڷ����� PlayerLevel�� �Ű������� �ؼ� PlayerLevel�� ��ӹ޴� Ŭ�������� �����ִ�.
		this.level = level;
		level.swhoLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
