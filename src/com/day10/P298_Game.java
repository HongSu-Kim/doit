package com.day10;

public class P298_Game {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);

		AdvanceLevel aLevel = new AdvanceLevel();
		player.upgradLevel(aLevel); // AdvanceLevel자료형을 가진 aLevel이 upgradLevel의 변수값 PlayerLevel 자료형으로 upcast
		player.play(2);

		SuperLevel sLevel = new SuperLevel();
		player.upgradLevel(sLevel);
		player.play(3);

	}

}
