package com.day10;

public class P298_Game {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);

		AdvanceLevel aLevel = new AdvanceLevel();
		player.upgradLevel(aLevel); // AdvanceLevel�ڷ����� ���� aLevel�� upgradLevel�� ������ PlayerLevel �ڷ������� upcast
		player.play(2);

		SuperLevel sLevel = new SuperLevel();
		player.upgradLevel(sLevel);
		player.play(3);

	}

}
