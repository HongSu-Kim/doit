package com.day10;

public class Player {

	private PlayerLevel level;

	public Player() { // 생성자 
		level = new BeginnerLevel(); // upcasting // Player 생성시 beginnerLevel이 된다.
		level.swhoLevelMessage(); // 현재 레벨을 출력함
	}
	
//	public PlayerLevel getLevel() {
//		return level;
//	}

	public void upgradLevel(PlayerLevel level) { // 자료형을 PlayerLevel을 매개변수로 해서 PlayerLevel을 상속받는 클래스들이 들어갈수있다.
		this.level = level;
		level.swhoLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
